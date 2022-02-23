package com.itheima;

/**
 * Springboot的定时任务实现：
 *      方式一：Quartz: Quartz的使用非常广泛，它是一个强大的调度器，但是使用非常麻烦
 *      方式二：Spring3.0版本后自带的定时任务schedule，资源包为spring-context-support,
 *              schedule只适合做简单的计划任务，不能做分布式集群的计划任务，开发简单，
 *       Scheduled定时任务：
 *            1：导入spring-context-support依赖
 *            2：在启动类/配置类上使用@EnableScheduling注解，开启scheduled定时任务
 *            3：在目标方法上使用@scheduled注解,开启定时任务
 */
public class ScheduledApp {
}
