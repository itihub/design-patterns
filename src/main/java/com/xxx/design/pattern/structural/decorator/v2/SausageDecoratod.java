package com.xxx.design.pattern.structural.decorator.v2;

/**
 * @Description: 实体装饰类2
 * @Author: Jimmy
 */
public class SausageDecoratod extends AbstractDecorator {

    public SausageDecoratod(AbstractBattercake abstractBattercake) {
        super(abstractBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
