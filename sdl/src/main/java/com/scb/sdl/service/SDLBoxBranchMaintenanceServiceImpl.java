package com.scb.sdl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scb.sdl.model.SDLBoxMaintenance;
import com.scb.sdl.model.SDLBoxSetUp;
import com.scb.sdl.model.SDLBranchChange;
import com.scb.sdl.model.SDLBranchDetails;

@Service
public interface SDLBoxBranchMaintenanceServiceImpl {
	
	SDLBoxSetUp getBoxDetails(String boxType);
	
	SDLBranchDetails getBranchDetails(String branchCode);

	SDLBoxMaintenance SaveSDLBoxMaintenance(SDLBoxMaintenance sdlBoxMaintenance);

	List<SDLBoxSetUp> getAllBoxDetails();

	List<SDLBranchDetails> getAllBranchDetails();

	List<SDLBoxMaintenance> getAllBoxMaintenanceDetails();

	List<SDLBoxMaintenance> getOldCabinateNumberFromBoxMaintenanceDetails(String branchCode);

	SDLBoxMaintenance updateBranchChangeWithCabinet(SDLBranchChange sdlBranchChange);

}
