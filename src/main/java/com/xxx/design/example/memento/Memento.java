package com.xxx.design.example.memento;

/**
 * 备忘录类
 */
public class Memento {

    // 需要保存的数据属性有可能十多个
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
