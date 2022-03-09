package com.itheima.lombok;

/**
 * @Author yanghao
 * @Date 2022/3/9 15:02
 */


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *Lombok是开源的代码生成库，以简单的注解形式简化java类中的大量样版代码，lombok能通过注解的方式，在编译时期
 *      自动为属性生成构造器。getter/setter,equls,hashcode,toString方法。
 *      1.在安装lombok插件
 *      2.引入lombok依赖
 *      3.使用lombok常用注解
 *   Lombok常用注解：
 *        @Getter注解：标注在类/属性上，为属性生成Getter()方法
 *        @Setter注解：标注在类/属性上，生成Setter()方法
 *        @ToString注解：标注在类上，生成toString()方法
 *        @EqualsAndHashcode注解：标注在类上，生成toString()和HashCode()方法
 *        @NoArgsContructor注解，标注在类上，生成无参构造器
 *        @AllArgsContructor注解：标注在类上，生成全参构造器
 *        @Data注解：标注在类上，为该类的属性生成Setter/Getter,toString,hashCode,equals方法
 *        @Slf4j注解：标注在类上，生成Logger变量,用于记录日志
 *        @Builder注解：标注在类上，将类转变成构造者模式
 *
 */
public class app {
}
