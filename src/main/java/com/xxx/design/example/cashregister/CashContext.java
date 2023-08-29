package com.xxx.design.example.cashregister;

/**
 * 策略上下文
 * 缺点：把原来判断创建那个具体子类的逻辑转移到调用端
 */
public class CashContext {

    private CashSuper cashSuper;

    /**
     * 通过构造器传入具体的策略
     * @param cashSuper 具体策略对象
     */
    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    /**
     * 策略和简单工厂结合
     * @param type 收费类型
     */
    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                cashSuper = new CashReturn("300", "100");
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }

    /**
     * 根据具体策略获取计算结果
     * @param money
     * @return
     */
    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
