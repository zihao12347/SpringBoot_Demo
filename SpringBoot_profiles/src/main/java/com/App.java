package com;

/**SpringBoot项目内部配置文件加载顺序：
 *      SpringBoot项目通常会加载resources类路径下的配置文件，但是这并不是意味着就只能加载resources下的配置文件。
 *      SpringBoot项目在启动的时候，会扫描5个位置下的配置文件。
 *       优先级 高->低
 *          1.file:config/* 中的配置文件
 *          2.file:config/子包/* 的子包中的配置文件
 *          3.file:*
 *          4.classpath:config/
 *          5.classpath:*
 *              file:当前项目的根路径，但是项目根路径下的配置文件，不会被打包
 *              classpath:resources中的配置文件
 * SpringBoot项目除了加载内部配置，还可以加载一些位于外部的配置文件。
 *      1.项目打包后，在命令行中指定配置参数
 *          java -jar 项目.jar --{配置属性}
 *      2.项目打包后，加载指定位置的外部配置
 *          java -jar 项目.jar --spring.config.location=配置全路径
 *      3.在存放项目的包中，放一个配置文件，项目启动时，会默认加载该配置文件
 *
 *
 *
 */
public class App {
}
