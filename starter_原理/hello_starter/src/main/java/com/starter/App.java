package com.starter;

/**
 * @Author yanghao
 * @Date 2022/3/8 16:36
 */

/**
 * 编写自定义Starter
 *   1.配置pom文件，继承springboot的父工程依赖，并导入spring-boot-autoConfigure包
 *   2.编写属性配置类
 *   3.编写配置类，使属性配置类生效
 *   4.在resources目录下创建:META-INF目录，并创建spring.factories文件
 *      org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
 *      bean的全类名
 */
public class App {
}
