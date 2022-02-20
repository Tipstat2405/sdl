package com.scb.sdl.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scb.sdl.model.SDLBoxMaintenance;
import com.scb.sdl.model.SDLBoxSetUp;
import com.scb.sdl.model.SDLBranchChange;
import com.scb.sdl.model.SDLBranchDetails;
import com.scb.sdl.service.SDLBoxBranchMaintenanceServiceImpl;

@RestController
public class SDLBoxBranchMaintenanceController {
	
	
	@Autowired
	SDLBoxBranchMaintenanceServiceImpl sDLBoxBranchMaintenceService;
	
	
	
	@GetMapping(value = "/box/{boxType}")
	public SDLBoxSetUp getBoxSetUpDetails(@PathVariable String boxType) {
		
		SDLBoxSetUp boxDetails = new SDLBoxSetUp();
		if(StringUtils.isNotBlank(boxType)) {
			boxDetails = sDLBoxBranchMaintenceService.getBoxDetails(boxType);
		}
		
		return boxDetails;
		
		
	}
	
	@GetMapping(value = "/list/box")
	public List<SDLBoxSetUp> getAllBoxSetUpDetails() {
		
		return sDLBoxBranchMaintenceService.getAllBoxDetails();
		
	}
	
	@GetMapping(value = "/branch/{branchCode}")
	public SDLBranchDetails getBranchDetails(@PathVariable String branchCode) {
		
		SDLBranchDetails branchDetails = new SDLBranchDetails();
		if(StringUtils.isNotBlank(branchCode)) {
			branchDetails = sDLBoxBranchMaintenceService.getBranchDetails(branchCode);
		}
		
		return branchDetails;
		
		
	}
	
	@GetMapping(value = "/list/branch")
	public List<SDLBranchDetails> getAllBranchDetails() {
		
		return sDLBoxBranchMaintenceService.getAllBranchDetails();
		
	}
	
	@PostMapping(value = "/save/boxMaintenance")
	public SDLBoxMaintenance saveBoxMaintenanceDetails(@RequestBody SDLBoxMaintenance sdlBoxMaintenance) {
		
		SDLBoxMaintenance saveSDLBoxMaintenance = new SDLBoxMaintenance();
		if(StringUtils.isNotBlank(sdlBoxMaintenance.getBranchCode()) || StringUtils.isNotBlank(sdlBoxMaintenance.getBranchName())
				|| StringUtils.isNotBlank(sdlBoxMaintenance.getCabinateNumber()) 
				||StringUtils.isNotBlank(sdlBoxMaintenance.getBoxNumber())
				|| StringUtils.isNotBlank(sdlBoxMaintenance.getBoxType()) 
				|| StringUtils.isNotBlank(sdlBoxMaintenance.getKeyNumber())
				|| sdlBoxMaintenance.getRowNumber() != null || sdlBoxMaintenance.getColumnNumber() != null) {
			saveSDLBoxMaintenance = sDLBoxBranchMaintenceService.SaveSDLBoxMaintenance(sdlBoxMaintenance);
		}
		
		return saveSDLBoxMaintenance;
		
		
	}
	
	@PutMapping(value = "/update/branchChange")
	public SDLBoxMaintenance updateBranchChangeWithCabinat(@RequestBody SDLBranchChange sdlBranchChange) {
		
		SDLBoxMaintenance sdlBoxMaintenance = new SDLBoxMaintenance();
		if(StringUtils.isNotBlank(sdlBranchChange.getOldBranchCode()) 
				&& StringUtils.isNotBlank(sdlBranchChange.getOldCabinetNumber())
				&& StringUtils.isNotBlank(sdlBranchChange.getNewBranchCode()) 
				&& StringUtils.isNotBlank(sdlBranchChange.getNewCabinetNumber())) {
			
			sdlBoxMaintenance = sDLBoxBranchMaintenceService.updateBranchChangeWithCabinet(sdlBranchChange);
		}
		
		return sdlBoxMaintenance;
		
	}
	
	@GetMapping(value = "/list/boxMaintenance")
	public List<SDLBoxMaintenance> getAllBoxMaintenanceDetails() {
		
		return sDLBoxBranchMaintenceService.getAllBoxMaintenanceDetails();
		
	}
	
	@GetMapping(value = "/boxMaintenance/{branchCode}")
	public List<SDLBoxMaintenance> getOldCabinateNumberFromBoxBranchMaintenanceDetails(@PathVariable String branchCode) {
		
		List<SDLBoxMaintenance> sdlBoxMaintenanceDetails = new ArrayList<>();
		if(StringUtils.isNotBlank(branchCode)) {
			sdlBoxMaintenanceDetails = sDLBoxBranchMaintenceService.getOldCabinateNumberFromBoxMaintenanceDetails(branchCode);
		}
		
		return sdlBoxMaintenanceDetails;
		
		
	}

	
	
	

}
