package com.xxx.design.example.composite;

/**
 * 组合中对象声明接口
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    // 增加树叶或树枝功能
    public abstract void add(Component c);
    // 移除树叶或树枝功能
    public abstract void remove(Component c);
    public abstract void display(int depth);

}
