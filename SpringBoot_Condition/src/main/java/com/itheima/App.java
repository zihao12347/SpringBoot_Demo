package com.itheima;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**一：Spring Condition条件
 *         Condition是由spring4.0之后引入的条件配置化接口，
 *         可以通过实现Condition接口，有条件的的加载相应的bean组件到spring IOC容器中
 *         自定义条件注册：
 *           1.实现Condition接口，重新matches(context,metadata)方法，boolean类型的返回值，是否注将某组件册到容器中
 *                  context参数：上下文对象，可以获取environment环境对象,ioc容器，
 *                  metadata参数：注解元对象，可以获取注解类中属性值，判断一个类是否为注解类
 *
 *          2.在初始化bean时，使用@Conditional(条件类.class)注解
 *
 *      SpringBoot提供的常用组件条件注册注解；
 *          1.ConditionOnProperty：判断配置文件中是否有对应的属性和值，才注册bean
 *          2.ConditionOnClass：判断环境中是否有对应的.class字节码文件，才注册bean
 *          3.ConditionOnMissingClass：判断环境中是否没有对应的.class字节码文件，才注册bean
 * 二：SpringBoot切换内置的web服务器：
 *      SpringBoot的web环境中默认使用的是tomcat服务器作为内置服务器，其实SpringBoot提供了多种内置服务器。
 *              tomcat,jetty,undertow
 *
 *三：SpringBoot自动配置：@Enable*注解
 *          SpringBoot中提供了许多@Enable开头的注解，这些注解都是动态获取第三方jar包中的bean组件。底层原理实现使用的是@Import注解，
 *          导入一些配置类，实现bean动态的加载。
 *
 *
 *
 */
public class App {

}
