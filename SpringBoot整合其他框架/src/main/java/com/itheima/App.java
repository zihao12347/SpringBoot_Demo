package com.itheima;

/**
 * SpringBoot整合其他技术：
 *    一：SpringBoot整合Junit：
 *       1.引入spring-boot-starter-test起步依赖
 *       2.在test目录下，创建测试类：
 *          @RunWith(SpringRunner.class)
 *          @SpringBootTest
 *          *当测试类的包路径，与引导类所在包路径不一致时，
 *          @SpringBootTest(classes=引导类.class)
 *    二：Spring整合redis
 *        1.导入spring-boot-starter-data-redis起步依赖
 *        2.配置redis连接信息：
 *              1.当连接本地默认6379端口的redis，springboot工程会自动连接本地redis
 *              2.当连接其他服务中的redis，需要配置连接信息
 *        2.使用Spring提供的RedisTemplate模板对象
 *    三：Spring整合mybatis
 *          1.导入mybatis的起步依赖，和mysql的连接驱动
 *              mybatis-spring-boot-starter
 *          2.1在配置yml文件中,配置连接数据库信息
 *          2.2配置mybatis的相关信息
 *              mybatis:
 *                  config-location：配置mybatis主配置文件
 *                  mapper-location：配置mapper映射文件
 *                  type-aliases-location：配置pojo实体类别名扫描
 *          3.@Mapper注解，标注在mapper接口中，表示该接口为mybatis的mapper接口
 *              会被springboot工程自动扫描加载到spring容器中
 *
 */
public class App {

}
