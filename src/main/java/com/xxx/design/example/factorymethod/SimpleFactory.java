package com.xxx.design.example.factorymethod;

/**
 * 简单工厂
 */
public class SimpleFactory {

    /**
     * 根据类型创建实例
     * @param type
     * @return
     */
    public static LeiFeng createLeiFeng(String type) {
        LeiFeng result = null;
        // 扩展需要修改判断逻辑
        switch (type) {
            case "学雷锋精神的大学生":
                result = new Undergraduate();
                break;
            case "社区志愿者":
                result = new Volunteer();
                break;
        }
        return result;
    }
}
