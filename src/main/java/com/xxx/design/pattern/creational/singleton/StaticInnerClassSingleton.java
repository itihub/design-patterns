package com.xxx.design.pattern.creational.singleton;

/**
 * @author kichi
 * @description: 静态内部类的单例模式（延迟加载） 线程安全
 */
public class StaticInnerClassSingleton {

    //必须声明私有构造器 防止外部调用
    private StaticInnerClassSingleton(){

        //防止反射攻击
        if (InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }

    }

    /**
     * 静态内部类 延迟加载方案 （类初始化锁）
     */
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton
                = new StaticInnerClassSingleton();

    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
