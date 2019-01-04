package com.xxx.design.pattern.structural.flyweight;

/**
 * @Description: 享员模式测试
 * @Author: Jimmy
 */
public class Test {

    private static final String departments[] = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {

        for (int i = 0; i <10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];

            Employvee manager = EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
