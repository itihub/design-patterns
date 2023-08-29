package com.xxx.design.example.observer;

/**
 * 具体观察者/订阅者
 */
public class ConcreteObserver extends Observer {

    private String name;
    private String observerState;

    // 订阅主题类型
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println(String.format("观察者%s的新状态是%s", name, observerState));
    }
}
