package com.zqz.mail.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: zqz
 * @Description:
 * @Date: Created in 17:54 2022/7/5
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.zqz.mail.service"})
public class ApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
