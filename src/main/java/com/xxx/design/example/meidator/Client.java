package com.xxx.design.example.meidator;

/**
 * 中介者模式客户端代码
 */
public class Client {

    public static void main(String[] args) {
        // 中介者对象
        ConcreteMediator mediator = new ConcreteMediator();

        // 让同事认识中介者对象
        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);

        // 让中介者认识具体同事类对象
        mediator.setColleague1(c1);
        mediator.setColleague2(c2);

        // 通过中介发送消息
        c1.send("吃过饭了吗？");
        c2.send("没有呢，你打算请客？");
    }
}
