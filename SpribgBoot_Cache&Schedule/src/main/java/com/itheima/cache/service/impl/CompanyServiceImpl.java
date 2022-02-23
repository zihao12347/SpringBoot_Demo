package com.itheima.cache.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.itheima.cache.entity.Company;
import com.itheima.cache.mapper.CompanyMapper;
import com.itheima.cache.service.CompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jack
 * @since 2021-12-27
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    /**
     * @Cacheable注解：缓存查询，会将查询方法的返回值添加到缓存中
     *      value/cacheNames：指定缓存名称
     *      key：缓存数据对应的键，默认是目标方法的参数值，可以通过spEl "#Xxx" 计算key值
     *      condition:条件属性
     *      sync:是否异步模式进行缓存
     *
     */
    @Cacheable(value = {"company"},key = "#cid",condition = "#cid>0")
    public Company queryCompanyByCid(Integer cid) {
        return companyMapper.selectById(cid);
    }


    /**
     * @CachePut注解：一般用于更新操作，在更新缓存时，必须与目标缓存对象保存相同的缓存名称value和相同的key
     * @param cid
     * @return
     */
    @Cacheable(cacheNames = {"company"},key = "#cid")
    public Company quedateCompany(Integer cid){
        Company company = queryCompanyByCid(cid);
        company.setCompanyName("九江科技");
        companyMapper.update(null, Wrappers.<Company>lambdaUpdate().eq(Company::getCompanyId,company.getCompanyId()).set(Company::getCompanyName,company.getCompanyName()));
        return company;
    }

    /**
     * @CacheEvict注解：缓存清除
     *      value属性：清除的缓存数据名字
     *      key属性：缓存的键
     *      allEntries属性：是否清除指定缓存中所有的键值对，
     *      beforeInvocation属性：是否在执行在目标删除方法执行之前执行，默认为false,值为true时，在目标删除方法执行前调用@CacheEvict清除缓存
     * @param cid
     */
    @CacheEvict(value = {"company"},key = "#cid",beforeInvocation = true)
    public void deleteByCid(Integer cid){
        companyMapper.deleteById(cid);
    }
}
