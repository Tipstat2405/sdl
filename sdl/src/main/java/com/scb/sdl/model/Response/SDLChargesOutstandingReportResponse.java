package com.scb.sdl.model.Response;

public class SDLChargesOutstandingReportResponse {

	
	private String lockerRefNumber;
	private String boxNumber;
	private String cabinateNumber;
	private String chargeCode;
	private String accountNumber;
	private String customerName;
	private String chargeAmounOutstanding;
	private String noOfCycles;
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
	public String getChargeCode() {
		return chargeCode;
	}
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getChargeAmounOutstanding() {
		return chargeAmounOutstanding;
	}
	public void setChargeAmounOutstanding(String chargeAmounOutstanding) {
		this.chargeAmounOutstanding = chargeAmounOutstanding;
	}
	public String getNoOfCycles() {
		return noOfCycles;
	}
	public void setNoOfCycles(String noOfCycles) {
		this.noOfCycles = noOfCycles;
	}
	@Override
	public String toString() {
		return "SDLChargesOutstandingReportResponse [lockerRefNumber=" + lockerRefNumber + ", boxNumber=" + boxNumber
				+ ", cabinateNumber=" + cabinateNumber + ", chargeCode=" + chargeCode + ", accountNumber="
				+ accountNumber + ", customerName=" + customerName + ", chargeAmounOutstanding="
				+ chargeAmounOutstanding + ", noOfCycles=" + noOfCycles + "]";
	}
	
	
	
}
