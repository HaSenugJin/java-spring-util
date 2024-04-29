package shop.mtcoding.projoctbodykey._core.errors;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import shop.mtcoding.projoctbodykey._core.errors.exception.*;
import shop.mtcoding.projoctbodykey._core.utils.ApiUtil;

@Slf4j
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception400.class)
    public ResponseEntity<?> ex400(Exception400 e) {

        return new ResponseEntity<>(e.body(), e.status());
    }

    @ExceptionHandler(Exception401.class)
    public ResponseEntity<?> ex401(Exception401 e) {

        return new ResponseEntity<>(e.body(), e.status());
    }

    @ExceptionHandler(Exception403.class)
    public ResponseEntity<?> ex403(Exception403 e) {

        return new ResponseEntity<>(e.body(), e.status());
    }

    @ExceptionHandler(Exception404.class)
    public ResponseEntity<?> ex404(Exception404 e) {

        return new ResponseEntity<>(e.body(), e.status());
    }

    @ExceptionHandler(Exception500.class)
    public ResponseEntity<?> ex500(Exception500 e) {
        log.error(e.getMessage());

        return new ResponseEntity<>(e.body(), e.status());
    }

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<?> unknownServerError(Exception e){
//        log.error(e.getMessage());
//        ApiUtil<?> apiResult = ApiUtil.error("unknown server error", HttpStatus.INTERNAL_SERVER_ERROR);
//        return new ResponseEntity<>(apiResult, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
}
