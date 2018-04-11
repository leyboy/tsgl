package com.syc.tsgl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.syc.tsgl.entity.Tearcher;
import com.syc.tsgl.service.TearcherService;
import com.syc.tsgl.utils.ResponseMessage;
import com.syc.tsgl.utils.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api/tsgl")
@Api("教师操作Controller")
public class TearcherController {

	@Autowired
	@Qualifier("tearcherService")
	private TearcherService tearcherService;
	
	
	@ApiOperation(value = "查找全部老师")
	@GetMapping("/tearcher")
	public ResponseMessage<List<Tearcher>> getStudentById() {
		return Result.success(tearcherService.listAllTearchers());
	}
}
