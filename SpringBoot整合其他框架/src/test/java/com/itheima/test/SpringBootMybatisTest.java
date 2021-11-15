package com.itheima.test;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.mapper.UserXmlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * SpringBoot整合mybatis
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserXmlMapper userXmlMapper;
    @Test
    public void findAllAnno(){
        List<User> userList = userMapper.findAll();
        userList.forEach(System.out::println);
    }
    @Test
    public void findAllXml(){
        List<User> all = userXmlMapper.findAll();
        all.forEach(System.out::println);
    }
}
