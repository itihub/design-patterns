package com.xxx.design.example.memento;

/**
 * 备忘录使用
 */
public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        // 保存状态
        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento()); // createMemento封装可以隐藏Originator实现细节

        // 修改状态
        o.setState("Off");
        o.show();

        // 恢复状态
        o.setMemento(c.getMemento());
        o.show();

    }
}
