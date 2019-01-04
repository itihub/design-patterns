package com.xxx.design.pattern.structural.decorator.v1;

/**
 * @Description: 非装饰着模式弊端测试
 * @Author: Jimmy
 */
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + "销售价格：" + battercake.cost());

        Battercake battercakeWithEdd = new BattercakeWithEdd();
        System.out.println(battercakeWithEdd.getDesc() + "销售价格：" + battercakeWithEdd.cost());

        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + "销售价格：" + battercakeWithEggSausage.cost());

        /**
         * 无法灵活处理多加蛋加肠问题，只能不断使用子类来实现 从而使 类爆炸**/
    }
}
