package com.syc.tsgl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syc.tsgl.dao.TearcherMapper;
import com.syc.tsgl.entity.Tearcher;
import com.syc.tsgl.service.TearcherService;

@Service("tearcherService")
public class TearcherServiceImpl implements TearcherService {

	@Autowired
	private TearcherMapper tearcherMapper;
	
	@Override
	public int insertTearcher(Tearcher tearcher) {
		// TODO Auto-generated method stub
		return tearcherMapper.insertSelective(tearcher);
	}

	@Override
	public int updateTearcher(Tearcher tearcher) {
		// TODO Auto-generated method stub
		return tearcherMapper.updateByPrimaryKeySelective(tearcher);
	}

	@Override
	public Tearcher getTearcherById(String tearcherId) {
		// TODO Auto-generated method stub
		return tearcherMapper.selectByPrimaryKey(tearcherId);
	}

	@Override
	public List<Tearcher> listAllTearchers() {
		// TODO Auto-generated method stub
		return tearcherMapper.listAllTearchers();
	}

}
