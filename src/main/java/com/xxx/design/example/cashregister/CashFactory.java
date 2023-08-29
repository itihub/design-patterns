package com.xxx.design.example.cashregister;

/**
 * 简单工厂
 */
public class CashFactory {

    /**
     * 根据客户端传入的类型创建具体子类
     * @param type 类型
     * @return 具体子类实例
     */
    public static CashSuper createCashAccept(String type) {
        CashSuper cs = null;
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn("300", "100");
                break;
            case "打8折":
                cs = new CashRebate(0.8);
                break;
        }
        return cs;
    }
}
