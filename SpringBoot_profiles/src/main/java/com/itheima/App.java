package com.itheima;

/**
 * SpringBoot配置_Profile
 *      profile：也就是在不同环境下，使用不同配置提供一种支持，
 *                  通过激活，指定参数等方式快速实现切环境
 *
 *   Profile配置方式
 *      1.多Profile文件方式：
 *          SpringBoot的配置文件提供properties,yml两种格式文件，
 *           通过文件命名形式区分不同环境的配置。
 *
 *          *文件命名格式：application-{profile}.properties/yml
 *          application.properties 主配置文件
 *          application-dev.properties/yml 开发环境
 *          application-test.properties/yml 测试环境
 *          application-pro.properties/yml 生成环境
 *      2.多profiles文档块方式：
 *            在yml配置文件中，使用“ --- ”符号把配置文件分割成多个不同的文档块。
 *            可以在不同的文档块中，针对不同的环境进行不同的配置，
 *              给文档块命名：
 *                 spring:
 *                     profiles: {profile}
 *              在第一个文档块中，对配置实现激活:
 *                  spring:
 *                      profiles:
 *                          active: {profile}
 *   Profiles的激活方式：
 *      1.在配置文件中激活
 *          spring.profiles.active: {profile}
 *      2.命令行激活：-- + 激活命令
 *            (java -jar **.jar) --spring.profiles.active={profile}
 *      3.虚拟机激活: -D+激活命令
 *           (java -jar)  -Dspring.profiles.active={profile} (**.jar))
 *
 *
 *
 *
 *
 *
 *
 */
public interface App {
}
