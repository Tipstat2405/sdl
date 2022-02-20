package com.scb.sdl.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scb.sdl.model.SDLBoxSetUp;
import com.scb.sdl.service.SDLBoxSetupServiceImpl;

@RestController
public class SDLBoxSetupController {
	
	
	@Autowired
	SDLBoxSetupServiceImpl sdlBoxSetupService;
	
	@PostMapping(value = "/save/sdl/boxSetup")
	public SDLBoxSetUp saveSDLBoxSetUpDetails(@RequestBody SDLBoxSetUp sdlBoxSetUp) {
		
		SDLBoxSetUp saveSDLBoxSetUp = new SDLBoxSetUp();
		if(StringUtils.isNotBlank(sdlBoxSetUp.getBoxType())
				&& StringUtils.isNotBlank(sdlBoxSetUp.getBoxDescription())
				&& sdlBoxSetUp.getWidth() != null
				&& sdlBoxSetUp.getHeight() != null
				&& sdlBoxSetUp.getLength() != null ) {
			saveSDLBoxSetUp = sdlBoxSetupService.saveSDLBoxSetUpDetails(sdlBoxSetUp);
		}
		
		return saveSDLBoxSetUp;
		
		
	}
	

}
