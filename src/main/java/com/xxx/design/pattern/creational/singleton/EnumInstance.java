package com.xxx.design.pattern.creational.singleton;

/**
 * @author kichi
 * @description: 枚举单例模式-最安全最推荐的单例模式 可以防止反射攻击 也可以防止序列化
 */
public enum EnumInstance {

    INSTANCE{
        @Override
        protected void test(){
            System.out.println("test");
        }
    };

    protected abstract void test();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
