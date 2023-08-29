package com.xxx.design.example.observer;

/**
 * 具体主题/具体通知者(发布)
 */
public class ConcreteSubject extends Subject {

    // 具体被观察者的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
