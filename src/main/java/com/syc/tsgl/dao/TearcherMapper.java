package com.syc.tsgl.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.syc.tsgl.entity.Tearcher;

@Repository
public interface TearcherMapper {
	
    int deleteByPrimaryKey(String teacherid);

    int insert(Tearcher record);

    int insertSelective(Tearcher record);

    Tearcher selectByPrimaryKey(String teacherid);

    int updateByPrimaryKeySelective(Tearcher record);

    int updateByPrimaryKey(Tearcher record);
    
    List<Tearcher> listAllTearchers();
}