package com.example.demo.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by wanmin on 2017/6/7.
 */
public class User {

    public String name;

    @JSONField(serialize = false)
    public String email;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
