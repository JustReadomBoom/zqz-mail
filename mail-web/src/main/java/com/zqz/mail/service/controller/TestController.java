package com.zqz.mail.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zqz
 * @Description:
 * @Date: Created in 18:21 2022/7/5
 */
@RequestMapping("/test")
@RestController
@Slf4j
public class TestController {

    @GetMapping("/config")
    public String testConfig() {
        return "end";
    }

}

