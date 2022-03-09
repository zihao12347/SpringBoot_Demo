package com.ithiema.starter;

/**
 * @Author yanghao
 * @Date 2022/3/3 10:00
 */

/**
 *SpringBoot能简化项目的搭建和开发过程，是基于它提供的和自动装配；
 *     起步依赖：就是将具备某些功能的依赖打包到一起，简化依赖导入过程，
 *     自动装配：无需手写xml配置文件，自动装配并且管理bean
 *          自动装配的步骤：
 *              1.基于java代码的bean配置
 *              2.自动装配的条件
 *              3.bean参数的获取
 *              4.bean的发现
 *              5.bean的加载
 *     1：基于java第代码的配置类
 *         @Configuration注解：该注解位于类上，表明当前类为一个配置类
 *         @Bean注解：位于方法上，将方法的返回值注册到容器中
 *         @Configuration注解和@Bean注解一起使用相当于创建一个语句java代码的配置类，可以用来替换xml配置文件
 *
 *     2.自动装配的条件：springBoot特有的常见的Condition条件依赖注解：
 *          @ConditionalOnBean注解：当前上下文中（spring容器中）存在某个bean时，才实例化该bean
 *          @ConditionalOnMissBean注解：当前上下文中（Spring容器中）不存在某个bean时,实例化该bean
 *
 *          @ConditionalOnClass注解：某个class位于当前类路径下，实例化该bean
 *          @ConditionalOnMissClass注解：某class不在当前类型下，实例化该bean
 *
 *          @ConditionOnExpress注解：当express表达式为true时，实例化该bean
 *          @ConditionOnNotWebApplication注解：不是web应用时实例化该bean
 *
 *          @ConditionalConfigAfter注解：某个bean在自动装配完之后，才实例化
 *          @ConditionalConfigBefore注解：某个bean在自动装配完之前，实例化
 *
 *          @ConditionalOnSignalCandidate注解：指定的bean在容器中只有一个，才实例化
 *
 *          @ConditionalOnProperties注解：配置文件中是否有对应的属性和值，才实例化bean
 *
 *    3.Bean参数的获取：
 *          @Value注解：标注在属性中，获取配置文件中的某一项参数的值，注入到配置类的属性
 *          @ConfigurationProperties(prefix="配置文件中的key")注解：
 *                     标注在类上，获取配置文件中对象格式的数据，实体类要提供setter()方法，完成映射
 *          @EnableConfigurationProperties注解：使ConfigurationPropterties注解生效
 *
 *    4.bean的发现：
 *          见AutoConfigApp
 *
 *
 *
 */
public class App {
}
