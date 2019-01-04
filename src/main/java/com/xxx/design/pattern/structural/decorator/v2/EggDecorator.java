package com.xxx.design.pattern.structural.decorator.v2;

/**
 * @Description: 实体装饰类1
 * @Author: Jimmy
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(AbstractBattercake abstractBattercake) {
        super(abstractBattercake);
    }


    @Override
    protected String getDesc() {
        return super.getDesc() + "加蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
