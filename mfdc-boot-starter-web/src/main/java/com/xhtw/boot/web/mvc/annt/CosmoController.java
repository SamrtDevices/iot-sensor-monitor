/**
 * 2018/5/5
 */

package com.xhtw.boot.web.mvc.annt;

import org.springframework.stereotype.Controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author (changxu.xcx)
 * @version 1.0.0
 * @since 1.0.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Controller
@CosmoResponseBody
public @interface CosmoController {
    String value() default "";
}
