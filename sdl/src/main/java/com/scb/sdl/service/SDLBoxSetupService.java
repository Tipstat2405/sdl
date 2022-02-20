package com.scb.sdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.sdl.Repository.SDLBoxSetupDao;
import com.scb.sdl.model.SDLBoxSetUp;

@Service
public class SDLBoxSetupService implements SDLBoxSetupServiceImpl {
	
	@Autowired
	SDLBoxSetupDao sdlBoxSetupDao;

	@Override
	public SDLBoxSetUp saveSDLBoxSetUpDetails(SDLBoxSetUp sdlBoxSetUp) {
		
		return sdlBoxSetupDao.saveSDLBoxSetUpDetails(sdlBoxSetUp);
	}

}
