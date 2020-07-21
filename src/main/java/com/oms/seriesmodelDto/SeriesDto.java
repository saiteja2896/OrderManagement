package com.oms.seriesmodelDto;

public class SeriesDto {
	
	
	private int seriesId;
	
	private String SeriesCode;
	
	private String SeriesName;
	
	protected char isActive;

	public int getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesCode() {
		return SeriesCode;
	}

	public void setSeriesCode(String seriesCode) {
		SeriesCode = seriesCode;
	}

	public String getSeriesName() {
		return SeriesName;
	}

	public void setSeriesName(String seriesName) {
		SeriesName = seriesName;
	}

	public char getIsActive() {
		return isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public SeriesDto(int seriesId, String seriesName) {
		super();
		this.seriesId = seriesId;
		this.SeriesName = seriesName;
	}

	public SeriesDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
