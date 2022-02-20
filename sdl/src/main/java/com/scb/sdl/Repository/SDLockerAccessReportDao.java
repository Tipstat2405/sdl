package com.scb.sdl.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.scb.sdl.model.Response.SDLockerAccessReportResponse;
import com.scb.sdl.model.Response.SDLockerHistoryReportResponse;

@Repository
public class SDLockerAccessReportDao {

	public List<SDLockerAccessReportResponse> getLockerAccessReportDao() {
		List<SDLockerAccessReportResponse> sdLAccessReportResponses = new ArrayList<>();
		SDLockerAccessReportResponse sdLockerAccessReportResponse = new SDLockerAccessReportResponse();
		sdLockerAccessReportResponse.setAccountNumber("34286542352222");
		sdLockerAccessReportResponse.setBoxNumber("00298");
		sdLockerAccessReportResponse.setBranchCode("0161");
		sdLockerAccessReportResponse.setBranchName("MGROAD");
		sdLockerAccessReportResponse.setCabinateNumber("A1057");
		sdLockerAccessReportResponse.setCustomerName("TechM");
		sdLockerAccessReportResponse.setCheckerID("2569");
		sdLockerAccessReportResponse.setDateOfAccess("DD-MM-YYYY");
		sdLockerAccessReportResponse.setEntryTime("HH:MM:S DD:MM:YYYY");
		sdLockerAccessReportResponse.setExitTime("HH:MM:S DD:MM:YYYY");
		sdLockerAccessReportResponse.setLockerRefNumber("2564896");
		sdLockerAccessReportResponse.setMakerID("105366");
		sdLockerAccessReportResponse.setPoaRefNames("TechM,SC");
		sdLockerAccessReportResponse.setPoaRefNumber("225698455555,35698442525");
		sdLockerAccessReportResponse.setRelationshipNumber("59856");
		sdLAccessReportResponses.add(sdLockerAccessReportResponse);
		
		return sdLAccessReportResponses;
	}

}
