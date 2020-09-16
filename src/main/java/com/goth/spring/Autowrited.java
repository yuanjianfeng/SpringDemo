package com.goth.spring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义实现大autowrited 注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.METHOD}) //三种类型,属性列使用 ，构造方法使用，普通方法使用
public @interface Autowrited {

    String value() default "";

}
