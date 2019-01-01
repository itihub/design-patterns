package com.xxx.design.pattern.creational.prototype.clone;

import com.xxx.design.pattern.creational.singleton.HungrySingleton;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author kichi
 * @description: 深克隆 浅克隆
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Date birthday = new Date(0L);

        Pig pig1 = new Pig("佩琦", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(6666666L);

        System.out.println(pig1);
        System.out.println(pig2);


        //单例模式防止克隆攻击，实现克隆接口重写克隆方法 不要调用父类的而调用本类方法 防止克隆攻击
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);
    }
}
