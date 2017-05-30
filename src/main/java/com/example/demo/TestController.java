package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanmin on 2017/5/30.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String demo(){
        return "demo!";
    }
}
