package com.scb.sdl.model;

public class SDLBranchDetails {
	
	private String branchCode;
	private String branchName;
	
	
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
	
	@Override
	public String toString() {
		return "SDLBranchDetails [branchCode=" + branchCode + ", branchName=" + branchName + "]";
	}
	
	
	

}
