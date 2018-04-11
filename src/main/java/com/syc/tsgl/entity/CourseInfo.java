package com.syc.tsgl.entity;

public class CourseInfo {
    private Integer courseinfoid;

    private String courseinfochaptername;

    private String courseinfochaptercontent;

    public Integer getCourseinfoid() {
        return courseinfoid;
    }

    public void setCourseinfoid(Integer courseinfoid) {
        this.courseinfoid = courseinfoid;
    }

    public String getCourseinfochaptername() {
        return courseinfochaptername;
    }

    public void setCourseinfochaptername(String courseinfochaptername) {
        this.courseinfochaptername = courseinfochaptername == null ? null : courseinfochaptername.trim();
    }

    public String getCourseinfochaptercontent() {
        return courseinfochaptercontent;
    }

    public void setCourseinfochaptercontent(String courseinfochaptercontent) {
        this.courseinfochaptercontent = courseinfochaptercontent == null ? null : courseinfochaptercontent.trim();
    }
}