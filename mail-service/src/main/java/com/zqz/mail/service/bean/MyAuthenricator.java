package com.zqz.mail.service.bean;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * @Author: zqz
 * @Description:
 * @Date: Created in 18:07 2022/7/5
 */
public class MyAuthenricator extends Authenticator {

    private String u = null;
    private String p = null;

    public MyAuthenricator(String u, String p) {
        this.u = u;
        this.p = p;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(u, p);
    }
}
