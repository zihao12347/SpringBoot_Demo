package com.itheima.test;

import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTemplateTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedisTemplateAdd() {
        //保存一个string类型的数据
        redisTemplate.opsForValue().set("name","zihao");
    }

    @Test
    public void testRedisTemplateGet() {
        //获取保存的string类型的数据
        String name = (String) redisTemplate.opsForValue().get("name");
        System.out.println(name);
    }
}
