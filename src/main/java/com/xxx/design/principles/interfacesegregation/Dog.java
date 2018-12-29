package com.xxx.design.principles.interfacesegregation;

/**
 * @Description: 使用接口隔离接口进行需要的实现避免空实现 更灵活 更合理
 * @Author: Jimmy
 */
public class Dog implements IEatAnimalAction, ISwimAnimalAction {

    public void eat() {

    }

    public void swim() {

    }
}
