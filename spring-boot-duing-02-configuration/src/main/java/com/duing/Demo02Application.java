package com.duing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication
 * 声明我们的入口类 并且声明是springBoot项目的
 * */
@SpringBootApplication
//@EnableConfigurationProperties({FoodConfig.class})
public class Demo02Application {
    public static void main(String[] args){
        SpringApplication.run(Demo02Application.class,args);
    }
}
