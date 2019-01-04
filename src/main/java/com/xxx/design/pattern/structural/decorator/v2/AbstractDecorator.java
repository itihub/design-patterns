package com.xxx.design.pattern.structural.decorator.v2;

/**
 * @Description: 抽象装饰者类
 * @Author: Jimmy
 */
public abstract class AbstractDecorator extends AbstractBattercake {

    //将抽象煎饼类组合作为成员变量
    private AbstractBattercake abstractBattercake;


    public AbstractDecorator(AbstractBattercake abstractBattercake) {
        this.abstractBattercake = abstractBattercake;
    }

    //如果业务需要抽象方法的话可以声明
//    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return abstractBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return abstractBattercake.cost();
    }
}
