package com.xxx.design.example.factorymethod;

/**
 * 简单工厂和工厂方法使用的客户端
 */
public class Demo {

    public static void main(String[] args) {
        // 简单工厂模式
        LeiFeng studentA = SimpleFactory.createLeiFeng("学雷锋精神的大学生");
        studentA.buyRice();
        LeiFeng studentB = SimpleFactory.createLeiFeng("学雷锋精神的大学生"); // 重复代码
        studentB.sweep();
        LeiFeng studentC = SimpleFactory.createLeiFeng("学雷锋精神的大学生"); // 重复代码
        studentC.wash();

        // 工厂方法模式（消除上述重复代码）
        // 优点：解决了简单工厂扩展违背开闭原则的缺点，有保持了封装对象创建过程的优点。
        // 缺点：扩展需要同时扩展工厂类 带来额外的开发量 同时类变多
        //     实例化不同工厂的逻辑于客户端完成，避免客户端修改可以用反射来解决
        IFactory factory = new UndergraduateFactory();
        LeiFeng student1 = factory.createLeiFeng();
        LeiFeng student2 = factory.createLeiFeng();
        LeiFeng student3 = factory.createLeiFeng();
        student1.buyRice();
        student2.sweep();
        student3.wash();

    }
}
