package com.xxx.design.principles.singleresponsibility;

/**
 * @Description: 单一原则反例
 * @Author: Jimmy
 */
public class Bird {

    /**不遵循单一原则，变更风险率高*/
    public void  mainMoveMode(String birdName){
        if ("鸵鸟".equals(birdName)){
            System.out.println(birdName + "用脚走");
        }else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
