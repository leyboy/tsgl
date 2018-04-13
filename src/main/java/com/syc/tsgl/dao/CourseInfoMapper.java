package com.syc.tsgl.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.syc.tsgl.entity.CourseInfo;

@Repository
public interface CourseInfoMapper {
	
    int deleteByPrimaryKey(Integer courseinfoid);

    int insert(CourseInfo record);

    int insertSelective(CourseInfo record);

    CourseInfo selectByPrimaryKey(Integer courseinfoid);

    int updateByPrimaryKeySelective(CourseInfo record);

    int updateByPrimaryKey(CourseInfo record);
    
    List<CourseInfo> listCourseInfosByCourseName(String courseName);
    
    List<CourseInfo> listAllCourseInfos();
}