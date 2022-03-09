package com.ithiema.starter;

/**
 * @Author yanghao
 * @Date 2022/3/4 11:48
 */

/**
 * SpringBoot自动装配：
 *    4.bean的发现：
 *       1.默认发现：
 *          SpringBoot默认扫描启动类所在的包以及子包的所有组件，但是不扫描依赖jar包下的组件，
 *       2.依赖包中的bean发现：
 *          在启动类上，会加入SpringBootApplication注解，组合元注解
 *             1)元注解：用于描述注解的注解
 *                  @Target注解：指定注解能在哪里使用（成员变量，方法，类）
 *                  @Retantion注解：指定存活时间（声明周期）
 *                  @Inherited注解：自定义注解可以被子类继承
 *                  @Documented注解：该注解会出现在api文档里面
 *             2)
 *              1.@SpringBootConfiguration注解（底层被@Configuration修饰）：被注解的类为一个配置类
 *              2.@EnableAutoConfiguration注解（自动装配的核心注解）：开启SpringBoot自动装配的功能，底层借助@Import注解的支持，注册依赖包相关的bean
 *                  @Import注解：通过导入AutoConfigurationImportSelector类，通过该类给容器导入自动装配组件，
 *                  AutoConfigurationImportSelector类的getCandidateConfigurations()方法：根据spring Factories机制，
 *                  调用了SpringFactoriesLoader类的LoaderFactoryNames()方法
 *                  LoaderFactoryNames()方法会从所有的jar包中读取MATA-INFO目录下的spring.factories文件中的bean全类名，然后springboot就可以加载到这些
 *                  bean,完成实例化
 *
 *                   *@Import注解：导入其他配置类
 *                   *@EnableXxx注解：底层是借助@Import注解实现bean的动态加载
 *                   *SpringFactories机制：SpringBoot自动装配是基于Spring Factories 机制实现的，
 *                                        Spring Factories机制是Springboot的一种服务发现机制，Spring Boot会自动扫描jar包下MATA-INFO目录下的spring.factories文件
 *                                        中的bean类类名数据，进行实例化。这种机制也是springboot starter的基础
 *              3.@ComponentScan注解：指定Spring容器在初始化时需要扫描的包
 *
 *
 */
public class AutoConfigApp {
}
