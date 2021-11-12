package com.itheima.controller;

import com.itheima.pojo.Person;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InitController {
    /**
     * 一：通过@value注解获取配置文件中的数据
     */
    //获取配置文件中单个值
    @Value("${name}")
    private String name;
    //获取对象格式的数据的属性值
    @Value("${personOne.name}")
    private String pname;

    //获取纯量格式
    @Value("${msgTwo}")
    private String hello;

    /**
     * 二：通过environment对象获取配置文件中的所有的数据
     */
    @Autowired
    private Environment environment;

    @Autowired
    private Person person;



    @RequestMapping("/init")
    public String init(){
        return "SpringBoot Init！";
    }

    /**
     * 获取配置文件中的值
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        System.out.println(hello);

        System.out.println("==================");

        System.out.println(environment.getProperty("name"));
        System.out.println(environment.getProperty("addressOne"));

        System.out.println("===================");
        System.out.println(person);
        return " "+pname ;
    }
}
