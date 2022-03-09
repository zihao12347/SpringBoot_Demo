package com.starter.config;

import com.starter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author yanghao
 * @Date 2022/3/8 16:37
 */

/**
 *  配置类，基于java代码实现的bean配置
 */
@Configuration
@EnableConfigurationProperties({HelloProperties.class})//使得HelloProperties配置属性类生效
public class HelloServiceAutoConfiguration {
    private HelloProperties helloProperties;

    /**
     * 通过构造方法注入配置属性对象
     * @param helloProperties
     */
    public HelloServiceAutoConfiguration(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    /**
     * 实例化，并将HelloService注入到容器，
     * @return
     */
    @Bean
    @ConditionalOnMissingBean //当容器中不存在某个bean才实例化
    public HelloService helloService(){
       return new HelloService(helloProperties.getName(), helloProperties.getAddress());
    }
}
