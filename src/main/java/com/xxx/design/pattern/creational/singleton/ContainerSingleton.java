package com.xxx.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kichi
 * @description: 容器单例模式
 */
public class ContainerSingleton {

    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    /**
     * 存放单例对象
     * @param key 键
     * @param instance 单例对象实例
     */
    public static void putInstance(String key, Object instance){

        if (key != null && !"".equals(key)){

            //判断map中不存在此key
            if (singletonMap.containsKey(key)){
                singletonMap.put(key, instance);
            }
        }
    }


    public static Object getInstance(String key){
        return singletonMap.get(key);
    }

    private ContainerSingleton(){

    }
}
