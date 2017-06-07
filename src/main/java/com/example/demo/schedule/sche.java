package com.example.demo.schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by wanmin on 2017/6/7.
 */

@Configuration
@EnableScheduling
public class sche {

    @Scheduled(cron = "*/60 * * * * ?")
    public void schedule(){
        System.out.println("dida!");
    }
//
//    @Scheduled(cron = "*/5 * * * * ?")
//    public void schedule11(){
//        System.out.println("schedule11!");
//    }

}
