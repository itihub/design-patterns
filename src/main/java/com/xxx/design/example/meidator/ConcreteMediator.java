package com.xxx.design.example.meidator;

/**
 * 具体中介者类
 * 缺点：具体的中介者需要知道所有的同事类对象，虽然解决了Colleague之间耦合关系，但是使ConcreteMediator责任太多，如果它出问题整个系统都会出问题
 */
public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    // 重写发送信息方法，根据对象做出选择判断 通知对象
    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague2) {
            colleague1.notify(message);
        } else {
            colleague2.notify(message);
        }
    }
}
