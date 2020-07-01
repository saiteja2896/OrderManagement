package com.oms.seriesmodel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.seriesmodel.service.ModelService;
import com.oms.seriesmodelDto.ModelDto;

@RestController
@RequestMapping(value ="/model")
public class ModelController {
	
	
	@Autowired
	ModelService modelService;
	
	@RequestMapping(value ="/getmodels")
	public List<ModelDto> getModelList(){
		return modelService.getModelDetails();
		
	}
	

}
