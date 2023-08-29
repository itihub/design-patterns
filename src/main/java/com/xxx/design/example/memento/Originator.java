package com.xxx.design.example.memento;

/**
 * 发起人类
 */
public class Originator {

    // 需要保存的属性有可能是多个
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建备忘录，将当前需要保存的信息导入并实例化出一个Memento对象
    public Memento createMemento() {
        return new Memento(state);
    }

    // 恢复备忘录 将Memento导入并将相关数据恢复
    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println(String.format("state=%s", state));
    }
}
