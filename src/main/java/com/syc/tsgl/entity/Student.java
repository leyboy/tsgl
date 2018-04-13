package com.syc.tsgl.entity;

/**
 * 学生表对应实体类
 **/
public class Student {

	private String studentid; // 学生id

	private String studentname; // 学生名

	private String studentmajor; // 学生专业

	private String studentgroup; // 学生分组

	private Boolean studentstate; // 学生状态(是否去上课)

	private Integer classid;
	
	private Clazz clazz;

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

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentmajor=" + studentmajor
				+ ", studentgroup=" + studentgroup + ", studentstate=" + studentstate + ", classid=" + classid
				+ ", clazz=" + clazz + "]";
	}
}