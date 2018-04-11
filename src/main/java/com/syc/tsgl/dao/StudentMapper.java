package com.syc.tsgl.dao;

import org.springframework.stereotype.Repository;

import com.syc.tsgl.entity.Student;

@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(String studentid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String studentid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}