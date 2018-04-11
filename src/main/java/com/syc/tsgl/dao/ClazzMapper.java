package com.syc.tsgl.dao;

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
}