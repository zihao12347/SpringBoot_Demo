package com.itheima;

/**
 *  SpringBoot缓存:
 *  一:
 *      JSR(Java Specification Request)107:java规范请求关于如何使用缓存的规范
 *  二:
 *      2.1Spring的缓存抽象:
 *          Spring从3.1开始定义了org.springframework.cache.Cache和org.springframework.CacheManager接口
 *          来统一不同的缓存技术,并使用javaCaching(JSR107)注解简化缓存开发\
 *
 *          Spring Cache只负责维护抽象层,具体实现由自己的技术选型(ehcache/redis)来决定,将缓存处理和缓存技术解耦合.
 *
 *        2.2执行流程:
 *              每次调用缓存功能的方法时,spring会检查指定参数的目标方法(查询数据库的方法)是否已经被调用过,
 *              是:直接从缓存中获取数据
 *              否:先调用目标方法(查询数据库方法),并缓存查询结果,再将缓存结果返回给用户,下次调用时,直接从缓存中获取结果数据
 *       2.3缓存关注:
 *              1.确定哪些方法需要被缓存:
 *                  查询方法,查询结果数据经常被查询,但是不经常被修改,并查询数据对结果影响不大.
 *              2.缓存策略:
 *                  缓存数据格式:<key,value>
 *       2.4相关接口:
 *          Cache:缓存抽象的规范接口:缓存实现有:redisCache,EhCache
 *                *Ehcache:纯java的进程内缓存框架,是hibernate默认的CacheProvider,使用快速简单.
 *                         ehcache直接在jvm虚拟机中缓存,速度快,效率高,
 *                         ehcache缓存数据有两级为内存和磁盘,缓存数据会在虚拟机重启的过程中写入磁盘.
 *                         ehcache不方便分布式集群
 *          CacheManager:缓存管理器,管理Cache生命周期
 *
 *  三:  Spring的声明式缓存使用:
 *          1.导入依赖(使用caffeine作为具体的缓存实现，对操作结果进行缓存)
 *              1.spring-boot-starter-cache
 *              2.caffeine
 *
 *          2缓存声明的注解:
 *              1.@Cacheable注解:标注中查询数据的方法上,先从缓存中获取数据,如果没有则调用目标查询方法获取数据,再把数据添加到缓存中.
 *                      value属性:必须指定,表示当前方法的返回值会被缓存到哪个cache中
 *                      key属性:指定缓存方法返回值对应的key
 *                      condition属性:执行发送的条件
 *
 *              2.@CacheEvict注解:标注删除数据的方法上,调用时会从缓存中移除相应的元素
 *                      value/key/condition属性
 *                      allEntries属性:是否清除指定缓存中的键值对,默认为false,当时值为true时,清除所有的元素
 *                      beforeInvocation属性:false在调用删除方法之后移除缓存中的数据,true在调用删除方法之前移除缓存中的数据
 *
 *              3.@CachePut注解:标注在新增/修改方法上,调用时自动把相应的数据添加缓存
 *          3缓存配置注解
 *              @EnableCaching注解:在@Configuration配置类中添加@EnalbeCaching,开启基于注解的缓存
 *
 *
 *
 *
 *
 */
public class CacheApp {
}
