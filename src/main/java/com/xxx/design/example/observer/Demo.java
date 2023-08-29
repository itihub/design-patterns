package com.xxx.design.example.observer;

public class Demo {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("X", subject));
        subject.attach(new ConcreteObserver("Y", subject));
        subject.attach(new ConcreteObserver("Z", subject));

        // 主题更新
        subject.setSubjectState("ABC");
        // 通知
        subject.notifys();

    }
}
