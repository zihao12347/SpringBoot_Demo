package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootConditionApplication {
    public static void main(String[] args) {
        //启动springboot工程，并返回spring的应用上下文对象
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootConditionApplication.class, args);
        //获取spring应用上下文中的已定义的bean主键
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
