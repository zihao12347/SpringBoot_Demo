package com.starter.service;

import org.springframework.stereotype.Service;

/**
 * @Author yanghao
 * @Date 2022/3/8 16:34
 */
@Service
public class HelloService {
    private String name;
    private String address;

    public HelloService(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String sayHello(){
        return "您好！我的名字叫"+name+"，我来自"+address;
    }
}
