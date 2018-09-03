package com.zyc.mdata.web;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.zyc.baselibs.web.ResponseResult;
import com.zyc.mdata.data.DimensionCategory;

@RestController
public class DimensionCategoryController extends BaseMdataController {
	
	private static final Logger logger = LogManager.getLogger(DimensionCategoryController.class);
	
    @RequestMapping(value = "/dimension/categories" ,method = RequestMethod.GET)
    public String categories() {
		ResponseResult result = new ResponseResult();
		
		result.setData(DimensionCategory.toMap());
		
		this.log4jServer(logger, Level.DEBUG);
		
		return JSON.toJSONString(result);
    }
	
}
