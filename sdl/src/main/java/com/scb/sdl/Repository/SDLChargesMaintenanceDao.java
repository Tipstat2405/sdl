package com.scb.sdl.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.scb.sdl.model.SDLChargeCodeDetails;
import com.scb.sdl.model.SDLCharges;
import com.scb.sdl.model.SDLSegmentDetails;

@Repository
public class SDLChargesMaintenanceDao {

	public List<SDLSegmentDetails> getAllSegmentDetails() {
		//Fetch Data from eBBS
		
		List<SDLSegmentDetails> list = new ArrayList<>();
		
		SDLSegmentDetails sDLSegmentDetails = new SDLSegmentDetails();
		sDLSegmentDetails.setSegmentCode(123);
		sDLSegmentDetails.setSegmentDescription("ABC");
		
		list.add(sDLSegmentDetails);
		
		return list;
	}

	public List<SDLChargeCodeDetails> getAllChargeCodeDetails() {
		//Fetch Data from eBBS
		
		List<SDLChargeCodeDetails> list = new ArrayList<>();
		
		SDLChargeCodeDetails sDLChargeCodeDetails = new SDLChargeCodeDetails();
		sDLChargeCodeDetails.setChargeCode("A123");
		sDLChargeCodeDetails.setChargeDescription("Test");
		
		list.add(sDLChargeCodeDetails);
		
		return list;
	}

	public SDLCharges saveSDLChargesDetails(SDLCharges sdlCharges) {
		//Save data into DB
		return sdlCharges;
	}

	public List<SDLCharges> getAllSDLChargeDetails() {
		//Fetch Data from Data base
		
		List<SDLCharges> list = new ArrayList<>();	
		
		SDLCharges sDLCharges = new SDLCharges();
		sDLCharges.setBranchCode("T07");
		sDLCharges.setBranchDescription("T Nagar");
		sDLCharges.setSegmentCode(123);
		sDLCharges.setBoxType("A");
		sDLCharges.setSegmentDescription("Segment Description");
		sDLCharges.setChargeCode("A123");
		sDLCharges.setChargeDescription("Charge Description");
		sDLCharges.setFrequency("Annual");
		sDLCharges.setChargeAmount(10000);
		
		list.add(sDLCharges);
		
		SDLCharges sDLCharges1 = new SDLCharges();
		sDLCharges1.setBranchCode("T07");
		sDLCharges1.setBranchDescription("T Nagar");
		sDLCharges1.setBoxType("A");
		sDLCharges1.setSegmentCode(123);
		sDLCharges1.setSegmentDescription("Segment Description");
		sDLCharges1.setChargeCode("A123");
		sDLCharges1.setChargeDescription("Charge Description");
		sDLCharges1.setFrequency("Monthly");
		sDLCharges1.setChargeAmount(2000);
		
		list.add(sDLCharges1);
		
		SDLCharges sDLCharges11 = new SDLCharges();
		sDLCharges11.setBranchCode("T07");
		sDLCharges11.setBoxType("A");
		sDLCharges11.setBranchDescription("T Nagar");
		sDLCharges11.setSegmentCode(123);
		sDLCharges11.setSegmentDescription("Segment Description");
		sDLCharges11.setChargeCode("A123");
		sDLCharges11.setChargeDescription("Charge Description");
		sDLCharges11.setFrequency("Monthly");
		sDLCharges11.setChargeAmount(6000);
		
		list.add(sDLCharges11);
		
		return list;
	}
	
	

}
