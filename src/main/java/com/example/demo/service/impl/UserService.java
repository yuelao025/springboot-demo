package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.service.IUser;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wanmin on 2017/6/7.
 */
@Service
public class UserService implements IUser {

    @Autowired
    private UserMapper userMapper;

    public User getInfo()
    {
        Integer uid = new Integer(2);
        return  userMapper.selectByPrimaryKey(uid);

    }

}
