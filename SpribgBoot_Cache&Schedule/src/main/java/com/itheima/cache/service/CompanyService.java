package com.itheima.cache.service;

import com.itheima.cache.entity.Company;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jack
 * @since 2021-12-27
 */
public interface CompanyService extends IService<Company> {


    Company queryCompanyByCid(Integer cid);
    public Company quedateCompany(Integer cid);
    public void deleteByCid(Integer cid);
}
