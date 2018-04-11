package com.syc.tsgl.service;

import java.util.List;

import com.syc.tsgl.entity.Tearcher;

public interface TearcherService {

	int insertTearcher(Tearcher tearcher);
	
	int updateTearcher(Tearcher tearcher);
	
	Tearcher getTearcherById(String tearcherId);
	
	List<Tearcher> listAllTearchers();
}
