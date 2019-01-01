package com.xxx.design.pattern.structural.facade;

/**
 * @author kichi
 * @description: 子系统-校验积分库存
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift){

        System.out.println("校验" + pointsGift.getName() + "积分通过、库存通过");
        return true;
    }
}
