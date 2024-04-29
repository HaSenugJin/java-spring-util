package shop.mtcoding.projoctbodykey._core.errors.exception;

import org.springframework.http.HttpStatus;
import shop.mtcoding.projoctbodykey._core.utils.ApiUtil;

public class Exception401 extends RuntimeException {

    public Exception401(String msg) {
        super(msg);
    }

    public ApiUtil<?> body() {
        return ApiUtil.error(getMessage(), HttpStatus.UNAUTHORIZED);
    }

    public HttpStatus status() {
        return HttpStatus.UNAUTHORIZED;
    }
}