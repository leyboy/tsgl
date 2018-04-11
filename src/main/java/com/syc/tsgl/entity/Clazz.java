package com.syc.tsgl.entity;

public class Clazz {
    private Integer classid;

    private String classname;

    private String classtime;

    private Integer classhours;

    private Integer classprogress;

    private Integer courseid;

	public Integer getClassid() {
		return classid;
	}

	public String getClassname() {
		return classname;
	}

	public String getClasstime() {
		return classtime;
	}

	public Integer getClasshours() {
		return classhours;
	}

	public Integer getClassprogress() {
		return classprogress;
	}

	public Integer getCourseid() {
		return courseid;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public void setClasstime(String classtime) {
		this.classtime = classtime;
	}

	public void setClasshours(Integer classhours) {
		this.classhours = classhours;
	}

	public void setClassprogress(Integer classprogress) {
		this.classprogress = classprogress;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	@Override
	public String toString() {
		return "Clazz [classid=" + classid + ", classname=" + classname + ", classtime=" + classtime + ", classhours="
				+ classhours + ", classprogress=" + classprogress + ", courseid=" + courseid + "]";
	}


}