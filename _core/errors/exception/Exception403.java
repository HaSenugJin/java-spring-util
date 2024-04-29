package shop.mtcoding.projoctbodykey._core.errors.exception;

import org.springframework.http.HttpStatus;
import shop.mtcoding.projoctbodykey._core.utils.ApiUtil;

public class Exception403 extends RuntimeException {

    public Exception403(String msg) {
        super(msg);
    }

    public ApiUtil<?> body() {
        return ApiUtil.error(getMessage(), HttpStatus.FORBIDDEN);
    }

    public HttpStatus status() {
        return HttpStatus.FORBIDDEN;
    }
}