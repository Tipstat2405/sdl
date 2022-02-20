package com.scb.sdl.model;

public class SDLSegmentDetails {
	
	private Integer segmentCode;
	private String segmentDescription;
	
	
	public Integer getSegmentCode() {
		return segmentCode;
	}
	public void setSegmentCode(Integer segmentCode) {
		this.segmentCode = segmentCode;
	}
	public String getSegmentDescription() {
		return segmentDescription;
	}
	public void setSegmentDescription(String segmentDescription) {
		this.segmentDescription = segmentDescription;
	}
	@Override
	public String toString() {
		return "SDLSegmentDetails [segmentCode=" + segmentCode + ", segmentDescription=" + segmentDescription + "]";
	}
	
	

}
