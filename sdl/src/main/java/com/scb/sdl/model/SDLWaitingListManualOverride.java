package com.scb.sdl.model;

public class SDLWaitingListManualOverride {
	
	private String branchCode;
	private String branchName;
	private String boxType;
	private String waitingListRefNumber;
	private String customerName;
	private Boolean manualOverride;
	private String relationshipNumber;
	private String remarks;
	
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBoxType() {
		return boxType;
	}
	public void setBoxType(String boxType) {
		this.boxType = boxType;
	}
	public String getWaitingListRefNumber() {
		return waitingListRefNumber;
	}
	public void setWaitingListRefNumber(String waitingListRefNumber) {
		this.waitingListRefNumber = waitingListRefNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Boolean getManualOverride() {
		return manualOverride;
	}
	public void setManualOverride(Boolean manualOverride) {
		this.manualOverride = manualOverride;
	}
	public String getRelationshipNumber() {
		return relationshipNumber;
	}
	public void setRelationshipNumber(String relationshipNumber) {
		this.relationshipNumber = relationshipNumber;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
	public String toString() {
		return "SDLWaitingListManualOverride [branchCode=" + branchCode + ", branchName=" + branchName + ", boxType="
				+ boxType + ", waitingListRefNumber=" + waitingListRefNumber + ", customerName=" + customerName
				+ ", manualOverride=" + manualOverride + ", relationshipNumber=" + relationshipNumber + ", remarks="
				+ remarks + "]";
	}
	
	
	
	
	

}
