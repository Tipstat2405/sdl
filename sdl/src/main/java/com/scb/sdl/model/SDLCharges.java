package com.scb.sdl.model;

public class SDLCharges {
	
	private String branchCode;
	private String branchDescription;
	private String boxType;
	private Integer segmentCode;
	private String segmentDescription;
	private String chargeCode;
	private String chargeDescription;
	private String frequency;
	private Integer chargeAmount;
	
	
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchDescription() {
		return branchDescription;
	}
	public void setBranchDescription(String branchDescription) {
		this.branchDescription = branchDescription;
	}
	public String getBoxType() {
		return boxType;
	}
	public void setBoxType(String boxType) {
		this.boxType = boxType;
	}
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
	public String getChargeCode() {
		return chargeCode;
	}
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}
	public String getChargeDescription() {
		return chargeDescription;
	}
	public void setChargeDescription(String chargeDescription) {
		this.chargeDescription = chargeDescription;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public Integer getChargeAmount() {
		return chargeAmount;
	}
	public void setChargeAmount(Integer chargeAmount) {
		this.chargeAmount = chargeAmount;
	}
	
	@Override
	public String toString() {
		return "SDLCharges [branchCode=" + branchCode + ", branchDescription=" + branchDescription + ", boxType="
				+ boxType + ", segmentCode=" + segmentCode + ", segmentDescription=" + segmentDescription
				+ ", chargeCode=" + chargeCode + ", chargeDescription=" + chargeDescription + ", frequency=" + frequency
				+ ", chargeAmount=" + chargeAmount + "]";
	}
	
	
	
	

}
