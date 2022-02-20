package com.scb.sdl.model.Request;

public class SDLWaitListEnquiryRequest {
	
	private String branchCode;
	private String customerName;
	private String relationshipNumber;
	private String waitingListRefNumber;
	
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
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
	public String getWaitingListRefNumber() {
		return waitingListRefNumber;
	}
	public void setWaitingListRefNumber(String waitingListRefNumber) {
		this.waitingListRefNumber = waitingListRefNumber;
	}
	
	@Override
	public String toString() {
		return "SDLWaitListEnquiryRequest [branchCode=" + branchCode + ", customerName=" + customerName
				+ ", relationshipNumber=" + relationshipNumber + ", waitingListRefNumber=" + waitingListRefNumber + "]";
	}
	
	

}
