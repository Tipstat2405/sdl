package com.scb.sdl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.sdl.Repository.SDLWaitListEnquiryDao;
import com.scb.sdl.model.Request.SDLWaitListEnquiryRequest;
import com.scb.sdl.model.Response.SDLWaitListEnquiryResponse;

@Service
public class SDLWaitListEnquiryService implements SDLWaitListEnquiryServiceImpl{

	@Autowired
	SDLWaitListEnquiryDao waitListEnquiryDao;

	@Override
	public List<SDLWaitListEnquiryResponse> getSDLWaitListEnquiryDetailsService(String waitingListRefNumber,
			String customerName, String relationshipNumber) {
		
		return waitListEnquiryDao.getWaitListEnquiryDetailsDao(waitingListRefNumber, customerName, relationshipNumber);
	}

	@Override
	public List<SDLWaitListEnquiryResponse> getSDLWaitListEnquiryDetailsServiceByBranchCode(String branchCode) {
		// TODO Auto-generated method stub
		return waitListEnquiryDao.getSDLWaitListEnquiryDetailsServiceByBranchCode(branchCode);
	}

	@Override
	public List<SDLWaitListEnquiryResponse> getSDLWaitListEnquiryDetailsServiceByWaitingListRefNumber(
			String waitingListRefNumber) {
		// TODO Auto-generated method stub
		return waitListEnquiryDao.getSDLWaitListEnquiryDetailsServiceByWaitingListRefNumber(waitingListRefNumber);
	}

	
	
	

}
