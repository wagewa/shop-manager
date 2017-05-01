package com.sunkun.beans;

import java.util.Date;

public class AdminUserBean
{
    private Integer id;
    
    private String userName;
    
    private String password;
    
    private String email;
    
    private Integer sex;
    
    private String birthday;
    
    private Date lastTime;
    
    private String lastip;
    
    private String nickName;
    
    private String officePhone;
    
    private Integer isValidated;
    
    private Date createTime;
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(Integer id)
    {
        this.id = id;
    }
    
    public String getUserName()
    {
        return userName;
    }
    
    public void setUserName(String userName)
    {
        this.userName = userName == null ? null : userName.trim();
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password == null ? null : password.trim();
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email == null ? null : email.trim();
    }
    
    public Integer getSex()
    {
        return sex;
    }
    
    public void setSex(Integer sex)
    {
        this.sex = sex;
    }
    
    public String getBirthday()
    {
        return birthday;
    }
    
    public void setBirthday(String birthday)
    {
        this.birthday = birthday == null ? null : birthday.trim();
    }
    
    public Date getLastTime()
    {
        return lastTime;
    }
    
    public void setLastTime(Date lastTime)
    {
        this.lastTime = lastTime;
    }
    
    public String getLastip()
    {
        return lastip;
    }
    
    public void setLastip(String lastip)
    {
        this.lastip = lastip == null ? null : lastip.trim();
    }
    
    public String getNickName()
    {
        return nickName;
    }
    
    public void setNickName(String nickName)
    {
        this.nickName = nickName == null ? null : nickName.trim();
    }
    
    public String getOfficePhone()
    {
        return officePhone;
    }
    
    public void setOfficePhone(String officePhone)
    {
        this.officePhone = officePhone == null ? null : officePhone.trim();
    }
    
    public Integer getIsValidated()
    {
        return isValidated;
    }
    
    public void setIsValidated(Integer isValidated)
    {
        this.isValidated = isValidated;
    }
    
    public Date getCreateTime()
    {
        return createTime;
    }
    
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }
}