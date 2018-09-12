package com.example.jdbc.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class User{
    private String uid;
    private String username;
    private String password;
    private String isRoot;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date registerDate;
    private Integer status;
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getIsRoot() {
        return isRoot;
    }
    public void setIsRoot(String isRoot) {
        this.isRoot = isRoot;
    }
    public Date getRegisterDate() {
        return registerDate;
    }
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
}
