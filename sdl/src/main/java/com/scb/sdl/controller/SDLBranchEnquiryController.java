package com.scb.sdl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.sdl.model.Request.SDLBranchEnquiryRequest;
import com.scb.sdl.model.Response.SDLBranchEnquiryResponse;
import com.scb.sdl.service.SDLBranchEnquiryService;
import org.apache.commons.lang3.StringUtils;


@RestController
@RequestMapping("/enquiry/sdl")
public class SDLBranchEnquiryController {
	
	@Autowired
	SDLBranchEnquiryService branchEnquiryService;
	
	@GetMapping("/branch")
	public List<SDLBranchEnquiryResponse> getSDLBranchEnquiryDetails(@RequestBody SDLBranchEnquiryRequest branchEnquiryRequest){
		
		List<SDLBranchEnquiryResponse> branchEnquiryResponses = new ArrayList<>();
		if (branchEnquiryRequest.getAllBranch().equals(true) && branchEnquiryRequest.getStatus() !=  null && branchEnquiryRequest.getBoxType() !=  null) {
			branchEnquiryResponses = branchEnquiryService.getBranchEnquiryDetailsServiceByAllBranchs(branchEnquiryRequest.getStatus(), branchEnquiryRequest.getBoxType());
		}else {
			branchEnquiryResponses = branchEnquiryService.getBranchEnquiryDetailsServiceByBranchCode(branchEnquiryRequest.getBranchCode(), branchEnquiryRequest.getStatus(), branchEnquiryRequest.getBoxType());
		}
		return branchEnquiryResponses;
		
	}

}
