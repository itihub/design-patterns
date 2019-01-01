package com.xxx.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author kichi
 * @description: 饿汉式单例模式 线程安全
 */
public class HungrySingleton implements Serializable, Cloneable {

    /**
     * 类加载时进行初始化
     * 声明为final必须在类完成加载时赋值
     *
     * 饿汉与懒汉最大区别就是延迟加载，也就是说时类加载时初始化和调用之后初始化
     */
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){
        //防止反射攻击
        if (hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * 序列化之后破坏了单例模式
     * 原因是当实现序列化接口，其通过反射构造我们的对象
     * 为了保证不被反射破坏，创建以下方法，来保证单例不会被破坏
     * 场景：
     * 首先通过反射实例化此对象，然后会判断对象是否有 readResolve方法
     * 如果有调用readResolve方法来覆盖已经通过反射创建的对象，没有此方法就继续使用反射构造的方法
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
//        return super.clone(); 防止克隆攻击
    }
}
