package com.yebin.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface MyRequestMapping {
    /**
     * 请求url
     * @return
     */
    String value() default "";

}
