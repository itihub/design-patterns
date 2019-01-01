package com.xxx.design.pattern.creational.builder.v2;

/**
 * @author kichi
 * @description: 建造对象
 */
public class Course {

    private String courseName;

    private String coursePPT;

    private String courseVideo;

    private String courseArticle;

    //question && answer
    private String courseQA;

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseQA = courseBuilder.courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    /**静态内部类
     * 将具体的实体类与实体类build放在一个类中
     * 实现链式调用**/
    public static class CourseBuilder{


        private String courseName;

        private String coursePPT;

        private String courseVideo;

        private String courseArticle;

        //question && answer
        private String courseQA;

        public CourseBuilder builderCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder builderCoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder builderCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder builderCourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder builderCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }
}
