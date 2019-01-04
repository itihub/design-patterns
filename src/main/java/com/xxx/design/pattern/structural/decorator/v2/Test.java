package com.xxx.design.pattern.structural.decorator.v2;

/**
 * @Description: 装饰折模式测试
 * @Author: Jimmy
 */
public class Test {

    public static void main(String[] args) {

        AbstractBattercake abstractBattercake;

        abstractBattercake = new Battercake();
        abstractBattercake = new EggDecorator(abstractBattercake);
        abstractBattercake = new SausageDecoratod(abstractBattercake);
        abstractBattercake = new EggDecorator(abstractBattercake);

        System.out.println(abstractBattercake.getDesc() + "销售价格：" + abstractBattercake.cost());

    }
}
