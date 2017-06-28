package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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


    @RequestMapping("pojo")
    public User getPojo()
    {
        User u = new User();
        u.setEmail("wm@aa.com");
        u.setCity("nj");
        return u;
    }

    @RequestMapping("list")
    public List<User> triveList()
    {
        List<User> l = new LinkedList<>();

        User u1 = new User();
        u1.setCity("bj");
        u1.setEmail("bj.com@163.com");


        User u2 = new User();
        u2.setCity("tj");
        u2.setEmail("tj.com@163.com");


        l.add(u1);
        l.add(u2);

        return l;
    }

    @RequestMapping("map")
    public Map<String,Object> getMap()
    {
        Map<String,Object> m1 = new HashMap<>();
        m1.put("index1","abc");
        m1.put("index2","v2");

        return m1;

    }

    @RequestMapping("hello")
    public User getList(){
      return  userService.getInfo();
    }
}
