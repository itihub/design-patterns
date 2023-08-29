package com.xxx.design.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题/抽象通知者
 */
public abstract class Subject {

    // 需要通知的观察者(观察者必须是Observer的子类)
    // 已经封装好的第三方库的类或者不想继承Observer的这类观察者如何通知？ 使用委托
    private List<Observer> observers = new ArrayList<>();


    // 增加观察者/观察者订阅
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 删除观察者/观察者退订
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 通知
    public void notifys() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
