package com.oms.seriesmodel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.seriesmodel.businessInterface.SeriesServiceImplimation;
import com.oms.seriesmodel.service.SeriesService;
import com.oms.seriesmodelDto.SeriesDto;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value ="/series")
public class SeriesController {

	@Autowired
	SeriesServiceImplimation seriesService;
	
	 
	@RequestMapping(value ="/alldata")
	public List<SeriesDto> getSeriesDetails(){
		return seriesService.getSeriesDetails();
	}
}
