package com.scb.sdl.service;

import java.util.List;


import com.scb.sdl.model.Response.SDLWaitListEnquiryResponse;

public interface SDLWaitListEnquiryServiceImpl {
	
	List<SDLWaitListEnquiryResponse> getSDLWaitListEnquiryDetailsService(String waitingListRefNumber, String customerName, String relationshipNumber);
	List<SDLWaitListEnquiryResponse> getSDLWaitListEnquiryDetailsServiceByBranchCode(String branchCode);
	List<SDLWaitListEnquiryResponse> getSDLWaitListEnquiryDetailsServiceByWaitingListRefNumber(String waitingListRefNumber);

}
