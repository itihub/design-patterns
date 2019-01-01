package com.xxx.design.pattern.creational.singleton;

/**
 * @author kichi
 * @description: ThreadLocal'单例'模式（保证同一个线程获取的对象都是一个）
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> thread
            = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance(){
        return thread.get();
    }
}
