package com.scb.sdl.model;

public class SDLBranchChange {
	
	private String oldBranchCode;
	private String oldCabinetNumber;
	private String newBranchCode;
	private String newCabinetNumber;
	
	public String getOldBranchCode() {
		return oldBranchCode;
	}
	public void setOldBranchCode(String oldBranchCode) {
		this.oldBranchCode = oldBranchCode;
	}
	public String getOldCabinetNumber() {
		return oldCabinetNumber;
	}
	public void setOldCabinetNumber(String oldCabinetNumber) {
		this.oldCabinetNumber = oldCabinetNumber;
	}
	public String getNewBranchCode() {
		return newBranchCode;
	}
	public void setNewBranchCode(String newBranchCode) {
		this.newBranchCode = newBranchCode;
	}
	public String getNewCabinetNumber() {
		return newCabinetNumber;
	}
	public void setNewCabinetNumber(String newCabinetNumber) {
		this.newCabinetNumber = newCabinetNumber;
	}
	
	@Override
	public String toString() {
		return "SDLBranchChange [oldBranchCode=" + oldBranchCode + ", oldCabinetNumber=" + oldCabinetNumber
				+ ", newBranchCode=" + newBranchCode + ", newCabinetNumber=" + newCabinetNumber + "]";
	}
	
	
	
	
	
	
	

}
