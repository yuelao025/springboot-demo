package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wanmin on 2017/6/7.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getInfo()
    {
        Integer uid = new Integer(1);
        return  userMapper.selectByPrimaryKey(uid);

    }

}
