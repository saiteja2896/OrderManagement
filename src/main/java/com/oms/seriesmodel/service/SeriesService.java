package com.oms.seriesmodel.service;

import org.springframework.transaction.annotation.Transactional;

import com.oms.seriesmodel.businessInterface.SeriesServiceImplimation;
import com.oms.seriesmodel.entity.Series;
import com.oms.seriesmodel.repository.SeriesRepository;
import com.oms.seriesmodelDto.SeriesDto;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SeriesService implements SeriesServiceImplimation {
	
	final Logger logger =LoggerFactory.getLogger(SeriesService.class);
	
	@Autowired
	SeriesRepository seriesRepo;
	
	
	public List<SeriesDto> getSeriesDetails(){
		List<SeriesDto> seriesList =null;
		
		try {
			seriesList =seriesRepo.getSeries();
		}
		catch(Exception e) {
			logger.debug("erroe occured while retreiving the series");
			System.out.println(e);
		}
		return seriesList;
	}

}
