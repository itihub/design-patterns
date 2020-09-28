package com.xxx.design.principles.interfacesegregation;

/**
 * @Description: 没有使用接口隔离 造成空实现
 * @Author: Jimmy
 */
public class Bird implements IAnimalAction {


    public void eat() {

    }

    public void fly() {
        // 有的鸟会飞 有的鸟不会飞
    }

    public void swim() {
        // 所有鸟不会游泳 只能空实现 不合理
    }
}
