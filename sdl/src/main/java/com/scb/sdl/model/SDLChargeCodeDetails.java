package com.scb.sdl.model;

public class SDLChargeCodeDetails {
	
	private String chargeCode;
	private String chargeDescription;
	
	
	public String getChargeCode() {
		return chargeCode;
	}
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}
	public String getChargeDescription() {
		return chargeDescription;
	}
	public void setChargeDescription(String chargeDescription) {
		this.chargeDescription = chargeDescription;
	}
	@Override
	public String toString() {
		return "SDLChargeCodeDetails [chargeCode=" + chargeCode + ", chargeDescription=" + chargeDescription + "]";
	}
	
	
	
	
	

}
