package com.zqz.mail.test;

import com.zqz.mail.service.ApplicationStart;
import com.zqz.mail.service.utils.SendMailUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: zqz
 * @Description:
 * @Date: Created in 18:50 2022/7/5
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationStart.class)
public class SendTest {
    @Autowired
    private SendMailUtil sendMailUtil;

    @Test
    public void testSend() {
        String to = "believe518zhou@163.com";
        String subject = "邮件发送";
        String content = "这是一封测试邮件";
        sendMailUtil.send(to, subject, content, "/Users/zhouqizhi/Desktop/物资清单表.xlsx");

    }

}
