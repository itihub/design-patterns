package com.xxx.design.principles.demeter;

/**
 * @Description: 迪米特法则测试
 * @Author: Jimmy
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
