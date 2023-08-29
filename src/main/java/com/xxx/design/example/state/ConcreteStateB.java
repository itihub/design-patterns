package com.xxx.design.example.state;

/**
 * 具体状态
 */
public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
