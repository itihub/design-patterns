package com.xxx.design.pattern.structural.flyweight;


import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 工厂类
 * @Author: Jimmy
 */
public class EmployeeFactory {

    private static final Map<String, Employvee> EMPLOYVEE_MAP = new HashMap<String, Employvee>();

    public static Employvee getManager(String department){
        Manager manager = (Manager) EMPLOYVEE_MAP.get(department);

        if (manager == null){
            manager = new Manager(department);
            System.out.println("创建部门经理" + department);
            manager.setReportContent(department + "部门汇报，内容.....");
            EMPLOYVEE_MAP.put(department, manager);
        }

        return manager;
    }

}
