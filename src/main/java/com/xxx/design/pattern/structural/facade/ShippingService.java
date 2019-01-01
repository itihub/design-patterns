package com.xxx.design.pattern.structural.facade;

import java.util.UUID;

/**
 * @author kichi
 * @description: 子系统-物流
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift){
        //to do 物流系统对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
