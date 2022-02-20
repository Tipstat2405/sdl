package com.scb.sdl.model.Response;

public class SDLockerAccessReportResponse {
	
	private String branchCode;
	private String branchName;
	private String lockerRefNumber;
	private String boxNumber;
	private String cabinateNumber;
	private String relationshipNumber;
	private String accountNumber;
	private String customerName;
	private String boxName;
	private String poaRefNumber;
	private String poaRefNames;
	private String entryTime;
	private String exitTime;
	private String makerID;
	private String checkerID;
	private String dateOfAccess;
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
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBoxName() {
		return boxName;
	}
	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}
	public String getPoaRefNumber() {
		return poaRefNumber;
	}
	public void setPoaRefNumber(String poaRefNumber) {
		this.poaRefNumber = poaRefNumber;
	}
	public String getPoaRefNames() {
		return poaRefNames;
	}
	public void setPoaRefNames(String poaRefNames) {
		this.poaRefNames = poaRefNames;
	}
	public String getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}
	public String getExitTime() {
		return exitTime;
	}
	public void setExitTime(String exitTime) {
		this.exitTime = exitTime;
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
	public String getDateOfAccess() {
		return dateOfAccess;
	}
	public void setDateOfAccess(String dateOfAccess) {
		this.dateOfAccess = dateOfAccess;
	}
	
	@Override
	public String toString() {
		return "SDLockerAccessReportResponse [branchCode=" + branchCode + ", branchName=" + branchName
				+ ", lockerRefNumber=" + lockerRefNumber + ", boxNumber=" + boxNumber + ", cabinateNumber="
				+ cabinateNumber + ", relationshipNumber=" + relationshipNumber + ", accountNumber=" + accountNumber
				+ ", customerName=" + customerName + ", boxName=" + boxName + ", poaRefNumber=" + poaRefNumber
				+ ", poaRefNames=" + poaRefNames + ", entryTime=" + entryTime + ", exitTime=" + exitTime + ", makerID="
				+ makerID + ", checkerID=" + checkerID + ", dateOfAccess=" + dateOfAccess + "]";
	}
	
	

}
