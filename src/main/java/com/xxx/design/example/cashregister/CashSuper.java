package com.xxx.design.example.cashregister;

/**
 * 现金收取
 */
public abstract class CashSuper {

    /**
     * 收取现金
     * @param money 原价
     * @return 当前价
     */
    abstract double acceptCash(double money);
}
