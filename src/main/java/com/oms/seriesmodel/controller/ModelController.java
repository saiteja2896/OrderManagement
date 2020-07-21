package com.oms.seriesmodel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.seriesmodel.businessInterface.ModelServiceImplimation;
import com.oms.seriesmodel.entity.Model;
import com.oms.seriesmodel.service.ModelService;
import com.oms.seriesmodelDto.ModelDto;
import com.oms.seriesmodelDto.SeriesDto;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value ="/model")
public class ModelController {
	
	
	@Autowired
	ModelServiceImplimation modelService;
	
	@RequestMapping(value ="/getmodels")
	public List<ModelDto> getModelList(@RequestBody SeriesDto seriesId) {
		return modelService.getModelDetails(seriesId.getSeriesId());
		
	}
	

}
