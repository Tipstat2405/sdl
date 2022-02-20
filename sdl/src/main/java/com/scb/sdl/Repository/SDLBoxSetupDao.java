package com.scb.sdl.Repository;

import org.springframework.stereotype.Repository;

import com.scb.sdl.model.SDLBoxSetUp;

@Repository
public class SDLBoxSetupDao {

	public SDLBoxSetUp saveSDLBoxSetUpDetails(SDLBoxSetUp sdlBoxSetUp) {
		//Save data into DB
		return sdlBoxSetUp;
	}

}
