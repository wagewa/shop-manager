package com.sunkun.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunkun.beans.AdminUserBean;
import com.sunkun.dao.AdminUserDao;
import com.sunkun.service.AdminUserService;

@Service
public class AdminUserServiceImpl implements AdminUserService
{
    
    @Resource
    private AdminUserDao adminUserDao;
    
    @Override
    public int insertAdminUser(AdminUserBean bean)
        throws Exception
    {
        return adminUserDao.insertSelective(bean);
    }
    
}
