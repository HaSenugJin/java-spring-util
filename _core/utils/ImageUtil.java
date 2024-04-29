package shop.mtcoding.projoctbodykey._core.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

public class ImageUtil {

    /**
     * 이미지를 지정된 너비와 높이로 조정하는 메서드
     *
     * @param imageFile   조정할 이미지 파일
     * @param targetWidth 원하는 이미지의 너비
     * @param targetHeight 원하는 이미지의 높이
     * @return 조정된 이미지를 바이트 배열로 반환
     * @throws IOException 이미지 조정 중 발생한 IO 예외
     */
    public static String resizeImage(String img, MultipartFile imageFile, int targetWidth, int targetHeight) throws IOException {
        if (imageFile == null) {
            return null;
        }

        // MultipartFile을 BufferedImage로 변환
        BufferedImage originalImage = ImageIO.read(new ByteArrayInputStream(imageFile.getBytes()));

        // 이미지를 지정된 크기로 조정
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);

        // 조정된 이미지를 BufferedImage로 다시 변환
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);

        // 조정된 이미지를 바이트 배열로 변환하여 반환
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(outputImage, "jpg", outputStream);

        String imgUUID = UUID.randomUUID() + "_" + img;
        Path imgPaths = Paths.get("./upload/" + imgUUID);
        Files.write(imgPaths, outputStream.toByteArray());

        return imgUUID;
    }
}
