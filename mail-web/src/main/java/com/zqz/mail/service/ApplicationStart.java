package com.zqz.mail.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: zqz
 * @Description:
 * @Date: Created in 17:54 2022/7/5
 */
@SpringBootApplication(scanBasePackages = "com.zqz.mail")
public class ApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
