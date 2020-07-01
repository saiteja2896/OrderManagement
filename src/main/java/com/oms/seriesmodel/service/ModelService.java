package com.oms.seriesmodel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oms.seriesmodel.entity.Model;
import com.oms.seriesmodel.repository.ModelRepository;
import com.oms.seriesmodelDto.ModelDto;

@Service
@Transactional
public class ModelService {

	@Autowired
	ModelRepository modelRepo;
	
	public List<ModelDto> getModelDetails(){
		Integer number=3;
		return modelRepo.getModel(number);
	}
}
