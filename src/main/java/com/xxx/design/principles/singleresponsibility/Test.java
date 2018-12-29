package com.xxx.design.principles.singleresponsibility;

/**
 * @Description: 单一职责测试
 * @Author: Jimmy
 */
public class Test {

    /**
     * 建议接口和类尽量使用单一职责
     * 类为了防止遵循单一职责导致类的爆炸可以不遵循**/

    public static void main(String[] args) {

//        Bird bird = new Bird();
//        bird.mainMoveMode("鸵鸟");
//        bird.mainMoveMode("大雁");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
