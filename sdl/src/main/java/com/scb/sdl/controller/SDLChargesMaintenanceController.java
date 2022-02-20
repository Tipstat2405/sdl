package com.scb.sdl.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scb.sdl.model.SDLChargeCodeDetails;
import com.scb.sdl.model.SDLCharges;
import com.scb.sdl.model.SDLSegmentDetails;
import com.scb.sdl.service.SDLChargesMaintenanceServiceImpl;

@RestController
public class SDLChargesMaintenanceController {
	
	@Autowired
	SDLChargesMaintenanceServiceImpl sDLChargesMaintenanceService;
	
	
	@GetMapping(value = "/list/segment")
	public List<SDLSegmentDetails> getAllSegmentDetails() {
		
		return sDLChargesMaintenanceService.getAllSegmentDetails();
		
	}
	
	@GetMapping(value = "/list/chargeCodeDetails")
	public List<SDLChargeCodeDetails> getAllChargeCodeDetails() {
		
		return sDLChargesMaintenanceService.getAllChargeCodeDetails();
		
	}
	
	@PostMapping(value = "/save/sdl/charges")
	public SDLCharges saveSDLChargesDetails(@RequestBody SDLCharges sdlCharges) {
		
		SDLCharges saveSDLCharges = new SDLCharges();
		if(StringUtils.isNotBlank(sdlCharges.getBranchCode())
				&& sdlCharges.getSegmentCode() != null
				&& StringUtils.isNotBlank(sdlCharges.getBoxType())
				&& StringUtils.isNotBlank(sdlCharges.getFrequency())
				&& sdlCharges.getChargeAmount() != null ) {
			saveSDLCharges = sDLChargesMaintenanceService.saveSDLChargesDetails(sdlCharges);
		}
		
		return saveSDLCharges;
		
		
	}
	
	@GetMapping(value = "/list/sdl/charges")
	public List<SDLCharges> getAllSDLChargeDetails() {
		
		return sDLChargesMaintenanceService.getAllSDLChargeDetails();
		
	}

}
