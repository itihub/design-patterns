package com.xxx.design.example.state;

/**
 * 具体状态
 */
public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
