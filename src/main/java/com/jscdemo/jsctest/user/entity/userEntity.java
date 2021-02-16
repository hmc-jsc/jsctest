package com.jscdemo.jsctest.user.entity;

import java.util.Date;

public class userEntity {
    private Integer id;
    private String username;
    private String pwd;
    private Date createtime;
    private Integer status;

    public userEntity() {
    }

    public userEntity(Integer id, String username, String pwd, Date createtime, Integer status) {
        this.id  = id;
        this.username = username;
        this.pwd = pwd;
        this.createtime = createtime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "userEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", createtime=" + createtime +
                ", status=" + status +
                '}';
    }
}
