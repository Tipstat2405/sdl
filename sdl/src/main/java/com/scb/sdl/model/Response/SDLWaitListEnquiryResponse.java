package com.scb.sdl.model.Response;

public class SDLWaitListEnquiryResponse {
	
	
	private String branchCode;
	private String cabinateNumber;
	private String boxNumber;
	private String branchName;
	private String waitingListSerNumber;
	private String customerNames;
	private String relationshipNumbers;
	private String dimension;
	private String measurement;
	private String dateOfLogging;
	
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getCabinateNumber() {
		return cabinateNumber;
	}
	public void setCabinateNumber(String cabinateNumber) {
		this.cabinateNumber = cabinateNumber;
	}
	public String getBoxNumber() {
		return boxNumber;
	}
	public void setBoxNumber(String boxNumber) {
		this.boxNumber = boxNumber;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getWaitingListSerNumber() {
		return waitingListSerNumber;
	}
	public void setWaitingListSerNumber(String waitingListSerNumber) {
		this.waitingListSerNumber = waitingListSerNumber;
	}
	public String getCustomerNames() {
		return customerNames;
	}
	public void setCustomerNames(String customerNames) {
		this.customerNames = customerNames;
	}
	public String getRelationshipNumbers() {
		return relationshipNumbers;
	}
	public void setRelationshipNumbers(String relationshipNumbers) {
		this.relationshipNumbers = relationshipNumbers;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getMeasurement() {
		return measurement;
	}
	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}
	public String getDateOfLogging() {
		return dateOfLogging;
	}
	public void setDateOfLogging(String dateOfLogging) {
		this.dateOfLogging = dateOfLogging;
	}
	
	@Override
	public String toString() {
		return "SDLWaitListEnquiryResponse [branchCode=" + branchCode + ", cabinateNumber=" + cabinateNumber
				+ ", boxNumber=" + boxNumber + ", branchName=" + branchName + ", waitingListSerNumber="
				+ waitingListSerNumber + ", customerNames=" + customerNames + ", relationshipNumbers="
				+ relationshipNumbers + ", dimension=" + dimension + ", measurement=" + measurement + ", dateOfLogging="
				+ dateOfLogging + "]";
	}
	
	
	
	

}
