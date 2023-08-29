package com.xxx.design.example.cashregister;

/**
 * 收银系统
 */
public class CashDemo {

    /**
     * 收银系统结算优惠活动
     * @param args
     */
    public static void main(String[] args) {
        double value = 0;
        // 简单工厂模式的用法
        //   缺点：维护或扩展收费方式时都需要改动这个工厂
        CashSuper cashAccept = CashFactory.createCashAccept("满300返100");
        value = cashAccept.acceptCash(400);

        // 策略模式的用法
        //   缺点：虽然解决了收费方式扩展的问题，但是原来工厂模式创建具体的子类的逻辑判断转移到了客户端
        //   优点：
        //      与简单工厂相比客户端只需要认识一个类即可CashRebate，而简单工厂客户端需要认识两个类。具体收费算法和客户端彻底分离，耦合更低。
        //      简化单元测试
        CashRebate cashRebate = new CashRebate(0.8);
        CashContext cashContext = new CashContext(cashRebate);
        value = cashContext.getResult(400);

        // 策略和简单工厂的结合
        //    缺点：虽然通过与简单工厂模式结合，将创建具体的子类的逻辑判断从客户端取消了，但是仍然存在简单工厂模式的扩展带来的问题
        CashContext cashContextFactory = new CashContext("打8折");
        value = cashContextFactory.getResult(400);
    }
}
