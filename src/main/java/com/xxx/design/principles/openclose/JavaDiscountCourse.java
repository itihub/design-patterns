package com.xxx.design.principles.openclose;

/**
 * @Description: 不修改抽象接口来进行扩展
 * @Author: Jimmy
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    /**重写父类方法实现折扣价扩展*/
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
