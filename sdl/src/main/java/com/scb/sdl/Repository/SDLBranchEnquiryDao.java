package com.scb.sdl.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.scb.sdl.model.Response.SDLBranchEnquiryResponse;

@Repository
public class SDLBranchEnquiryDao {

	public List<SDLBranchEnquiryResponse> getBranchEnquiryDetailsByAllBranchs(String boxType, String status){
		
		List<SDLBranchEnquiryResponse> branchEnquiryResponses = new ArrayList<>();
		SDLBranchEnquiryResponse branchEnquiryResponse = new SDLBranchEnquiryResponse();
		branchEnquiryResponse.setBranchCode("0157");
		branchEnquiryResponse.setBoxNumber("00161");
		branchEnquiryResponse.setBoxDescription("A Box");
		branchEnquiryResponse.setCabinateNumber("A1057");
		branchEnquiryResponse.setChargeAccountNumber("35642565");
		branchEnquiryResponse.setDimension("L*B*W");
		branchEnquiryResponse.setLockerRefNumber("LB427A00056");
		branchEnquiryResponse.setMeasurement("2f");
		branchEnquiryResponse.setRelationshipNumber("9398555699");
		branchEnquiryResponse.setStatus("Available");
		branchEnquiryResponse.setBoxType("A");
		branchEnquiryResponses.add(branchEnquiryResponse);
		
		SDLBranchEnquiryResponse branchEnquiryResponse2 = new SDLBranchEnquiryResponse();
		branchEnquiryResponse2.setBranchCode("0161");
		branchEnquiryResponse2.setBoxNumber("00298");
		branchEnquiryResponse2.setBoxDescription("A Box");
		branchEnquiryResponse2.setCabinateNumber("A2016");
		branchEnquiryResponse2.setChargeAccountNumber("45698123");
		branchEnquiryResponse2.setDimension("L*B*W");
		branchEnquiryResponse2.setLockerRefNumber("LB427A00001");
		branchEnquiryResponse2.setMeasurement("6cm");
		branchEnquiryResponse2.setRelationshipNumber("594663215");
		branchEnquiryResponse2.setStatus("Available");
		branchEnquiryResponse2.setBoxType("E");
		branchEnquiryResponses.add(branchEnquiryResponse2);
		
		SDLBranchEnquiryResponse branchEnquiryResponse3 = new SDLBranchEnquiryResponse();
		branchEnquiryResponse3.setBranchCode("0078");
		branchEnquiryResponse3.setBoxNumber("00198");
		branchEnquiryResponse3.setBoxDescription("C Box");
		branchEnquiryResponse3.setCabinateNumber("A0054");
		branchEnquiryResponse3.setChargeAccountNumber("35642565");
		branchEnquiryResponse3.setDimension("L*B*W");
		branchEnquiryResponse3.setLockerRefNumber("LB427C000217");
		branchEnquiryResponse3.setMeasurement("8in");
		branchEnquiryResponse3.setRelationshipNumber("69411365556");
		branchEnquiryResponse3.setStatus("Occupied");
		branchEnquiryResponse3.setBoxType("C");
		branchEnquiryResponses.add(branchEnquiryResponse3);
		
		
		return branchEnquiryResponses;
	}
	
    public List<SDLBranchEnquiryResponse> getBranchEnquiryDetailsByBranchCode(String branchCode,String boxType, String status){
		
		List<SDLBranchEnquiryResponse> branchEnquiryResponses = new ArrayList<>();
		
		SDLBranchEnquiryResponse branchEnquiryResponse = new SDLBranchEnquiryResponse();
		branchEnquiryResponse.setBranchCode("0157");
		branchEnquiryResponse.setBoxNumber("00161");
		branchEnquiryResponse.setBoxDescription("A Box");
		branchEnquiryResponse.setCabinateNumber("A1057");
		branchEnquiryResponse.setChargeAccountNumber("35642565");
		branchEnquiryResponse.setDimension("L*B*W");
		branchEnquiryResponse.setLockerRefNumber("LB427A00056");
		branchEnquiryResponse.setMeasurement("2f");
		branchEnquiryResponse.setRelationshipNumber("9398555699");
		branchEnquiryResponse.setStatus("Available");
		branchEnquiryResponse.setBoxType("A");
		
		branchEnquiryResponses.add(branchEnquiryResponse);
	
		return branchEnquiryResponses;
	}
}