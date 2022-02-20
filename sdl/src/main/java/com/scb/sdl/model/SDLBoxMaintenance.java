package com.scb.sdl.model;

public class SDLBoxMaintenance {
	
	private String branchCode;
	private String branchName;
	private String cabinateNumber;
	private String boxNumber;
	private String boxType;
	private String keyNumber;
	private Integer rowNumber;
	private Integer columnNumber;
	private String lockerReferenceNumber;
	private String lockerStatus;
	
	
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
	public String getBoxType() {
		return boxType;
	}
	public void setBoxType(String boxType) {
		this.boxType = boxType;
	}
	public String getKeyNumber() {
		return keyNumber;
	}
	public void setKeyNumber(String keyNumber) {
		this.keyNumber = keyNumber;
	}
	public Integer getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(Integer rowNumber) {
		this.rowNumber = rowNumber;
	}
	public Integer getColumnNumber() {
		return columnNumber;
	}
	public void setColumnNumber(Integer columnNumber) {
		this.columnNumber = columnNumber;
	}
	public String getLockerReferenceNumber() {
		return lockerReferenceNumber;
	}
	public void setLockerReferenceNumber(String lockerReferenceNumber) {
		this.lockerReferenceNumber = lockerReferenceNumber;
	}
	public String getLockerStatus() {
		return lockerStatus;
	}
	public void setLockerStatus(String lockerStatus) {
		this.lockerStatus = lockerStatus;
	}
	
	@Override
	public String toString() {
		return "SDLBoxMaintenance [branchCode=" + branchCode + ", branchName=" + branchName + ", cabinateNumber="
				+ cabinateNumber + ", boxNumber=" + boxNumber + ", boxType=" + boxType + ", keyNumber=" + keyNumber
				+ ", rowNumber=" + rowNumber + ", columnNumber=" + columnNumber + ", lockerReferenceNumber="
				+ lockerReferenceNumber + ", lockerStatus=" + lockerStatus + "]";
	}
	
	
	
	
	
	
	
	
	

}
