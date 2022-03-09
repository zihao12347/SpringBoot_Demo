package com.starter.logger.interceptor;

import com.starter.logger.anno.MyLogger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author yanghao
 * @Date 2022/3/8 18:22
 */

/**
 * 自定义日志拦截器：继承HandleInterceptorAdaptor拦截器类
 *       *HandleInterceptorAdaptor类是HandleInterceptor控制器接口的一个抽象实现类
 *       使用springMVC的拦截器处理日志记录，权限管理，性能监控等
 *
 */
public class MyLogInterceptor extends HandlerInterceptorAdapter {
    //使用TheadLocal存储
    private static final ThreadLocal<Long> startThreadLocal=new ThreadLocal<>();
    /**
     * 预处理方法
     * @param request
     * @param response
     * @param handler 被调用的处理器对象（handler），本质是控制器的方法对象
     * @return  true 放行，false结束
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod=(HandlerMethod) handler;
        Method method = handlerMethod.getMethod();//获取被拦截的方法对象
        MyLogger annotation = method.getAnnotation(MyLogger.class);//获取方法上的注解
        if (annotation != null) {
            //对方法上添加了@MyLog注解，需要进行日志记录
            Long startTime=System.currentTimeMillis();//获取操作当前方法的时间
            startThreadLocal.set(startTime);
        }

        return true;
    }

    /**
     * 后置处理方法
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        HandlerMethod handlerMethod=(HandlerMethod) handler;
        Method method = handlerMethod.getMethod();//获取控制器方法对象
        MyLogger myLogger = method.getAnnotation(MyLogger.class);//获取方法添加的注解
        if (myLogger != null) {
            long endTime = System.currentTimeMillis();
            Long startTime = startThreadLocal.get();
            long optTime = endTime - startTime;//获取操作时长
            String requestURI = request.getRequestURI();//获取请求uri
            String methodName = method.getDeclaringClass() + "." + method.getName();//获取方法名称
            String desc = myLogger.desc();
            System.out.println("请求uri"+requestURI);
            System.out.println("请求方法"+methodName);
            System.out.println("方法描述"+desc);
            System.out.println("方法执行时间"+optTime);


        }
    }
}
