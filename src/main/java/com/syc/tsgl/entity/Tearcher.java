package com.syc.tsgl.entity;

public class Tearcher {
	
	private String teacherid; //教师编号

	private String teachername; //教师名

	private String college;  //教师所属学院

	private Integer teacherage; //教师年龄

	private String title; //教师职称

	private Integer classid;  //上课班级id
	
	private String sex; //教师性别
	
	private Clazz clazz; //课程实体

	public String getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid == null ? null : teacherid.trim();
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername == null ? null : teachername.trim();
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college == null ? null : college.trim();
	}

	public Integer getTeacherage() {
		return teacherage;
	}

	public void setTeacherage(Integer teacherage) {
		this.teacherage = teacherage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public Integer getClassid() {
		return classid;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Tearcher [teacherid=" + teacherid + ", teachername=" + teachername + ", college=" + college
				+ ", teacherage=" + teacherage + ", title=" + title + ", classid=" + classid + ", sex=" + sex
				+ ", clazz=" + clazz + "]";
	}

}