package com.oms.seriesmodelDto;

public class ModelDto {

    private int modelId;
    
    private String modelName;
	
	private int seriesId;
	
	private long price;
	
	protected char isActive;
	
	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public char getIsActive() {
		return isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public ModelDto(int modelId, String modelName ,long price) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.price = price;
	}

	

	
}
