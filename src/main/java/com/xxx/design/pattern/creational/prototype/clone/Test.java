package com.xxx.design.pattern.creational.prototype.clone;

import com.xxx.design.pattern.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author kichi
 * @description: 深克隆 浅克隆
 *      什么是克隆？
 *          克隆就是复制一个对象的副本
 *      什么是浅克隆？
 *          原始对象属性有引用数据类型被修改后，克隆的对象也会发生同样是修改；而克隆对象修改引用类型原始对象中值不会发生更改。基本数据类型不存在此问题。
 *      什么是深克隆？
 *          克隆一个新的对象，即使修改了原始对象的引用类型属性的值，克隆后的对象的引用地址也不会被改变
 *      String 是引用了类型，为什么在浅克隆中原始对象发生更改克隆对象不会被更改呢？
 *          String是一个被final修饰了的引用类型
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final Date birthday = new Date(0L);

        Pig pig1 = new Pig("佩琦", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(6666666L);

        System.out.println(pig1);
        System.out.println(pig2);


        // 单例模式防止克隆攻击，实现克隆接口重写克隆方法 不要调用父类的而调用本类方法 防止克隆攻击
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);
    }
}
