package com.scb.sdl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.sdl.Repository.SDLBranchEnquiryDao;
import com.scb.sdl.model.Request.SDLBranchEnquiryRequest;
import com.scb.sdl.model.Response.SDLBranchEnquiryResponse;

@Service
public class SDLBranchEnquiryService implements SDLBranchEnquiryServiceImpl{

	@Autowired
	SDLBranchEnquiryDao branchEnquiryDao;

	@Override
	public List<SDLBranchEnquiryResponse> getBranchEnquiryDetailsServiceByAllBranchs(String boxType, String status) {
		// TODO Auto-generated method stub
		return branchEnquiryDao.getBranchEnquiryDetailsByAllBranchs(boxType, status);
	}

	@Override
	public List<SDLBranchEnquiryResponse> getBranchEnquiryDetailsServiceByBranchCode(String branchCode,
			String boxType, String status) {
		// TODO Auto-generated method stub
		return branchEnquiryDao.getBranchEnquiryDetailsByBranchCode(branchCode, boxType, status);
	}

	

	
	
	

	
}
