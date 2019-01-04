package com.xxx.design.pattern.structural.decorator.v1;

/**
 * @Description: 煎饼加蛋加肠
 * @Author: Jimmy
 */
public class BattercakeWithEggSausage extends BattercakeWithEdd {

    @Override
    public String getDesc() {
        return super.getDesc() + "加肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
