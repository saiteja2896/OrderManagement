package com.oms.seriesmodel.service;

import org.springframework.transaction.annotation.Transactional;


import com.oms.seriesmodel.entity.Series;
import com.oms.seriesmodel.repository.SeriesRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SeriesService {
	
	@Autowired
	SeriesRepository seriesRepo;
	
	
	public List<Series> getSeriesDetails(){
		return seriesRepo.findAll();
	}

}
