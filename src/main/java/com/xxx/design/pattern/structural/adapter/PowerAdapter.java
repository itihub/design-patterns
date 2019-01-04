package com.xxx.design.pattern.structural.adapter;

/**
 * @Description: 电源适配器
 * @Author: Jimmy
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220 = new AC220();

    public int outputDC5V() {

        int adapterInput = ac220.outputAC220();
        //变压器
        int adapterOutput = adapterInput / 44;
        System.out.println(String.format("使用 PowerAdapter输入AC %sV 输出DC %sV", adapterInput, adapterOutput));
        return adapterOutput;
    }
}
