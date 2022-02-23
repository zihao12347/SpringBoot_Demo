package com.itheima.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 自定义condition注解
 */
@Target({ElementType.TYPE, ElementType.METHOD})//@Target注解：当前注解类的注解范围：类上,方法上
@Retention(RetentionPolicy.RUNTIME)//@Retention注解：注解保留时间
@Documented//@Documented注解：生成Javadoc文档
@Conditional(ClassCondition.class)
public @interface MyConditionOnClass {
    String[] value();
}
