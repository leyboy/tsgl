package com.syc.tsgl.service.impl;

import java.util.List;



import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syc.tsgl.dao.CourseInfoMapper;
import com.syc.tsgl.entity.CourseInfo;
import com.syc.tsgl.service.CourseInfoService;

@RemoteProxy(name="CourseInfoService")
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
	@RemoteMethod
	public CourseInfo getCourseInfoByIdAndDwr() {
		// TODO Auto-generated method stub
		WebContext webContext=WebContextFactory.get();
		Integer courseInfoId=(Integer) webContext.getSession().getAttribute("selectCourseInfoId");
		if(courseInfoId==null){
			return null;
		}
		return courseInfoMapper.selectByPrimaryKey(courseInfoId);
	}
	
	
	@Override
	@RemoteMethod
	public CourseInfo getCourseInfoById(Integer courseInfoId) {
		// TODO Auto-generated method stub
		return courseInfoMapper.selectByPrimaryKey(courseInfoId);
	}


	@Override
	@RemoteMethod
	public List<CourseInfo> listCourseInfosByCourseName(String courseName) {
		// TODO Auto-generated method stub
		return courseInfoMapper.listCourseInfosByCourseName(courseName);
	}
	
	@Override
	@RemoteMethod
	public List<CourseInfo> listAllCourseInfos() {
		// TODO Auto-generated method stub
		return courseInfoMapper.listAllCourseInfos();
	}
	
	
	

}
