package com.scb.sdl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.sdl.model.Request.SDLBoxHistoryRequest;
import com.scb.sdl.model.Response.SDLBoxHistoryResponse;
import com.scb.sdl.service.SDLBoxHistoryService;

@RestController
@RequestMapping("/enquiry/sdl")
public class SDLBoxHistoryEnquiryController {
	
	@Autowired
	SDLBoxHistoryService boxHistoryService;
	
	@GetMapping("/boxhistory")
	public List<SDLBoxHistoryResponse> getBoxHistoryEnquiryDetails(@RequestBody SDLBoxHistoryRequest boxHistoryRequest){
		List<SDLBoxHistoryResponse> boxHistoryResponses = new ArrayList<>();
		if(null != boxHistoryRequest.getBoxNumber() && null != boxHistoryRequest.getBoxNumber()) {
			boxHistoryResponses = boxHistoryService.getBoxHistoryDetailsServiceByBranch(boxHistoryRequest.getBoxNumber(), boxHistoryRequest.getBoxNumber());
		}else if (null != boxHistoryRequest.getBoxNumber() || null != boxHistoryRequest.getBoxNumber() || null != boxHistoryRequest.getCabinateNumber()) {
			boxHistoryResponses = boxHistoryService.getBoxHistoryDetailsService(boxHistoryRequest);
		} 
		return boxHistoryResponses;
	}

}
