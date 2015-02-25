package com.clbus.matouwang.pojo;

import java.io.Serializable;

public class UserInfoExt implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userName;

    private String userPass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}