package com.goth.spring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description 自定义注释类
 * @Author yuan.jianfeng
 * @Date 2020/9/16  11:10 上午
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Componet {

    String value() default "";
}
