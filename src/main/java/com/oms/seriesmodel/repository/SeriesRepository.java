package com.oms.seriesmodel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.oms.seriesmodel.entity.Series;
import com.oms.seriesmodelDto.ModelDto;
import com.oms.seriesmodelDto.SeriesDto;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Integer> {

	
	@Query("select new com.oms.seriesmodelDto.SeriesDto(s.seriesId,s.seriesName) from Series s where s.isActive='Y'")
	public List<SeriesDto> getSeries();
}
