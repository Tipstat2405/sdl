package com.scb.sdl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.sdl.model.Request.SDLWaitListEnquiryRequest;
import com.scb.sdl.model.Response.SDLWaitListEnquiryResponse;
import com.scb.sdl.service.SDLWaitListEnquiryService;

@RestController
@RequestMapping("/enquiry/sdl")
public class SDLWaitListEnquiryController {
	
	@Autowired
	SDLWaitListEnquiryService waitListEnquiryService;
	
	@GetMapping("/waitlistenquiry")
	public List<SDLWaitListEnquiryResponse> getSDLWaitListEnquiryDetails(@RequestBody SDLWaitListEnquiryRequest waitListEnquiryRequest){
		List<SDLWaitListEnquiryResponse> waitListEnquiryResponses = new ArrayList<>();
		if (null != waitListEnquiryRequest.getWaitingListRefNumber() || null != waitListEnquiryRequest.getRelationshipNumber() || null != waitListEnquiryRequest.getCustomerName()) {
			waitListEnquiryResponses = waitListEnquiryService.getSDLWaitListEnquiryDetailsService(waitListEnquiryRequest.getWaitingListRefNumber(), waitListEnquiryRequest.getRelationshipNumber(), waitListEnquiryRequest.getCustomerName());
		}else if (null != waitListEnquiryRequest.getBranchCode()) {
			waitListEnquiryResponses = waitListEnquiryService.getSDLWaitListEnquiryDetailsServiceByBranchCode(waitListEnquiryRequest.getBranchCode());
			
		}else if (null != waitListEnquiryRequest.getWaitingListRefNumber()) {
			waitListEnquiryResponses = waitListEnquiryService.getSDLWaitListEnquiryDetailsServiceByWaitingListRefNumber(waitListEnquiryRequest.getWaitingListRefNumber());
		}
		
		
		return waitListEnquiryResponses;
	}

}
