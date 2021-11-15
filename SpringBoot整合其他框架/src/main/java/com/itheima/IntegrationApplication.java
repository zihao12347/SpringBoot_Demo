package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class IntegrationApplication {
    public static void main(String[] args) {
        //启动springboot应用，并返回spring的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(IntegrationApplication.class, args);
        //获取容器中所有已定义的bean组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
