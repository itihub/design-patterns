package com.xxx.design.example.prototype;

public class Demo {

    public static void main(String[] args) {
        Resume a = new Resume("大熊");
        a.setPersonalInfo("男", "26");
        a.setWorkExperience("1998-2000", "xx公司");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("1998-2003", "yy公司");

        Resume c = (Resume) a.clone();
        c.setPersonalInfo("男", "30");

        a.display();
        b.display();
        c.display();
    }
}
