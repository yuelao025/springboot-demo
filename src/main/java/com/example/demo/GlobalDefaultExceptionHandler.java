package com.example.demo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wanmin on 2017/6/7.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

//    @ExceptionHandler(value = Exception.class)
    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest req,Exception ex){

        ex.printStackTrace();
        System.out.println("GlobalDefaultExceptionHandler ");

    }
}
