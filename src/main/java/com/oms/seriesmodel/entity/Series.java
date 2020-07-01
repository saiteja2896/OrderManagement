package com.oms.seriesmodel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ORDER_MANAGEMENT_SERIES")
public class Series {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="SERIES_ID" ,nullable = false)
	private int seriesId;
	
	@Column(name="SERIES_CODE")
	private String seriesCode;
	
	@Column(name="SERIES_NAME")
	private String seriesName;
	
	@Column(name="IS_ACTIVE")
	protected char isActive;

	public int getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesCode() {
		return seriesCode;
	}

	public void setSeriesCode(String seriesCode) {
		this.seriesCode = seriesCode;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public char getIsActive() {
		return isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public Series(int seriesId, String seriesCode, String seriesName, char isActive) {
		super();
		this.seriesId = seriesId;
		this.seriesCode = seriesCode;
		this.seriesName = seriesName;
		this.isActive = isActive;
	}

	public Series() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
}
