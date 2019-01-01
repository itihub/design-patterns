package com.xxx.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author kichi
 * @description: 防止反射攻击解决方案攻击
 */
public class Test2 {

    public static void main(String[] args) throws Exception {

        //这两种单例模式的特点：类加载时就实例好了

//        hungrySingleton();

//        staticInnerClassSingleton();

        //非类加载时就初始化好的单例模式
        lazySingleton();
    }


    //饿汉式反射攻击
    private static void hungrySingleton() throws Exception {

        Class objectClass = HungrySingleton.class;
        //Class.forName(HungrySingleton.class.getName()); 与以上写法一致

        //通过反射实例化私有构造器，并把私有权限打开
        Constructor constructor = objectClass.getDeclaredConstructor();  //反射的构造器
        //修改访问修饰符的权限被打开
        constructor.setAccessible(true);

        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        System.out.println("通过方法调用构造====" + instance);
        System.out.println("反射构造==========" + newInstance);
        System.out.println(instance == newInstance);

    }

    //静态内部类反射攻击
    private static void staticInnerClassSingleton() throws Exception {

        Class objectClass = Class.forName(StaticInnerClassSingleton.class.getName());

        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();

        System.out.println("通过方法调用构造====" + instance);
        System.out.println("反射构造==========" + newInstance);
        System.out.println(instance == newInstance);
    }

    //非类加载时就实例化好单例对象
    private static void lazySingleton() throws Exception{

        Class objectClass = Class.forName(LazySingleton.class.getName());

        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        /**
         * 更改执行顺序也会出现反射攻击，即使做了防止反射攻击，这是无法避免的
         * 先执行反射实例化，再执行方法实例化 会出现反射攻击
         */
        LazySingleton instance = LazySingleton.getSyncInstance();
        //进行反射攻击
        Field field = instance.getClass().getDeclaredField("flag");
        field.setAccessible(true);  //打开权限
        field.set(instance, true);

        LazySingleton newInstance = (LazySingleton) constructor.newInstance();



        System.out.println("通过方法调用构造====" + instance);
        System.out.println("反射构造==========" + newInstance);
        System.out.println(instance == newInstance);
    }
}
