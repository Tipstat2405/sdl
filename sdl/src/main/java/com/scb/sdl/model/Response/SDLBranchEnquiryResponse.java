package com.scb.sdl.model.Response;

public class SDLBranchEnquiryResponse {
	private String boxType;
	private String branchCode;
	private String cabinateNumber;
	private String boxNumber;
	private String boxDescription;
	private String relationshipNumber;
	private String dimension;
	private String measurement;
	private String status;
	private String chargeAccountNumber;
	private String lockerRefNumber;
	
	
	public String getBoxType() {
		return boxType;
	}
	public void setBoxType(String boxType) {
		this.boxType = boxType;
	}
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
	public String getBoxDescription() {
		return boxDescription;
	}
	public void setBoxDescription(String boxDescription) {
		this.boxDescription = boxDescription;
	}
	public String getRelationshipNumber() {
		return relationshipNumber;
	}
	public void setRelationshipNumber(String relationshipNumber) {
		this.relationshipNumber = relationshipNumber;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getChargeAccountNumber() {
		return chargeAccountNumber;
	}
	public void setChargeAccountNumber(String chargeAccountNumber) {
		this.chargeAccountNumber = chargeAccountNumber;
	}
	public String getLockerRefNumber() {
		return lockerRefNumber;
	}
	public void setLockerRefNumber(String lockerRefNumber) {
		this.lockerRefNumber = lockerRefNumber;
	}
	
	@Override
	public String toString() {
		return "SDLBranchEnquiryResponse [boxType=" + boxType + ", branchCode=" + branchCode + ", cabinateNumber="
				+ cabinateNumber + ", boxNumber=" + boxNumber + ", boxDescription=" + boxDescription
				+ ", relationshipNumber=" + relationshipNumber + ", dimension=" + dimension + ", measurement="
				+ measurement + ", status=" + status + ", chargeAccountNumber=" + chargeAccountNumber
				+ ", lockerRefNumber=" + lockerRefNumber + "]";
	}
	
	
	
	
	
	
}
