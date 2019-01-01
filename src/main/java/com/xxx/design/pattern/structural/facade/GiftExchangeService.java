package com.xxx.design.pattern.structural.facade;

/**
 * @author kichi
 * @description: 外观类  聚合子系统，组合完整流程
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();

    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift){
        if (qualifyService.isAvailable(pointsGift)){
            //资格检验通过
            if (pointsPaymentService.pay(pointsGift)){
                //支付成功
                String orderId = shippingService.shipGift(pointsGift);
                System.out.println("下单成功，订单编号：" + orderId);
            }
        }
    }

}
