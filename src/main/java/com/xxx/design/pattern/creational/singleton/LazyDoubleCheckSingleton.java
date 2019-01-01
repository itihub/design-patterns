package com.xxx.design.pattern.creational.singleton;

/**
 * @author kichi
 * @description: 双重检查单例模式 线程安全
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){

        if (singleton == null){

            synchronized (LazyDoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new LazyDoubleCheckSingleton();
                    //1.分配内存
                    //2.初始化对象
                    //3.设置 singleton 指向刚分配内存的对象

                    /**
                     * 指定重排序 会改变执行顺序 成为132
                     * 从而 导致线程不安全
                     * 场景：
                     *  线程1进入 同步代码块中
                     *  发生了指令重排序成为 132
                     *  此时线程1执行到3，但没有执行到2也就是说当前实例未初始化完成
                     *  这时，线程2进入 if 判断语句 发现 当前对象已被实例化（因为指令重排序，指分配分存 未实例化）
                     *  发生线程不安全
                     *  解决方案 使用 volatile 声明对象 禁止指令重排
                     * **/
                    //指令重排 会发生132顺序 从而导致
                }
            }
        }
        return singleton;
    }
}
