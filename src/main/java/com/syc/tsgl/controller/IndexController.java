package com.syc.tsgl.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syc.tsgl.utils.ResponseMessage;
import com.syc.tsgl.utils.ResponseMessageCodeEnum;
import com.syc.tsgl.utils.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping(value="/api/tsgl")
@Api("IndexController")
public class IndexController {
	
	@ApiOperation(value="Swagger2测试")
    @GetMapping(value="/index")
    public ResponseMessage<String> index() throws Exception {
    	return Result.success(ResponseMessageCodeEnum.SUCCESS.getCode(),"index","Hello");
    }
	
	@ApiOperation(value="Swagger2测试")
    @GetMapping(value="/index1")
    public ResponseMessage<String> index1() throws Exception {
    	return Result.success(ResponseMessageCodeEnum.SUCCESS.getCode(),"index1","Hello1");
    }
}
