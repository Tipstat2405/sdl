package com.scb.sdl.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.scb.sdl.model.Response.SDLWaitListReportResponse;
import com.scb.sdl.model.Response.SDLockerHistoryReportResponse;

@Repository
public class SDLockerHistoryReportDao {

	public List<SDLockerHistoryReportResponse> getSDLockerHistoryListReportDao(){
		List<SDLockerHistoryReportResponse> sdLockerHistoryReportResponses = new ArrayList<>();
		SDLockerHistoryReportResponse sdLockerHistoryReportResponse = new SDLockerHistoryReportResponse();
		sdLockerHistoryReportResponse.setAccountNumber("34286542352222");
		sdLockerHistoryReportResponse.setBoxNumber("0161");
		sdLockerHistoryReportResponse.setCabinateNumber("A1057");
		sdLockerHistoryReportResponse.setLockerRefNumber("2564896");
		sdLockerHistoryReportResponse.setCustomerName("TechM");
		sdLockerHistoryReportResponse.setLockerStatus("Availa");
		sdLockerHistoryReportResponse.setRelationshipNumber("156526495465");
		sdLockerHistoryReportResponses.add(sdLockerHistoryReportResponse);
		
		return sdLockerHistoryReportResponses;
	}

	
}
