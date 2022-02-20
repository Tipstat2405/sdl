package com.scb.sdl.model;

public class SDLBoxSetUp {
	
	private String boxType;
	private String boxDescription;
	private Boolean cms;
	private Boolean inches;
	private Boolean feet;
	private Integer width;
	private Integer height;
	private Integer length;
	
	
	public String getBoxType() {
		return boxType;
	}
	public void setBoxType(String boxType) {
		this.boxType = boxType;
	}
	public String getBoxDescription() {
		return boxDescription;
	}
	public void setBoxDescription(String boxDescription) {
		this.boxDescription = boxDescription;
	}
	public Boolean getCms() {
		return cms;
	}
	public void setCms(Boolean cms) {
		this.cms = cms;
	}
	public Boolean getInches() {
		return inches;
	}
	public void setInches(Boolean inches) {
		this.inches = inches;
	}
	public Boolean getFeet() {
		return feet;
	}
	public void setFeet(Boolean feet) {
		this.feet = feet;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	
	
	@Override
	public String toString() {
		return "SDLBoxSetUp [boxType=" + boxType + ", boxDescription=" + boxDescription + ", cms=" + cms + ", inches="
				+ inches + ", feet=" + feet + ", width=" + width + ", height=" + height + ", length=" + length + "]";
	}
	
	
	

}
