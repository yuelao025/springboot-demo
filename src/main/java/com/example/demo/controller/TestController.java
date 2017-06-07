package com.example.demo.controller;

import com.example.demo.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanmin on 2017/5/30.
 */
@RestController
public class TestController {

    @RequestMapping("/userinfo")
    public User demo(){

        User user = new User();
        user.setEmail("wmW@shein.com");
        user.setName("vip!");
        return user;
    }

    @RequestMapping("test")
    public int test()
    {
        return 19/0;
    }

    public User noField(){

        User u = new User();
        u.setEmail("yoho@163.com");
        u.setName("qiho360");
        return  u;
    }
}
