package com.xxx.design.example.chainofresponsibility;

/**
 * 责任链模式
 * 注意：一个请求极有可能到了链末端都得不到处理，或者因为是没有正确配置而得不到处理
 */
public class Client {

    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        // 设置责任链 h1 -> h2 -> h3
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};
        for (int request : requests) {
            h1.handleRquest(request);
        }

    }
}
