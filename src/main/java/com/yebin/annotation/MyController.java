package com.yebin.annotation;

import java.lang.annotation.*;

/**
 * @author 17611
 * @version 1.0
 * @className MyController
 * @description 自定义controller注解
 * @date 2019/4/9 14:10
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {
    /**
     * 表示给controller注册别名
     * @return
     */
      String value() default "";

}
