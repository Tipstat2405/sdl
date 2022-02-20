package com.scb.sdl.model.Request;

public class SDLBranchEnquiryRequest {

	private String branchCode;
	private String boxType;
	private Boolean allBranch;
	private String status;
	
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	
	public String getBoxType() {
		return boxType;
	}
	public void setBoxType(String boxType) {
		this.boxType = boxType;
	}
	public Boolean getAllBranch() {
		return allBranch;
	}
	public void setAllBranch(Boolean allBranch) {
		this.allBranch = allBranch;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "SDLBranchEnquiryRequest [branchCode=" + branchCode + ", branchType=" + boxType + ", allBranch="
				+ allBranch + ", status=" + status + "]";
	}
	
	
	
}
