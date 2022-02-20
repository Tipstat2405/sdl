package com.scb.sdl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.sdl.Repository.SDLChargesMaintenanceDao;
import com.scb.sdl.model.SDLChargeCodeDetails;
import com.scb.sdl.model.SDLCharges;
import com.scb.sdl.model.SDLSegmentDetails;

@Service
public class SDLChargesMaintenanceService implements SDLChargesMaintenanceServiceImpl{
	
	@Autowired
	SDLChargesMaintenanceDao sDLChargesMaintenanceDao;

	@Override
	public List<SDLSegmentDetails> getAllSegmentDetails() {
		
		return sDLChargesMaintenanceDao.getAllSegmentDetails();
	}

	@Override
	public List<SDLChargeCodeDetails> getAllChargeCodeDetails() {
		
		return sDLChargesMaintenanceDao.getAllChargeCodeDetails();
	}

	@Override
	public SDLCharges saveSDLChargesDetails(SDLCharges sdlCharges) {
		
		return sDLChargesMaintenanceDao.saveSDLChargesDetails(sdlCharges);
	}

	@Override
	public List<SDLCharges> getAllSDLChargeDetails() {
		
		return sDLChargesMaintenanceDao.getAllSDLChargeDetails();
	}


	
}
