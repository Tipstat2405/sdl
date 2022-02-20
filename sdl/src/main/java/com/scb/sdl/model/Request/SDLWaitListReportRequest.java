package com.scb.sdl.model.Request;

public class SDLWaitListReportRequest {

	private String branchCode;
	private String branchName;
	private String waitingListRigisteredDate;
	private String waitingListRefNumber;
	private String waitingListSerNumber;
	private String prefLockerType;
	private String customerName;
	private String relationshipNumber;
	private String mobileNumber;
	
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
	public String getWaitingListRigisteredDate() {
		return waitingListRigisteredDate;
	}
	public void setWaitingListRigisteredDate(String waitingListRigisteredDate) {
		this.waitingListRigisteredDate = waitingListRigisteredDate;
	}
	public String getWaitingListRefNumber() {
		return waitingListRefNumber;
	}
	public void setWaitingListRefNumber(String waitingListRefNumber) {
		this.waitingListRefNumber = waitingListRefNumber;
	}
	public String getWaitingListSerNumber() {
		return waitingListSerNumber;
	}
	public void setWaitingListSerNumber(String waitingListSerNumber) {
		this.waitingListSerNumber = waitingListSerNumber;
	}
	public String getPrefLockerType() {
		return prefLockerType;
	}
	public void setPrefLockerType(String prefLockerType) {
		this.prefLockerType = prefLockerType;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		return "SDLWaitListReportRequest [branchCode=" + branchCode + ", branchName=" + branchName
				+ ", waitingListRigisteredDate=" + waitingListRigisteredDate + ", waitingListRefNumber="
				+ waitingListRefNumber + ", waitingListSerNumber=" + waitingListSerNumber + ", prefLockerType="
				+ prefLockerType + ", customerName=" + customerName + ", relationshipNumber=" + relationshipNumber
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
	
	
	
	
}
