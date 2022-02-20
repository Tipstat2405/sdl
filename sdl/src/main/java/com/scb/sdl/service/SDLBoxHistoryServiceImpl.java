package com.scb.sdl.service;

import java.util.List;



import com.scb.sdl.model.Request.SDLBoxHistoryRequest;
import com.scb.sdl.model.Response.SDLBoxHistoryResponse;


public interface SDLBoxHistoryServiceImpl {

	List<SDLBoxHistoryResponse> getBoxHistoryDetailsService(SDLBoxHistoryRequest boxHistoryRequest);
	List<SDLBoxHistoryResponse> getBoxHistoryDetailsServiceByBranch(String branchCode,String boxNumber);
}
