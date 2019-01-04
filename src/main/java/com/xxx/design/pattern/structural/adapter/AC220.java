package com.xxx.design.pattern.structural.adapter;

/**
 * @Description: 220V电 被适配者
 * @Author: Jimmy
 */
public class AC220 {

    public int outputAC220(){
        int output = 220;
        System.out.println(String.format("输出交流电%sV", output));
        return output;
    }
}
