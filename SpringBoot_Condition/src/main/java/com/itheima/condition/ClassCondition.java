package com.itheima.condition;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;


/**
 * 实现Spring的Condition接口，完成有条件的注入某个组件到spring容器中
 */
public class ClassCondition implements Condition {
    /**
     *当导入jedis依赖才注入user组件到spring容器中
     * @param conditionContext 上下文对象：可以用于获取environment环境，ioc容器，类加载器
     * @param annotatedTypeMetadata 注解元对象。可以用于判断一个类是否为注解类，获取注解类定义的属性值
     * @return boolean 是否注册bean组件到spring容器中
     *
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata){
        boolean flag=true;
        //通过annotatedTypeMetadata注解元对象，获取注解类中的属性值
        Map<String, Object> map = annotatedTypeMetadata.getAnnotationAttributes(MyConditionOnClass.class.getName());
        String[] value =(String[]) map.get("value");
        try {
            for (String s : value) {
                //通过判断指定文件是否存在，来判断指定依赖是否已经导入
                Class<?> jedis = Class.forName(s);
            }
        } catch (ClassNotFoundException e) {
            flag=false;
        }

        return flag;
    }
}
