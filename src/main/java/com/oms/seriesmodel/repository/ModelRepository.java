package com.oms.seriesmodel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oms.seriesmodel.entity.Model;
import com.oms.seriesmodelDto.ModelDto;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer> {

	
	@Query("select new com.oms.seriesmodelDto.ModelDto(o.modelName) from Model o where o.seriesId =:seriesId")
	public List<ModelDto> getModel(@Param("seriesId") Integer seriesId);
}
