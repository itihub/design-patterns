package com.xxx.design.example.cashregister;

/**
 * 返利收费
 */
public class CashReturn extends CashSuper {

    // 返利条件
    private double moneyCondition = 0.0d;

    // 返利值
    private double moneyReturn = 0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            // 若大于返利条件则需要减去返利值
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
