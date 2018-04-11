package com.syc.tsgl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syc.tsgl.dao.ClazzMapper;
import com.syc.tsgl.entity.Clazz;
import com.syc.tsgl.service.ClazzService;

@Service("clazzService")
public class ClazzServiceImpl implements ClazzService {
	
	
	@Autowired
	ClazzMapper clazzMapper;

	@Override
	public int addClazz(Clazz clazz) {
		// TODO Auto-generated method stub
		return clazzMapper.insertSelective(clazz);
	}

	@Override
	public int updateClazz(Clazz clazz) {
		// TODO Auto-generated method stub
		return clazzMapper.updateByPrimaryKeySelective(clazz);
	}

	@Override
	public Clazz getClazzByClassName(String className) {
		// TODO Auto-generated method stub
		return clazzMapper.selectByClassName(className);
	}

	@Override
	public Clazz getClazzById(Integer clazzId) {
		// TODO Auto-generated method stub
		return clazzMapper.selectByPrimaryKey(clazzId);
	}

	@Override
	public List<Clazz> listAllClazzs() {
		// TODO Auto-generated method stub
		return clazzMapper.listAllClazzs();
	}
}
