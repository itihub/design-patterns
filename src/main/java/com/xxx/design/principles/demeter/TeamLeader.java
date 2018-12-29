package com.xxx.design.principles.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: Jimmy
 */
public class TeamLeader {

    public void checkNumberCooures(){
        //模拟说课程
        List<Course> courseList = new ArrayList<Course>();
        for(int i = 0; i < 20; i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程数量："+ courseList.size());
    }
}
