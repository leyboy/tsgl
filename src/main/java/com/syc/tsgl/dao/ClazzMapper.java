package com.syc.tsgl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.syc.tsgl.entity.Clazz;

@Repository
public interface ClazzMapper {
	
    int deleteByPrimaryKey(Integer classid);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Integer classid);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
    
    Clazz selectByClassName(@Param("className") String className);
    
    
    List<Clazz> listAllClazzs();
}