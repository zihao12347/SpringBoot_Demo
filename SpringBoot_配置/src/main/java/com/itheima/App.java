package com.itheima;

/**
 * SpringBoot配置：
 *        SpringBoot工程能进行自动配置spring和需要的组件。
 *        它是基于约定的配置，许多配置都有默认值，自己也可以创建配置文件修改其默认值:
 *       *配置类型
 *          1: .properties后缀名的配置文件。
 *                  键值对类型的文件
 *          2: .yml(yaml)后缀的配置文件。
 *                  值前面必须有空格，大小写敏感，
 *                  使用缩进表示层级关系，
 *                  注释符号：#
 *                  *yml数据格式
 *                  1.对象：
 *                   person:
 *                      name: zhangsan
 *                   #行内写法
 *                   person: {name: zhangsan}
 *                  2.数组：
 *                   address:
 *                      -beijing
 *                      -nanchang
 *                   #行内写法
 *                   address: [ bingjing, shanghai]
 *                  3.纯量
 *                    msgOne: 'Hello \n World!' #单引号忽略转义字符
 *                    msgTow: "Hello \n World!" #双引号可识别转义字符
 *                  4.参数引用符：${}
 *
 *              3获取配置文件中的数据：（3种）
 *                  1.@value("${}")注解获取：标注在属性上，只能获取配置文件中某一项的值
 *
 *                  2.@ConfigurationProperties(prefix="配置文件中的key")注解获取：标注在类上
 *                              可以获取配置文件中对象格式的数据，
 *                             实体类提供setter方法， 并自动与实体类进行映射
 *
 *                  3.通过Environment对象：获取配置文件中所有的数据
 *
 *        默认的配置文件名称；
 *              application
 *        springboot默认会在resources目录下，加载自定义的配置文件。
 *
 *        *配置文件加载优先级：
 *              在同一级目录下加载配置文件的优先级：
 *                  properties>yml>yaml
 *
 *
 */
public class App {
}
