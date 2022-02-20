package com.scb.sdl.model.Response;

import java.util.ArrayList;
import java.util.List;



public class SDLBoxHistoryResponse {

	private String boxType;
	private String branchCode;
	private String cabinateNumber;
	private String boxNumber;
	private String boxName;
	private String customerNames;
	private String relationshipNumbers;
	private String dateOfAllocation;
	private String lockerBoxStatus;
	private String statusChangeDate;
	private List<RiskCodeResponse> riskCode = new ArrayList<>();
	
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
	
	public String getBoxName() {
		return boxName;
	}
	
	public void setBoxName(String boxName) {
		this.boxName = boxName;
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
	
	public String getDateOfAllocation() {
		return dateOfAllocation;
	}
	
	public void setDateOfAllocation(String dateOfAllocation) {
		this.dateOfAllocation = dateOfAllocation;
	}
	
	public String getLockerBoxStatus() {
		return lockerBoxStatus;
	}
	
	public void setLockerBoxStatus(String lockerBoxStatus) {
		this.lockerBoxStatus = lockerBoxStatus;
	}
	
	public String getStatusChangeDate() {
		return statusChangeDate;
	}
	
	public void setStatusChangeDate(String statusChangeDate) {
		this.statusChangeDate = statusChangeDate;
	}
	
	public List<RiskCodeResponse> getRiskCode() {
		return riskCode;
	}
	
	public void setRiskCode(List<RiskCodeResponse> riskCode) {
		this.riskCode = riskCode;
	}
	
	@Override
	public String toString() {
		return "SDLBoxHistoryResponse [boxType=" + boxType + ", branchCode=" + branchCode + ", cabinateNumber="
				+ cabinateNumber + ", boxNumber=" + boxNumber + ", boxName=" + boxName + ", customerNames="
				+ customerNames + ", relationshipNumbers=" + relationshipNumbers + ", dateOfAllocation="
				+ dateOfAllocation + ", lockerBoxStatus=" + lockerBoxStatus + ", statusChangeDate=" + statusChangeDate
				+ ", riskCode=" + riskCode + "]";
	}
	
	
}
