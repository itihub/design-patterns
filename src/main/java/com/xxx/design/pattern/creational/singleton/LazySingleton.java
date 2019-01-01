package com.xxx.design.pattern.creational.singleton;

/**
 * @author kichi
 * @description: 懒汉式单列模式
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private static boolean flag = true;

    /**私有构造器**/
    private LazySingleton(){

        //防止反射攻击
        if (flag){
            //第一实例化会执行到这里，将flag变成 false阻止反射攻击
            flag = false;
        }else {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 获取单列  线程不安全
     * @return
     */
    public static LazySingleton getInstance(){

        if (lazySingleton == null){     //线程1 判断无实例 进入判断
            lazySingleton = new LazySingleton();    //线程2到达此处 还没开始执行此行代码
        }
        return lazySingleton;
    }

    /**
     * 线程安全  使用synchronized锁定此类 JVM保证同一时刻只有一个线程访问 同一时刻阻塞其他线程
     * synchronized锁 比较消耗性能 同时锁范围比较大
     * 此写法等同 getSyncInstance()
     * @return
     */
    public synchronized static LazySingleton getSyncInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static LazySingleton getSyncInstance2(){
        synchronized (LazySingleton.class){
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
}
