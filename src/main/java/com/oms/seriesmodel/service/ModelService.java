package com.oms.seriesmodel.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oms.seriesmodel.businessInterface.ModelServiceImplimation;
import com.oms.seriesmodel.entity.Model;
import com.oms.seriesmodel.repository.ModelRepository;
import com.oms.seriesmodelDto.ModelDto;

@Service
@Transactional
public class ModelService implements ModelServiceImplimation{

	final Logger logger =LoggerFactory.getLogger(ModelService.class);
	
	
	@Autowired
	ModelRepository modelRepo;
	


	public List<ModelDto> getModelDetails(int modeldto) {
		List<ModelDto> modelList=null;
		try {
			modelList=modelRepo.getModel(modeldto);
		}
		catch(Exception e){
			logger.debug("Exception");
			System.out.println(e);
		}
		return modelList;
	}
}
