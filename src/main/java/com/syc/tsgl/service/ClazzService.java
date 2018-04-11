package com.syc.tsgl.service;

import java.util.List;

import com.syc.tsgl.entity.Clazz;

public interface ClazzService {

	int addClazz(Clazz clazz);
	
	int updateClazz(Clazz clazz);
	
	Clazz getClazzByClassName(String className);
	
	Clazz getClazzById(Integer clazzId);
	
	List<Clazz> listAllClazzs();
}
