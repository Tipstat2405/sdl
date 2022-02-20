package com.scb.sdl.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.scb.sdl.model.Response.SDLockerAccessReportResponse;
import com.scb.sdl.model.Response.SDLockerInactiveReportResponse;
import com.scb.sdl.service.SDLockerInactiveReportService;

@Repository
public class SDLockerInactiveReportDao {

	public List<SDLockerInactiveReportResponse> getLockerInactiveReportDao() {
		List<SDLockerInactiveReportResponse> sdLInactiveReportResponses = new ArrayList<>();
		SDLockerInactiveReportResponse sdLockerInactiveReportResponse = new SDLockerInactiveReportResponse();
		sdLockerInactiveReportResponse.setAccountNumber("34286542352222");
		sdLockerInactiveReportResponse.setBoxNumber("00298");
		sdLockerInactiveReportResponse.setBranchCode("0161");
		sdLockerInactiveReportResponse.setBranchName("MGROAD");
		sdLockerInactiveReportResponse.setCabinateNumber("A1057");
		sdLockerInactiveReportResponse.setCustomerName("TechM");
		sdLockerInactiveReportResponse.setCheckerID("2569");
		sdLockerInactiveReportResponse.setDateOfAccess("DD-MM-YYYY");
		sdLockerInactiveReportResponse.setEntryTime("HH:MM:S DD:MM:YYYY");
		sdLockerInactiveReportResponse.setExitTime("HH:MM:S DD:MM:YYYY");
		sdLockerInactiveReportResponse.setLockerRefNumber("2564896");
		sdLockerInactiveReportResponse.setMakerID("105366");
		sdLockerInactiveReportResponse.setPoaRefNames("TechM,SC");
		sdLockerInactiveReportResponse.setPoaRefNumber("225698455555,35698442525");
		sdLockerInactiveReportResponse.setRelationshipNumber("59856");
		sdLInactiveReportResponses.add(sdLockerInactiveReportResponse);
		
		return sdLInactiveReportResponses;
	}

}
