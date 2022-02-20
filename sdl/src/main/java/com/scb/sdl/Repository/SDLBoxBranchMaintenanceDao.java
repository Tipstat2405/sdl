package com.scb.sdl.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.scb.sdl.model.SDLBoxMaintenance;
import com.scb.sdl.model.SDLBoxSetUp;
import com.scb.sdl.model.SDLBranchChange;
import com.scb.sdl.model.SDLBranchDetails;

@Repository
public class SDLBoxBranchMaintenanceDao {

	public SDLBoxSetUp getBoxDetails(String boxType) {
		SDLBoxSetUp sDLBoxSetUp = new SDLBoxSetUp();
		sDLBoxSetUp.setBoxDescription("A Box");
		sDLBoxSetUp.setBoxType("A");
		sDLBoxSetUp.setCms(true);
		sDLBoxSetUp.setFeet(false);
		sDLBoxSetUp.setInches(false);
		sDLBoxSetUp.setWidth(123);
		sDLBoxSetUp.setHeight(123);
		sDLBoxSetUp.setLength(123);
		return sDLBoxSetUp;
	}

	public SDLBranchDetails getBranchDetails(String branchCode) {
		SDLBranchDetails sdlBranchDetails = new SDLBranchDetails();
		sdlBranchDetails.setBranchCode("007");
		sdlBranchDetails.setBranchName("T Nagar Branch");
		return sdlBranchDetails;
	}

	public SDLBoxMaintenance saveSDLBoxMaintenance(SDLBoxMaintenance sdlBoxMaintenance) {
		// Save need to do in DB
		return sdlBoxMaintenance;
	}

	public List<SDLBoxSetUp> getAllBoxDetails() {
		// Fetch All Box Set Up Details from DB
		
		
		List<SDLBoxSetUp> list = new ArrayList<>();
		SDLBoxSetUp sDLBoxSetUp = new SDLBoxSetUp();
		sDLBoxSetUp.setBoxDescription("A Box");
		sDLBoxSetUp.setBoxType("A");
		sDLBoxSetUp.setCms(true);
		sDLBoxSetUp.setFeet(false);
		sDLBoxSetUp.setInches(false);
		sDLBoxSetUp.setWidth(123);
		sDLBoxSetUp.setHeight(123);
		sDLBoxSetUp.setLength(123);
		list.add(sDLBoxSetUp);
		
		SDLBoxSetUp sDLBoxSetUp1 = new SDLBoxSetUp();
		sDLBoxSetUp1.setBoxDescription("B BOx");
		sDLBoxSetUp1.setBoxType("B");
		sDLBoxSetUp1.setCms(true);
		sDLBoxSetUp1.setFeet(false);
		sDLBoxSetUp1.setInches(false);
		sDLBoxSetUp1.setWidth(123);
		sDLBoxSetUp1.setHeight(123);
		sDLBoxSetUp1.setLength(123);
		list.add(sDLBoxSetUp1);
		
		SDLBoxSetUp sDLBoxSetUp12 = new SDLBoxSetUp();
		sDLBoxSetUp12.setBoxDescription("C BOx");
		sDLBoxSetUp12.setBoxType("C");
		sDLBoxSetUp12.setCms(true);
		sDLBoxSetUp12.setFeet(false);
		sDLBoxSetUp12.setInches(false);
		sDLBoxSetUp12.setWidth(123);
		sDLBoxSetUp12.setHeight(123);
		sDLBoxSetUp12.setLength(123);
		list.add(sDLBoxSetUp12);
		
		
		return list;
	}

	public List<SDLBranchDetails> getAllBranchDetails() {
		// Fetch all details from Database
		
		
		List<SDLBranchDetails> list = new ArrayList<>();
		
		SDLBranchDetails sdlBranchDetails = new SDLBranchDetails();
		sdlBranchDetails.setBranchCode("T07");
		sdlBranchDetails.setBranchName("T Nagar Branch");
		list.add(sdlBranchDetails);
		
		
		SDLBranchDetails sdlBranchDetails1 = new SDLBranchDetails();
		sdlBranchDetails1.setBranchCode("T08");
		sdlBranchDetails1.setBranchName("Nungumbakkam Branch");
		list.add(sdlBranchDetails1);
		
		SDLBranchDetails sdlBranchDetails2 = new SDLBranchDetails();
		sdlBranchDetails2.setBranchCode("H09");
		sdlBranchDetails2.setBranchName("Hitech City Branch");
		list.add(sdlBranchDetails2);
		
		SDLBranchDetails sdlBranchDetails3 = new SDLBranchDetails();
		sdlBranchDetails3.setBranchCode("H08");
		sdlBranchDetails3.setBranchName("Kukatpally Branch");
		list.add(sdlBranchDetails3);
		
		
		return list;
	}

	public List<SDLBoxMaintenance> getAllBoxMaintenanceDetails() {
		//Fetch All details from Data base
		
		List<SDLBoxMaintenance> list = new ArrayList<>();
		
		SDLBoxMaintenance sdlBoxMaintenance = new SDLBoxMaintenance();
		sdlBoxMaintenance.setBranchCode("T07");
		sdlBoxMaintenance.setBranchName("T Nagar Branch");
		sdlBoxMaintenance.setCabinateNumber("A1057");
		sdlBoxMaintenance.setBoxNumber("00161");
		sdlBoxMaintenance.setBoxType("A");
		sdlBoxMaintenance.setRowNumber(1);
		sdlBoxMaintenance.setColumnNumber(3);
		sdlBoxMaintenance.setKeyNumber("007");
		sdlBoxMaintenance.setLockerStatus("Available");
		sdlBoxMaintenance.setLockerReferenceNumber("T07AA1057001");
		list.add(sdlBoxMaintenance);
		
		SDLBoxMaintenance sdlBoxMaintenance1 = new SDLBoxMaintenance();
		sdlBoxMaintenance1.setBranchCode("H08");
		sdlBoxMaintenance1.setBranchName("Kukatpally Branch");
		sdlBoxMaintenance1.setCabinateNumber("A2016");
		sdlBoxMaintenance1.setBoxNumber("00298");
		sdlBoxMaintenance1.setBoxType("E");
		sdlBoxMaintenance1.setRowNumber(2);
		sdlBoxMaintenance1.setColumnNumber(1);
		sdlBoxMaintenance1.setKeyNumber("054");
		sdlBoxMaintenance1.setLockerStatus("Occupied");
		sdlBoxMaintenance1.setLockerReferenceNumber("H08EA2016002");
		list.add(sdlBoxMaintenance1);
		
		
		
		
		return list;
	}

	public List<SDLBoxMaintenance> getOldCabinateNumberFromBoxMaintenanceDetails(String branchCode) {
		//Fetch Data from DB based on branchCode
		List<SDLBoxMaintenance> list = new ArrayList<>();
		
		SDLBoxMaintenance sdlBoxMaintenance = new SDLBoxMaintenance();
		sdlBoxMaintenance.setBranchCode("T07");
		sdlBoxMaintenance.setBranchName("T Nagar Branch");
		sdlBoxMaintenance.setCabinateNumber("A1057");
		sdlBoxMaintenance.setBoxNumber("00161");
		sdlBoxMaintenance.setBoxType("A");
		sdlBoxMaintenance.setRowNumber(1);
		sdlBoxMaintenance.setColumnNumber(3);
		sdlBoxMaintenance.setKeyNumber("007");
		sdlBoxMaintenance.setLockerStatus("Available");
		sdlBoxMaintenance.setLockerReferenceNumber("T07AA1057001");
		list.add(sdlBoxMaintenance);
		
		SDLBoxMaintenance sdlBoxMaintenance11 = new SDLBoxMaintenance();
		sdlBoxMaintenance11.setBranchCode("T07");
		sdlBoxMaintenance11.setBranchName("T Nagar Branch");
		sdlBoxMaintenance11.setCabinateNumber("B1058");
		sdlBoxMaintenance11.setBoxNumber("00161");
		sdlBoxMaintenance11.setBoxType("A");
		sdlBoxMaintenance11.setRowNumber(1);
		sdlBoxMaintenance11.setColumnNumber(3);
		sdlBoxMaintenance11.setKeyNumber("007");
		sdlBoxMaintenance11.setLockerStatus("Available");
		sdlBoxMaintenance11.setLockerReferenceNumber("T07AB1058002");
		list.add(sdlBoxMaintenance11);
		
		SDLBoxMaintenance sdlBoxMaintenance1 = new SDLBoxMaintenance();
		sdlBoxMaintenance1.setBranchCode("H08");
		sdlBoxMaintenance1.setBranchName("Kukatpally Branch");
		sdlBoxMaintenance1.setCabinateNumber("A2016");
		sdlBoxMaintenance1.setBoxNumber("00298");
		sdlBoxMaintenance1.setBoxType("E");
		sdlBoxMaintenance1.setRowNumber(2);
		sdlBoxMaintenance1.setColumnNumber(1);
		sdlBoxMaintenance1.setKeyNumber("054");
		sdlBoxMaintenance1.setLockerStatus("Occupied");
		sdlBoxMaintenance1.setLockerReferenceNumber("H08EA2016003");
		list.add(sdlBoxMaintenance1);
		
		List<SDLBoxMaintenance> finalList = new ArrayList<>();
		for(SDLBoxMaintenance sDLBoxMaintenance: list) {
			if(sDLBoxMaintenance.getBranchCode().equalsIgnoreCase(branchCode)) {
				finalList.add(sDLBoxMaintenance);
			}
			
		}
		return finalList;
	}

	public SDLBoxMaintenance getBoxMaintenanceDetailsBasedOnBranchAndCabinat(SDLBranchChange sdlBranchChange) {
		//Fetch Box Maintenance details based on Branch Code and Cabinet number from DB
		
		SDLBoxMaintenance sdlBoxMaintenance = new SDLBoxMaintenance();
		sdlBoxMaintenance.setBranchCode("T07");
		sdlBoxMaintenance.setBranchName("T Nagar Branch");
		sdlBoxMaintenance.setCabinateNumber("A1057");
		sdlBoxMaintenance.setBoxNumber("00161");
		sdlBoxMaintenance.setBoxType("A");
		sdlBoxMaintenance.setRowNumber(1);
		sdlBoxMaintenance.setColumnNumber(3);
		sdlBoxMaintenance.setKeyNumber("007");
		sdlBoxMaintenance.setLockerStatus("Available");
		sdlBoxMaintenance.setLockerReferenceNumber("T07AA1057001");
		
		return sdlBoxMaintenance;
	}

	public SDLBoxMaintenance updateBranchChangeWithCabinet(SDLBoxMaintenance sdlBoxMaintenance) {
		// Update data into DB
		return sdlBoxMaintenance;
	}
	
	

}
