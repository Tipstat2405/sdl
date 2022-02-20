package com.scb.sdl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.sdl.Repository.SDLBoxHistoryDao;
import com.scb.sdl.model.Request.SDLBoxHistoryRequest;
import com.scb.sdl.model.Response.SDLBoxHistoryResponse;

@Service
public class SDLBoxHistoryService implements SDLBoxHistoryServiceImpl {

	@Autowired
	SDLBoxHistoryDao boxHistoryDao;

	@Override
	public List<SDLBoxHistoryResponse> getBoxHistoryDetailsService(SDLBoxHistoryRequest boxHistoryRequest) {
		// TODO Auto-generated method stub
		return boxHistoryDao.boxHistoryDetails(boxHistoryRequest);
	}

	@Override
	public List<SDLBoxHistoryResponse> getBoxHistoryDetailsServiceByBranch(String branchCode, String boxNumber) {
		// TODO Auto-generated method stub
		return boxHistoryDao.getBoxHistoryDetailsServiceByBranch(branchCode, boxNumber);
	}
	
	
}
