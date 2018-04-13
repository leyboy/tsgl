package com.syc.tsgl.entity;

import java.util.List;

/**
 * 课程表对应的实体类
 **/
public class Clazz {

	private Integer classid; // 课程id

	private String classname; // 班级名

	private String classtime; // 上课时间~下课时间

	private Integer classhours; // 课程学时数

	private Integer classprogress; // 已上课程学时数

	private List<CourseInfo> courseInfos;

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

	public List<CourseInfo> getCourseInfos() {
		return courseInfos;
	}

	public void setCourseInfos(List<CourseInfo> courseInfos) {
		this.courseInfos = courseInfos;
	}

	@Override
	public String toString() {
		return "Clazz [classid=" + classid + ", classname=" + classname + ", classtime=" + classtime + ", classhours="
				+ classhours + ", classprogress=" + classprogress + ", courseInfos=" + courseInfos + "]";
	}
}