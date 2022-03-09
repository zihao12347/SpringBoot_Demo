package com.starter.logger.config;

/**
 * @Author yanghao
 * @Date 2022/3/9 14:20
 */

import com.starter.logger.anno.MyLogger;
import com.starter.logger.interceptor.MyLogInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 自动配置类:用于自动配置拦截器，参数解析器等web组件
 *    mvc自动配置类，实现webMVCConfiguror接口
 */
@Configuration
public class MyLoggerAutoConfigration implements WebMvcConfigurer {
    /**
     * 注册自定义的拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyLogInterceptor());
    }

}
