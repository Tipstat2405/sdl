package com.scb.sdl.Repository;

import org.springframework.stereotype.Repository;

import com.scb.sdl.model.SDLWaitingListManualOverride;

@Repository
public class SDLWaitingListManualOverrideDao {

	public SDLWaitingListManualOverride saveSDLWaitingListManualOverrideDetails(
			SDLWaitingListManualOverride sdlWaitingListManualOverride) {
		//Save Data into DB and update WL status also
		return sdlWaitingListManualOverride;
	}

}
