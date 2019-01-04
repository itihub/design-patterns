package com.xxx.design.pattern.structural.decorator.v1;

/**
 * @Description: 煎饼加蛋
 * @Author: Jimmy
 */
public class BattercakeWithEdd extends Battercake {

    @Override
    public String getDesc() {
        return super.getDesc() + "加蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
