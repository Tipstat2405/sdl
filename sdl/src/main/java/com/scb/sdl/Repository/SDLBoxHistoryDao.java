package com.scb.sdl.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.scb.sdl.model.Request.SDLBoxHistoryRequest;
import com.scb.sdl.model.Response.RiskCodeResponse;
import com.scb.sdl.model.Response.SDLBoxHistoryResponse;

@Repository
public class SDLBoxHistoryDao {
	
	
	public List<SDLBoxHistoryResponse> boxHistoryDetails(SDLBoxHistoryRequest boxHistoryRequest) {
		List<SDLBoxHistoryResponse> boxHistoryResponses = new ArrayList<>();
		List<RiskCodeResponse> riskCodeResponses = new ArrayList<>();
		RiskCodeResponse riskCodeResponse = new RiskCodeResponse();
		riskCodeResponse.setRiskCode(400);
		riskCodeResponse.setRiskDescription("Test");
		riskCodeResponse.setRiskExpiryDate("DD-MM-YYYY");
		riskCodeResponse.setCheckerID("A2007");
		riskCodeResponse.setMakerID("A0167");
		riskCodeResponse.setMakerDate("DD-MM-YYYY");
		riskCodeResponse.setCheckerDate("DD-MM-YYYY");
		riskCodeResponses.add(riskCodeResponse);
		
		SDLBoxHistoryResponse boxHistoryResponse = new SDLBoxHistoryResponse();
		boxHistoryResponse.setBoxName("Test123");
		boxHistoryResponse.setBoxNumber("0161");
		boxHistoryResponse.setBoxType("A");
		boxHistoryResponse.setBranchCode("0158");
		boxHistoryResponse.setCabinateNumber("A1057");
		boxHistoryResponse.setCustomerNames("TechM");
		boxHistoryResponse.setLockerBoxStatus("Available");
		boxHistoryResponse.setDateOfAllocation("DD-MM-YYYY");
		boxHistoryResponse.setRelationshipNumbers("156526495465");
		boxHistoryResponse.setRiskCode(riskCodeResponses);
		boxHistoryResponses.add(boxHistoryResponse);
		
		return boxHistoryResponses;
	}
	
	public List<SDLBoxHistoryResponse> getBoxHistoryDetailsServiceByBranch(String branchCode,String boxNumber){
		
		List<SDLBoxHistoryResponse> boxHistoryResponses = new ArrayList<>();
		List<RiskCodeResponse> riskCodeResponses = new ArrayList<>();
		RiskCodeResponse riskCodeResponse = new RiskCodeResponse();
		riskCodeResponse.setRiskCode(400);
		riskCodeResponse.setRiskDescription("Test");
		riskCodeResponse.setRiskExpiryDate("DD-MM-YYYY");
		riskCodeResponse.setCheckerID("A2007");
		riskCodeResponse.setMakerID("A0167");
		riskCodeResponse.setMakerDate("DD-MM-YYYY");
		riskCodeResponse.setCheckerDate("DD-MM-YYYY");
		riskCodeResponses.add(riskCodeResponse);
		
		SDLBoxHistoryResponse boxHistoryResponse = new SDLBoxHistoryResponse();
		boxHistoryResponse.setBoxName("Test123");
		boxHistoryResponse.setBoxNumber("0161");
		boxHistoryResponse.setBoxType("A");
		boxHistoryResponse.setBranchCode("0158");
		boxHistoryResponse.setCabinateNumber("A1057");
		boxHistoryResponse.setCustomerNames("TechM");
		boxHistoryResponse.setLockerBoxStatus("Available");
		boxHistoryResponse.setDateOfAllocation("DD-MM-YYYY");
		boxHistoryResponse.setRelationshipNumbers("156526495465");
		boxHistoryResponse.setRiskCode(riskCodeResponses);
		boxHistoryResponses.add(boxHistoryResponse);
		
		return boxHistoryResponses;
		
	}
}
