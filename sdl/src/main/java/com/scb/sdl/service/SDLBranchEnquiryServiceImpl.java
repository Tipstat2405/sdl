package com.scb.sdl.service;

import java.util.List;


import com.scb.sdl.model.Response.SDLBranchEnquiryResponse;

public interface SDLBranchEnquiryServiceImpl {

	  List<SDLBranchEnquiryResponse> getBranchEnquiryDetailsServiceByAllBranchs(String branchType, String status);
	  List<SDLBranchEnquiryResponse> getBranchEnquiryDetailsServiceByBranchCode(String branchCode,String branchType, String status);
}
