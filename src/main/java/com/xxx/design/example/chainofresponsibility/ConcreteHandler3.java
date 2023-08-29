package com.xxx.design.example.chainofresponsibility;

/**
 * 具体处理者类，处理它负责的请求，可以访问它的后继者
 * 如果可以处理该请求，就处理之，否则就将该请求转发给它的后继者
 */
public class ConcreteHandler3 extends Handler {

    @Override
    public void handleRquest(int request) {
        if (request >= 20 && request < 30) {
            // 处理该请求
            System.out.println(String.format("%s 处理请求 %s", this.getClass().getName(), request));
        } else if (super.successor != null) {
            // 无法处理请求 转移给后继者
            successor.handleRquest(request);
        }
    }
}
