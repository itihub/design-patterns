package com.xxx.design.principles.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: Jimmy
 */
public class Boss {

    /** boss查课程 **/
    public void commandCheckNumber(TeamLeader teamLeader){
        //违背迪米特法则  Course不应该是Boss的朋友类
//        List<Course> courseList = new ArrayList<Course>();
//        for(int i = 0; i < 20; i++){
//            courseList.add(new Course());
//        }
        teamLeader.checkNumberCooures();

    }
}
