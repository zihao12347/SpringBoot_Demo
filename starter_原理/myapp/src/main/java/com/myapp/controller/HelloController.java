package com.myapp.controller;

import com.starter.logger.anno.MyLogger;
import com.starter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yanghao
 * @Date 2022/3/8 17:11
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/say")
    @MyLogger(desc = "sayHello")
    public String sayHello(){
        return helloService.sayHello();
    }

}
