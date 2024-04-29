package shop.mtcoding.projoctbodykey._core.errors.exception;

import org.springframework.http.HttpStatus;
import shop.mtcoding.projoctbodykey._core.utils.ApiUtil;

public class Exception400 extends RuntimeException {

    public Exception400(String msg) {
        super(msg);
    }

    public ApiUtil<?> body() {
        return ApiUtil.error(getMessage(), HttpStatus.BAD_REQUEST);
    }

    public HttpStatus status() {
        return HttpStatus.BAD_REQUEST;
    }
}