package com.xxx.design.pattern.structural.flyweight;

/**
 * @Description: 经理
 * @Author: Jimmy
 */
public class Manager implements Employvee {

    //属于内部状态
    private String title = "部门经理";

    //部门 属于外部状态
    private String department;

    //报告内容
    private String reportContent;

    public void report() {

        System.out.println(reportContent);
    }

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
