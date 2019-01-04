package com.xxx.design.pattern.structural.decorator.v2;

/**
 * @Description: TODO
 * @Author: Jimmy
 */
public class Battercake extends AbstractBattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
