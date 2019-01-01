package com.xxx.design.pattern.creational.prototype;

/**
 * @author kichi
 * @description: 原型模式测试
 *
 * 原型模式是在内存中对二进制流的拷贝，比new的性能好很多
 */
public class Test {


    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模版");

        for (int i = 0; i < 10; i++){
            //克隆对象
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("Name" + i);
            mailTemp.setEmailAddress(i + "@example.com");
            mailTemp.setContent("内容内容");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
