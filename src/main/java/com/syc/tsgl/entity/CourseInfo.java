package com.syc.tsgl.entity;

public class CourseInfo {
	
    private Integer courseinfoid;

    private String courseinfochaptername;

    private String courseinfochaptercontent;

    private Integer classid;

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

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

	@Override
	public String toString() {
		return "CourseInfo [courseinfoid=" + courseinfoid + ", courseinfochaptername=" + courseinfochaptername
				+ ", courseinfochaptercontent=" + courseinfochaptercontent + ", classid=" + classid + "]";
	}
    
    
}