package com.scb.sdl.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.scb.sdl.model.Request.SDLWaitListEnquiryRequest;
import com.scb.sdl.model.Response.SDLWaitListEnquiryResponse;

@Repository
public class SDLWaitListEnquiryDao {

	public List<SDLWaitListEnquiryResponse> getWaitListEnquiryDetailsDao(String waitingListRefNumber,
			String customerName, String relationshipNumber){
		           List<SDLWaitListEnquiryResponse> waitListEnquiryResponses = new ArrayList<>();
		           SDLWaitListEnquiryResponse waitListEnquiryResponse = new SDLWaitListEnquiryResponse();
		           waitListEnquiryResponse.setBoxNumber("00161");
		           waitListEnquiryResponse.setBranchCode("0157");
		           waitListEnquiryResponse.setBranchName("TNagar");
		           waitListEnquiryResponse.setCabinateNumber("A1057");
		           waitListEnquiryResponse.setCustomerNames("Ramidkd");
		           waitListEnquiryResponse.setDateOfLogging("DD-MM-YYYY");
		           waitListEnquiryResponse.setDimension("L*B*W");
		           waitListEnquiryResponse.setMeasurement("3ft");
		           waitListEnquiryResponse.setRelationshipNumbers("951165411");
		           waitListEnquiryResponse.setWaitingListSerNumber("427A000001");
		           
		           waitListEnquiryResponses.add(waitListEnquiryResponse);
		           
		           return waitListEnquiryResponses;
	}
	
	public List<SDLWaitListEnquiryResponse> getSDLWaitListEnquiryDetailsServiceByBranchCode(String branchCode){
		 List<SDLWaitListEnquiryResponse> waitListEnquiryResponses = new ArrayList<>();
         SDLWaitListEnquiryResponse waitListEnquiryResponse = new SDLWaitListEnquiryResponse();
         waitListEnquiryResponse.setBoxNumber("00161");
         waitListEnquiryResponse.setBranchCode("0157");
         waitListEnquiryResponse.setBranchName("TNagar");
         waitListEnquiryResponse.setCabinateNumber("A1057");
         waitListEnquiryResponse.setCustomerNames("Ramidkd");
         waitListEnquiryResponse.setDateOfLogging("DD-MM-YYYY");
         waitListEnquiryResponse.setDimension("L*B*W");
         waitListEnquiryResponse.setMeasurement("3ft");
         waitListEnquiryResponse.setRelationshipNumbers("951165411");
         waitListEnquiryResponse.setWaitingListSerNumber("427A000001");
         waitListEnquiryResponses.add(waitListEnquiryResponse);
         
         SDLWaitListEnquiryResponse waitListEnquiryResponse2 = new SDLWaitListEnquiryResponse();
         waitListEnquiryResponse2.setBoxNumber("00121");
         waitListEnquiryResponse2.setBranchCode("0157");
         waitListEnquiryResponse2.setBranchName("TNagar");
         waitListEnquiryResponse2.setCabinateNumber("A2016");
         waitListEnquiryResponse2.setCustomerNames("TechM");
         waitListEnquiryResponse2.setDateOfLogging("DD-MM-YYYY");
         waitListEnquiryResponse2.setDimension("L*B*W");
         waitListEnquiryResponse2.setMeasurement("15cm");
         waitListEnquiryResponse2.setRelationshipNumbers("951165411");
         waitListEnquiryResponse2.setWaitingListSerNumber("427C00168");
         waitListEnquiryResponses.add(waitListEnquiryResponse2);
         
         SDLWaitListEnquiryResponse waitListEnquiryResponse3 = new SDLWaitListEnquiryResponse();
         waitListEnquiryResponse3.setBoxNumber("00098");
         waitListEnquiryResponse3.setBranchCode("0157");
         waitListEnquiryResponse3.setBranchName("TNagar");
         waitListEnquiryResponse3.setCabinateNumber("A1057");
         waitListEnquiryResponse3.setCustomerNames("SdlSC");
         waitListEnquiryResponse3.setDateOfLogging("DD-MM-YYYY");
         waitListEnquiryResponse3.setDimension("L*B*W");
         waitListEnquiryResponse3.setMeasurement("20inch");
         waitListEnquiryResponse3.setRelationshipNumbers("951165411");
         waitListEnquiryResponse3.setWaitingListSerNumber("427A000038");
         waitListEnquiryResponses.add(waitListEnquiryResponse3);
         
         return waitListEnquiryResponses;
		
	}
	public List<SDLWaitListEnquiryResponse> getSDLWaitListEnquiryDetailsServiceByWaitingListRefNumber(
			String waitingListRefNumber){
		
		 List<SDLWaitListEnquiryResponse> waitListEnquiryResponses = new ArrayList<>();
         SDLWaitListEnquiryResponse waitListEnquiryResponse = new SDLWaitListEnquiryResponse();
         waitListEnquiryResponse.setBoxNumber("00161");
         waitListEnquiryResponse.setBranchCode("0157");
         waitListEnquiryResponse.setBranchName("TNagar");
         waitListEnquiryResponse.setCabinateNumber("A1057");
         waitListEnquiryResponse.setCustomerNames("Ramidkd");
         waitListEnquiryResponse.setDateOfLogging("DD-MM-YYYY");
         waitListEnquiryResponse.setDimension("L*B*W");
         waitListEnquiryResponse.setMeasurement("3ft");
         waitListEnquiryResponse.setRelationshipNumbers("951165411");
         waitListEnquiryResponse.setWaitingListSerNumber("427A000001");
         
         waitListEnquiryResponses.add(waitListEnquiryResponse);
         
         return waitListEnquiryResponses;
	}
	
}
