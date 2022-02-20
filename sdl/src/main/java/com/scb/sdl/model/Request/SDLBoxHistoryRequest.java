package com.scb.sdl.model.Request;

public class SDLBoxHistoryRequest {

	private String branchCode;
	private String cabinateNumber;
	private String boxNumber;
	
	
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
	
	@Override
	public String toString() {
		return "SDLBoxHistory [branchCode=" + branchCode + ", cabinateNumber=" + cabinateNumber + ", boxNumber="
				+ boxNumber + "]";
	}
	
}
