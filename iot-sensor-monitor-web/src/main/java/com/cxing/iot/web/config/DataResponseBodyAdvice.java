/**
 * 2018/6/3
 */

package com.cxing.iot.web.config;

import com.cxing.iot.model.ResultGenerator;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author (changxu.xcx)
 * @version 1.0.0
 * @since 1.0.0
 */
@ControllerAdvice
public class DataResponseBodyAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class selectedConverterType, ServerHttpRequest request,
                                  ServerHttpResponse response) {

        if(returnType.hasParameterAnnotation(ExceptionHandler.class)) {
            return body;
        } else {
            return ResultGenerator.genSuccessResult(body);
        }
    }
}
