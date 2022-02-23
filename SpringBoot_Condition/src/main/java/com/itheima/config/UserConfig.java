package com.itheima.config;

import com.itheima.condition.MyConditionOnClass;
import com.itheima.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 配置类，实现有条件的注册user组件到spring容器中
 */
@Configuration
public class UserConfig {

    /**有条件的注册组件到spring容器中
     * 当导入了jedis依赖，才注入user组件到spring容器中
     * @return
     */
    @Bean
    /**
     * @Conditional注解，spring提供的有条件配置化的注解
     */
    //@Conditional(ClassCondition.class)
    @MyConditionOnClass({"org.springframework.data.redis.core.RedisTemplate"})//自定义的注解
    public User user(){
        return new User();
    }
}
