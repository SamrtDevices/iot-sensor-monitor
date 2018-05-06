/**
 * 2018/5/5
 */

package com.xhtw.boot.web.mvc.annt;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotated;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.mvc.method.annotation.AbstractMessageConverterMethodProcessor;

import java.util.List;

/**
 * @author (changxu.xcx)
 * @version 1.0.0
 * @since 1.0.0
 */
public class MfdcResponseBodyMethodProcessor extends AbstractMessageConverterMethodProcessor {
    protected MfdcResponseBodyMethodProcessor(List<HttpMessageConverter<?>> converters) {
        super(converters);
    }

    protected MfdcResponseBodyMethodProcessor(List<HttpMessageConverter<?>> converters, ContentNegotiationManager contentNegotiationManager) {
        super(converters, contentNegotiationManager);
    }

    protected MfdcResponseBodyMethodProcessor(List<HttpMessageConverter<?>> converters, ContentNegotiationManager manager, List<Object> requestResponseBodyAdvice) {
        super(converters, manager, requestResponseBodyAdvice);
    }

    public boolean supportsParameter(MethodParameter methodParameter) {
        return false;
    }

    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        return null;
    }

    public boolean supportsReturnType(MethodParameter returnType) {
        return (AnnotatedElementUtils.hasAnnotation(returnType.getContainingClass(), CosmoResponseBody.class)
                || returnType.hasMethodAnnotation(CosmoResponseBody.class));
    }

    public void handleReturnValue(Object o, MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest) throws Exception {

    }
}
