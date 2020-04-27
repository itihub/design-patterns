package com.xxx.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author kichi
 * @description: TODO
 */
public class Pig implements Cloneable{

    private String name;

    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();

        // 深克隆
        pig.birthday = (Date) pig.birthday.clone(); // 对引用类型的成员属性克隆
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
