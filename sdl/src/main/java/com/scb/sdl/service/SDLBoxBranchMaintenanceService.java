package com.scb.sdl.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.sdl.Repository.SDLBoxBranchMaintenanceDao;
import com.scb.sdl.model.SDLBoxMaintenance;
import com.scb.sdl.model.SDLBoxSetUp;
import com.scb.sdl.model.SDLBranchChange;
import com.scb.sdl.model.SDLBranchDetails;

@Service
public class SDLBoxBranchMaintenanceService implements SDLBoxBranchMaintenanceServiceImpl{
	
	@Autowired
	SDLBoxBranchMaintenanceDao sDLBoxBranchMaintenanceDao;

	@Override
	public SDLBoxSetUp getBoxDetails(String boxType) {
		SDLBoxSetUp sdlBoxSetUp = sDLBoxBranchMaintenanceDao.getBoxDetails(boxType);
				
		return sdlBoxSetUp;
	}

	@Override
	public SDLBranchDetails getBranchDetails(String branchCode) {
		SDLBranchDetails sdlBranchDetails = sDLBoxBranchMaintenanceDao.getBranchDetails(branchCode);
		return sdlBranchDetails;
	}

	@Override
	public SDLBoxMaintenance SaveSDLBoxMaintenance(SDLBoxMaintenance sdlBoxMaintenance) {
		sdlBoxMaintenance.setLockerStatus("Available");
		//First we need to check DB if locker ref no is empty If condition need to write
		//If empty we can keep first sequence number is 001 
		//Integer runningSequenceNumber = new Integer(0);
		//If already have locker ref no in DB then we can take last record from DB and increment one
		// else runningSequenceNumber = runningSequenceNumber+1;
		String lockerReferenceNumber = "";
		if(StringUtils.isNotBlank(sdlBoxMaintenance.getBranchCode()) 
				&& StringUtils.isNotBlank(sdlBoxMaintenance.getBranchName())
				&& StringUtils.isNotBlank(sdlBoxMaintenance.getCabinateNumber()) 
				&& StringUtils.isNotBlank(sdlBoxMaintenance.getBoxNumber())
				&& StringUtils.isNotBlank(sdlBoxMaintenance.getBoxType())) {
			lockerReferenceNumber = generateLockerReferenceNumber(sdlBoxMaintenance,001);
		}
		
		sdlBoxMaintenance.setLockerReferenceNumber(lockerReferenceNumber);
		SDLBoxMaintenance saveSdlBoxMaintenance = sDLBoxBranchMaintenanceDao.saveSDLBoxMaintenance(sdlBoxMaintenance);
		return saveSdlBoxMaintenance;
	}

	private String generateLockerReferenceNumber(SDLBoxMaintenance sdlBoxMaintenance, int runningSequenceNumber) {
		StringBuffer lockerRefNo = new StringBuffer();
		lockerRefNo.append(sdlBoxMaintenance.getBranchCode());
		lockerRefNo.append(sdlBoxMaintenance.getBoxType());
		lockerRefNo.append(sdlBoxMaintenance.getCabinateNumber());
		lockerRefNo.append("001");
		return lockerRefNo.toString();
	}

	@Override
	public List<SDLBoxSetUp> getAllBoxDetails() {
		
		return sDLBoxBranchMaintenanceDao.getAllBoxDetails();
	}

	@Override
	public List<SDLBranchDetails> getAllBranchDetails() {
		
		return sDLBoxBranchMaintenanceDao.getAllBranchDetails();
	}

	@Override
	public List<SDLBoxMaintenance> getAllBoxMaintenanceDetails() {
		
		return sDLBoxBranchMaintenanceDao.getAllBoxMaintenanceDetails();
	}

	@Override
	public List<SDLBoxMaintenance> getOldCabinateNumberFromBoxMaintenanceDetails(String branchCode) {
		
		return sDLBoxBranchMaintenanceDao.getOldCabinateNumberFromBoxMaintenanceDetails(branchCode);
	}

	@Override
	public SDLBoxMaintenance updateBranchChangeWithCabinet(SDLBranchChange sdlBranchChange) {
		//Fetch Box Maintenance Details to update the data in DB
		SDLBoxMaintenance sdlBoxMaintenance = sDLBoxBranchMaintenanceDao.getBoxMaintenanceDetailsBasedOnBranchAndCabinat(sdlBranchChange);
		
		sdlBoxMaintenance.setBranchCode(sdlBranchChange.getNewBranchCode());
		sdlBoxMaintenance.setCabinateNumber(sdlBranchChange.getNewCabinetNumber());
		return sDLBoxBranchMaintenanceDao.updateBranchChangeWithCabinet(sdlBoxMaintenance);
	}

}
