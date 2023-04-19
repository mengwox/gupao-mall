package org.mawenhao.goods.error;

import org.mawenhao.common.Resp;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Servlet;

/**
 * 全局异常处理器
 *
 * @author mawenhao 2023/4/19
 */
@Order()
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@ConditionalOnClass({Servlet.class, DispatcherServlet.class})
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 请求参数不合法
     *
     * @param e MethodArgumentNotValidException
     * @return 异常提示
     */
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Resp<String> handleException(MethodArgumentNotValidException e) {
        return handleError(e.getBindingResult());
    }

    /**
     * 兜底异常
     *
     * @param e Exception
     * @return 异常提示
     */
    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Resp<String> handleException(Exception e) {
        return Resp.fail("服务器异常：" + e.getMessage());
    }

    private Resp<String> handleError(BindingResult bindingResult) {
        FieldError error = bindingResult.getFieldError();
        String msg = "请求参数绑定错误";
        if (error != null) {
            msg = msg + String.format(">>>%s:%s", error.getField(), error.getDefaultMessage());
        }
        return Resp.fail(msg);
    }
}

