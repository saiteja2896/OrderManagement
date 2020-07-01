package com.oms.seriesmodel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.seriesmodel.entity.Series;
import com.oms.seriesmodel.service.SeriesService;



@RestController
@RequestMapping(value ="/series")
public class SeriesController {

	@Autowired
	SeriesService seriesService;
	
	 
	@RequestMapping(value ="/alldata")
	public List<Series> getSeriesDetails(){
		
		return seriesService.getSeriesDetails();
	}
}
