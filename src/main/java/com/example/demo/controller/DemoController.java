package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanmin on 2017/5/30.
 */
@RestController
public class DemoController {

    @RequestMapping("/index")
    public String index()
    {
        return "index action";
    }
}
