package com.sunkun.service;

import com.sunkun.beans.AdminUserBean;

/**
 * 管理员实体类
 * @ClassName: AdminUserService 
 * @Description: TODO
 * @author sunkun
 * @date 2017年4月29日 下午11:56:41 
 * @version version 1.0
 */
public interface AdminUserService
{
    /**
     * 新增管理员
     * @Title: insertAdminUser 
     * @param bean
     * @return
     * @throws Exception
     * @return int    返回类型
     */
    public int insertAdminUser(AdminUserBean bean)
        throws Exception;
    
}
