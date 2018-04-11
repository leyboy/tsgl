package com.syc.tsgl.entity;

public class Tearcher {
	
	private String teacherid;

	private String teachername;

	private String college;

	private Integer teacherage;

	private String title;

	private Integer classid;

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
}