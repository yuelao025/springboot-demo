package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanmin on 2017/5/30.
 */
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userinfo")
    public User demo(){
        return  new User();
    }

    @RequestMapping("test")
    public int test()
    {
        return 19/0;
    }

//    public User noField(){
//
//        User u = new User();
//        u.setEmail("yoho@163.com");
//        u.setName("qiho360");
//        return  u;
//    }

    @RequestMapping("hello")
    public User getList(){
      return  userService.getInfo();
    }
}
