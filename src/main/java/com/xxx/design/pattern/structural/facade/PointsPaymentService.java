package com.xxx.design.pattern.structural.facade;

/**
 * @author kichi
 * @description: 子系统-支付
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付" + pointsGift.getName() + "积分成功");
        return true;
    }
}
