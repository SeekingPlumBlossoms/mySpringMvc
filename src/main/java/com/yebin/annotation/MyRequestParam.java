package com.yebin.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRequestParam {
    /**
     * 参数别名
     * @return
     */
    String value();
}
