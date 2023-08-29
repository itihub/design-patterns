package com.xxx.design.example.memento;

/**
 * 管理者类
 * 得到或设置备忘录
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
