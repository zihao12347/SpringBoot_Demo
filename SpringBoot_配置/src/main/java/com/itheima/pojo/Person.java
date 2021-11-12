package com.itheima.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 使用lombok提供的@Data注解：为该的属性，提供getter/setter,重写ToString,hashcode,equals等方法
 */
@Data

/**
 * @ConfigurationProperties(prefix="配置文件中key的前缀")注解：用于获取配置文件中的数据；
 *      prefix属性：指定获取数据的名称：
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;
}
