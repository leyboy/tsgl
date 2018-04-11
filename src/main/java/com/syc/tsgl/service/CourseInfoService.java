package com.syc.tsgl.service;

import java.util.List;

import com.syc.tsgl.entity.CourseInfo;

public interface CourseInfoService {

	int addCourseInfo(CourseInfo courseInfo);
	
	int updateCourseInfo(CourseInfo courseInfo);
	
	CourseInfo getCourseInfoById(Integer courseInfoId);
	
	List<CourseInfo> listCourseInfosByClassId(Integer classId);
}
