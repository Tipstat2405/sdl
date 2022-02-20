package com.scb.sdl.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scb.sdl.model.SDLWaitingListManualOverride;
import com.scb.sdl.service.SDLWaitingListManualOverrideServiceImpl;

@RestController
public class SDLWaitingListManualOverrideController {
	
	@Autowired
	SDLWaitingListManualOverrideServiceImpl sdlWaitingListManualOverrideService;
	
	
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	//@Scheduled(cron = "0 0/1 * * * *")
	public void lockerAvailabilitySmsAlert() {
		
		 System.out.println(
	      "schedule tasks using cron jobs - " + dateFormat.format(new Date()));
		 //First we need to get data from DB if we have any lockers are available
		 //Once we get the List of locker available then we need to send SMS to Prior WL user
		 //System will trigger a SMS alert to customer for opting the locker box
		 //So here we need to get Waiting List user details as well
		 //SMS Configuration we need to do
		 
		 
		 //Once SMS Configuration is done we need to Check 
		 
		 //2 days for Customer confirmation
		 
		 //If the locker box is not opted 15 days 
		 //System to auto cancel the waiting list number and 
		 //progress to next customer with waiting list number
		 
		 //Table status need to change to Cancel if user is not Opted after 15 days
		 
		 //If WL1 also not opted after 15 days status need to change to Cancel
		 
		 
		 
		
	}
	
	@PostMapping(value = "/save/sdl/waitinglist/manualoverrride")
	public SDLWaitingListManualOverride saveSDLWaitingListManualOverrideDetails(@RequestBody SDLWaitingListManualOverride sdlWaitingListManualOverride) {
		
		SDLWaitingListManualOverride saveSDLWaitingListManualOverride = new SDLWaitingListManualOverride();
		if(StringUtils.isNotBlank(sdlWaitingListManualOverride.getBranchCode())
				&& StringUtils.isNotBlank(sdlWaitingListManualOverride.getWaitingListRefNumber())
				&& StringUtils.isNotBlank(sdlWaitingListManualOverride.getBoxType())
				&& StringUtils.isNotBlank(sdlWaitingListManualOverride.getRelationshipNumber())
				&& StringUtils.isNotBlank(sdlWaitingListManualOverride.getCustomerName())) {
			saveSDLWaitingListManualOverride = sdlWaitingListManualOverrideService.saveSDLWaitingListManualOverrideDetails(sdlWaitingListManualOverride);
		}
		
		return saveSDLWaitingListManualOverride;
		
		
	}
	
	
	
	
	
	

}
