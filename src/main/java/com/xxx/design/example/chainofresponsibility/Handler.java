package com.xxx.design.example.chainofresponsibility;

/**
 * 抽象处理请求接口
 */
public abstract class Handler {

    protected Handler successor;

    // 设置继承者
    public void setSuccessor(Handler handler) {
        this.successor = handler;
    }

    // 处理请求的抽象方法
    public abstract void handleRquest(int request);
}
