package com.xxx.design.example.prototype;

/**
 * 原型类
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;

    // 引用类型不会被拷贝，想实现深拷贝该对象也需要实现Cloneable接口
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    public Resume(WorkExperience work) {
        this.work = (WorkExperience) work.clone();
    }


    // 设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    // 设置工作经历
    public void setWorkExperience(String workDate, String company) {
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    public void display() {
        System.out.println(String.format("%s %s %s", name, sex, age));
        System.out.println(String.format("工作经历: %s %s", work.getWorkDate(), work.getCompany()));
    }


    public Object clone() {
        // 浅拷贝（引用类型只会拷贝引用地址）
//        Object clone = null;
//        try {
//            clone = super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return clone;

        // 深拷贝（复制引用类型的对象）
        Resume clone = new Resume(this.work);
        clone.name = this.name;
        clone.sex = this.sex;
        clone.age = this.age;
        return clone;
    }
}
