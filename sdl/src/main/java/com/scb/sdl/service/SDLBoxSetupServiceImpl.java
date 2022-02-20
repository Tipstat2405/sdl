package com.scb.sdl.service;

import org.springframework.stereotype.Service;

import com.scb.sdl.model.SDLBoxSetUp;

@Service
public interface SDLBoxSetupServiceImpl {

	SDLBoxSetUp saveSDLBoxSetUpDetails(SDLBoxSetUp sdlBoxSetUp);

}
