package com.oms.seriesmodel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.oms.seriesmodel.entity.Series;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Integer> {

}
