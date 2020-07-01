package com.oms.seriesmodel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_MANAGEMENT_MODEL")
public class Model {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="MODEL_ID")
	private String modelId;
	
	@Column(name ="MODEL_NAME")
	private String modelName;
	
	@Column(name ="SERIES_ID")
	private int seriesId;
	
	@Column(name ="price")
	private Long price;
	
	@Column(name ="IS_ACTIVE")
	protected char isActive;

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public char getIsActive() {
		return isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public Model(String modelId, String modelName, int seriesId, Long price, char isActive) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.seriesId = seriesId;
		this.price = price;
		this.isActive = isActive;
	}

	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
