package com.scb.sdl.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.scb.sdl.model.Response.SDLChargesOutstandingReportResponse;
import com.scb.sdl.model.Response.SDLockerAccessReportResponse;

@Repository
public class SDLChargesOutstandingReportDao {

	public List<SDLChargesOutstandingReportResponse> getChargesOutstandingReportDao() {
		List<SDLChargesOutstandingReportResponse> sdlChargesOutstandingReportResponses = new ArrayList<>();
		SDLChargesOutstandingReportResponse sdlChargesOutstandingReportResponse = new SDLChargesOutstandingReportResponse();
		sdlChargesOutstandingReportResponse.setBoxNumber("00298");
		sdlChargesOutstandingReportResponse.setAccountNumber("3435898665265");
		sdlChargesOutstandingReportResponse.setCabinateNumber("A1057");
		sdlChargesOutstandingReportResponse.setLockerRefNumber("259645266");
		sdlChargesOutstandingReportResponse.setCustomerName("TechM");
		sdlChargesOutstandingReportResponse.setChargeCode("Cash");
		sdlChargesOutstandingReportResponse.setChargeAmounOutstanding("58963");
		sdlChargesOutstandingReportResponse.setNoOfCycles("12");
		sdlChargesOutstandingReportResponses.add(sdlChargesOutstandingReportResponse);
		
		return sdlChargesOutstandingReportResponses;
	}

}
