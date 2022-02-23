package com.itheima.cache.controller;


import com.itheima.cache.entity.Company;
import com.itheima.cache.service.CompanyService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Jack
 * @since 2021-12-27
 */
@RestController
@RequestMapping("/cache/company")
public class CacheController {
    @Autowired
    private CompanyService companyService;
    @PostMapping("queryAllCompany")
    public Company queryAllCompany(@RequestParam(name = "cid",required = true) Integer cid){
        return companyService.queryCompanyByCid(cid);
    }
    @PostMapping("/updateCompany")
    public Company updateCompany(Integer cid){
        return companyService.quedateCompany(cid);
    }
    @PostMapping("/delCompany")
    public void deleteCompany(Integer cid){
        companyService.deleteByCid(cid);
    }

}

