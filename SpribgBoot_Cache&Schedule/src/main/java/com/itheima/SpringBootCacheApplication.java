package com.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @EnableCaching注解：开启基于注解的缓存
 * @EnableScheduling注解：开启基于注解的定时任务
 */
@EnableCaching
@EnableScheduling
@SpringBootApplication
@MapperScan("com.itheima.cache.mapper")
public class SpringBootCacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCacheApplication.class);
    }
}
