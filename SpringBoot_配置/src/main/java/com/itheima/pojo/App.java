package com.itheima.pojo;

/**
 * lombok插件的基本使用：
 *      lombok能减化java代码，提高开发效率。
 *      例如javaBean，需要花大量时间去从写getter/setter/toString等方法，
 *      使用lombok提供的注解，在编译时自动为属性生成构造器，getter/setter，equals,hashcode,toString等方法
 *      省去手动创建这些方法代码的麻烦。
 *      实现步骤：
 *          1.引入lombok坐标依赖
 *      注解；
 *          @Getter/@Setter注解：作用在类上，为所有的属性生成getter/setter方法。
 *          @ToString注解：作用类上，覆盖默认的toString方法。
 *              exclude属性：指定排除某些字段。
 *          @EqualsAndHashCode注解：作用在类上，覆盖默认的hashcode和equals方法
 *          @NonNull注解：作用在属性和参数上，表示改属性不能为null,否则抛出异常
 *
 *          @NoArgsConstructor注解：生成无参构造方法
 *          @RequiredContructor注解：生成包含final和@NonNull注解标注的属性的构造方法
 *          @AllArgsConstructor注解：生成全参构造方法
 *
 *          @Data注解：作用在类上，是@Getter/@Setter，@ToString,@EqualsAndHashCode，@RequireArgsConstructor注解的集合。
 *
 *
 *
 *
 *
 *
 */
public class App {
}
