package com.xxx.design.principles.openclose;

/**
 * @Description: 测试开闭原则
 * @Author: Jimmy
 */
public class Test {

    public static void main(String[] args) {
        ICourse javaCourser = new JavaDiscountCourse(96, "Java Course", 288D);

        String result = String.format("课程ID:%s 课程名称：%s 课程原价：%s 折扣价格：%s"
                , javaCourser.getId()
                , javaCourser.getName()
                , ((JavaDiscountCourse) javaCourser).getOriginPrice()
                , javaCourser.getPrice()
        );
        System.out.println(result);
    }
}
