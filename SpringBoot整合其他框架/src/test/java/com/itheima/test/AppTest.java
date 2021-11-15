package com.itheima.test;

import com.itheima.IntegrationApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
    @Test
    public void testOne(){
        System.out.println("SpringBoot整合Junit");
    }
}
