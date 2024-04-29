package shop.mtcoding.projoctbodykey._core.errors.exception;

import org.springframework.http.HttpStatus;
import shop.mtcoding.projoctbodykey._core.utils.ApiUtil;

public class Exception500 extends RuntimeException {

    public Exception500(String message) {
        super(message);
    }

    public ApiUtil<?> body() {
        return ApiUtil.error("server error", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public HttpStatus status(){
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}