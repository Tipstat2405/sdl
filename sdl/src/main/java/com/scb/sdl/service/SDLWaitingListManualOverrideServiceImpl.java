package com.scb.sdl.service;

import org.springframework.stereotype.Service;

import com.scb.sdl.model.SDLWaitingListManualOverride;

@Service
public interface SDLWaitingListManualOverrideServiceImpl {

	SDLWaitingListManualOverride saveSDLWaitingListManualOverrideDetails(
			SDLWaitingListManualOverride sdlWaitingListManualOverride);

}
