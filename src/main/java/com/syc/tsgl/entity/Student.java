package com.syc.tsgl.entity;

public class Student {
    private String studentid;

    private String studentname;

    private String studentmajor;

    private String studentgroup;

    private Boolean studentstate;

    private Integer classid;

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getStudentmajor() {
        return studentmajor;
    }

    public void setStudentmajor(String studentmajor) {
        this.studentmajor = studentmajor == null ? null : studentmajor.trim();
    }

    public String getStudentgroup() {
        return studentgroup;
    }

    public void setStudentgroup(String studentgroup) {
        this.studentgroup = studentgroup == null ? null : studentgroup.trim();
    }

    public Boolean getStudentstate() {
        return studentstate;
    }

    public void setStudentstate(Boolean studentstate) {
        this.studentstate = studentstate;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}