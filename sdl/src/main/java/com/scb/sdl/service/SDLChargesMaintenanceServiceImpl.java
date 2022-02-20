package com.scb.sdl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scb.sdl.model.SDLChargeCodeDetails;
import com.scb.sdl.model.SDLCharges;
import com.scb.sdl.model.SDLSegmentDetails;

@Service
public interface SDLChargesMaintenanceServiceImpl {

	List<SDLSegmentDetails> getAllSegmentDetails();

	List<SDLChargeCodeDetails> getAllChargeCodeDetails();

	SDLCharges saveSDLChargesDetails(SDLCharges sdlCharges);

	List<SDLCharges> getAllSDLChargeDetails();

}
