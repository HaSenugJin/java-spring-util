package shop.mtcoding.projoctbodykey._core.errors.exception;

import org.springframework.http.HttpStatus;
import shop.mtcoding.projoctbodykey._core.utils.ApiUtil;

public class Exception404 extends RuntimeException {
    public Exception404(String msg) {
        super(msg);
    }

    public ApiUtil<?> body() {
        return ApiUtil.error(getMessage(), HttpStatus.NOT_FOUND);
    }

    public HttpStatus status() {
        return HttpStatus.NOT_FOUND;
    }
}