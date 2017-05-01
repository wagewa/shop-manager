package com.sunkun.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.sunkun.beans.AdminUserBean;
import com.sunkun.beans.AdminUserBeanExample;

public interface AdminUserDao
{
    int countByExample(AdminUserBeanExample example);
    
    int deleteByExample(AdminUserBeanExample example);
    
    int deleteByPrimaryKey(Integer id);
    
    int insert(AdminUserBean record);
    
    int insertSelective(AdminUserBean record);
    
    List<AdminUserBean> selectByExample(AdminUserBeanExample example);
    
    AdminUserBean selectByPrimaryKey(Integer id);
    
    int updateByExampleSelective(@Param("record") AdminUserBean record, @Param("example") AdminUserBeanExample example);
    
    int updateByExample(@Param("record") AdminUserBean record, @Param("example") AdminUserBeanExample example);
    
    int updateByPrimaryKeySelective(AdminUserBean record);
    
    int updateByPrimaryKey(AdminUserBean record);
}