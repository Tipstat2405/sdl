package com.scb.sdl.model.Response;

public class SDLockerHistoryReportResponse {
	
	private String lockerRefNumber;
	private String boxNumber;
	private String cabinateNumber;
	private String customerName;
	private String relationshipNumber;
	private String accountNumber;
	private String lockerStatus;
	
	public String getLockerRefNumber() {
		return lockerRefNumber;
	}
	public void setLockerRefNumber(String lockerRefNumber) {
		this.lockerRefNumber = lockerRefNumber;
	}
	public String getBoxNumber() {
		return boxNumber;
	}
	public void setBoxNumber(String boxNumber) {
		this.boxNumber = boxNumber;
	}
	public String getCabinateNumber() {
		return cabinateNumber;
	}
	public void setCabinateNumber(String cabinateNumber) {
		this.cabinateNumber = cabinateNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getRelationshipNumber() {
		return relationshipNumber;
	}
	public void setRelationshipNumber(String relationshipNumber) {
		this.relationshipNumber = relationshipNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getLockerStatus() {
		return lockerStatus;
	}
	public void setLockerStatus(String lockerStatus) {
		this.lockerStatus = lockerStatus;
	}
	@Override
	public String toString() {
		return "SDLockerHistoryReportResponse [lockerRefNumber=" + lockerRefNumber + ", boxNumber=" + boxNumber
				+ ", cabinateNumber=" + cabinateNumber + ", customerName=" + customerName + ", relationshipNumber="
				+ relationshipNumber + ", accountNumber=" + accountNumber + ", lockerStatus=" + lockerStatus + "]";
	}
	

	
}
