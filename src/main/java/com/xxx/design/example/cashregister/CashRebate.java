package com.xxx.design.example.cashregister;

/**
 * 打折收费
 */
public class CashRebate extends CashSuper {

    // 折扣
    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    double acceptCash(double money) {
        return money * moneyRebate;
    }
}
