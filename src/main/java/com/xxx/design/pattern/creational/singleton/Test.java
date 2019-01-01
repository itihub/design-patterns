package com.xxx.design.pattern.creational.singleton;

import java.io.*;

/**
 * @author kichi
 * @description: 单例模式-序列化破坏单例模式测试
 */
public class Test {


    public static void main(String[] args) throws Exception{

        enumSerializable();

    }

    /**
     * 序列化破坏测试
     */
    private static void serializable() throws Exception {
        HungrySingleton singleton = HungrySingleton.getInstance();

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(singleton);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(singleton);
        System.out.println(newInstance);
        System.out.println(newInstance == singleton);
    }

    /**
     * 枚举单例序列化破坏测试
     * @throws Exception
     */
    private static void enumSerializable() throws Exception {

        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        EnumInstance newInstance = (EnumInstance) ois.readObject();

        instance.test();
        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(newInstance == instance);
    }
}
