package com.sunkun.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunkun.beans.AdminUserBean;
import com.sunkun.service.AdminUserService;

/**
 * 管理员控制器
 * @ClassName: AdminUserController 
 * @Description: 
 * @author sunkun
 * @date 2017年4月30日 上午12:04:14 
 * @version version 1.0
 */
@Controller
public class AdminUserController
{
    @Resource
    private AdminUserService adminUserService;
    
    @RequestMapping("/list")
    public String list(HttpServletRequest request)
    {
        AdminUserBean adminUserBean = new AdminUserBean();
        adminUserBean.setUserName("ceshi");
        adminUserBean.setPassword("123456");
        adminUserBean.setEmail("admin@qq.com");
        adminUserBean.setBirthday("1990-01-02");
        adminUserBean.setCreateTime(new Date());
        adminUserBean.setLastip("192.168.9.110");
        adminUserBean.setIsValidated(1);
        adminUserBean.setNickName("李四");
        adminUserBean.setSex(0);
        adminUserBean.setLastTime(new Date());
        int id = 0;
        try
        {
            id = adminUserService.insertAdminUser(adminUserBean);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        request.setAttribute("id", id);
        return "adminUser/list";
    }
}
