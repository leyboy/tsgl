package com.syc.tsgl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syc.tsgl.dao.CourseInfoMapper;
import com.syc.tsgl.entity.CourseInfo;
import com.syc.tsgl.service.CourseInfoService;

@Service(value="courseInfoService")
public class CourseInfoServiceImpl implements CourseInfoService {

	@Autowired
	private CourseInfoMapper courseInfoMapper;
	
	@Override
	public int addCourseInfo(CourseInfo courseInfo) {
		// TODO Auto-generated method stub
		return courseInfoMapper.insertSelective(courseInfo);
	}

	@Override
	public int updateCourseInfo(CourseInfo courseInfo) {
		// TODO Auto-generated method stub
		return courseInfoMapper.updateByPrimaryKeySelective(courseInfo);
	}

	@Override
	public CourseInfo getCourseInfoById(Integer courseInfoId) {
		// TODO Auto-generated method stub
		return courseInfoMapper.selectByPrimaryKey(courseInfoId);
	}

	@Override
	public List<CourseInfo> listCourseInfosByClassId(Integer classId) {
		// TODO Auto-generated method stub
		return courseInfoMapper.listCourseInfosByClassId(classId);
	}

}
