package com.scb.sdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.sdl.Repository.SDLWaitingListManualOverrideDao;
import com.scb.sdl.model.SDLWaitingListManualOverride;

@Service
public class SDLWaitingListManualOverrideService implements SDLWaitingListManualOverrideServiceImpl{

	@Autowired
	SDLWaitingListManualOverrideDao sdlWaitingListManualOverrideDao;
	
	@Override
	public SDLWaitingListManualOverride saveSDLWaitingListManualOverrideDetails(
			SDLWaitingListManualOverride sdlWaitingListManualOverride) {
		
		return sdlWaitingListManualOverrideDao.saveSDLWaitingListManualOverrideDetails(sdlWaitingListManualOverride);
	}
	
	

}
