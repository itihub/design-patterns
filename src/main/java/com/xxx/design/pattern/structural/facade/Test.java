package com.xxx.design.pattern.structural.facade;

/**
 * @author kichi
 * @description: 外观模式测试
 * 应用层不能也无需关心子系统
 * 子系统只能和外观类通讯
 */
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("Apple iPhone XS Max 512GB");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftExchange(pointsGift);
    }
}
