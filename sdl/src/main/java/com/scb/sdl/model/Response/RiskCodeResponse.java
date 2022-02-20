package com.scb.sdl.model.Response;

public class RiskCodeResponse {

	  private Integer riskCode;
	  private String riskDescription;
	  private String riskExpiryDate;
	  private String makerID;
	  private String checkerID;
	  private String makerDate;
	  private String checkerDate;
	public Integer getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(Integer riskCode) {
		this.riskCode = riskCode;
	}
	public String getRiskDescription() {
		return riskDescription;
	}
	public void setRiskDescription(String riskDescription) {
		this.riskDescription = riskDescription;
	}
	public String getRiskExpiryDate() {
		return riskExpiryDate;
	}
	public void setRiskExpiryDate(String riskExpiryDate) {
		this.riskExpiryDate = riskExpiryDate;
	}
	public String getMakerID() {
		return makerID;
	}
	public void setMakerID(String makerID) {
		this.makerID = makerID;
	}
	public String getCheckerID() {
		return checkerID;
	}
	public void setCheckerID(String checkerID) {
		this.checkerID = checkerID;
	}
	public String getMakerDate() {
		return makerDate;
	}
	public void setMakerDate(String makerDate) {
		this.makerDate = makerDate;
	}
	public String getCheckerDate() {
		return checkerDate;
	}
	public void setCheckerDate(String checkerDate) {
		this.checkerDate = checkerDate;
	}
	
	@Override
	public String toString() {
		return "RiskCodeResponse [riskCode=" + riskCode + ", riskDescription=" + riskDescription + ", riskExpiryDate="
				+ riskExpiryDate + ", makerID=" + makerID + ", checkerID=" + checkerID + ", makerDate=" + makerDate
				+ ", checkerDate=" + checkerDate + "]";
	}
	  
	  
}
