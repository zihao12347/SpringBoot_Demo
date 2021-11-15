package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Mapper注解：标注在接口上，表示该接口为mybatis的mapper接口，
 *              可以被springboot自动扫描到spring的应用上下文中，
 */
@Mapper
public interface UserXmlMapper {
    public List<User> findAll();
}
