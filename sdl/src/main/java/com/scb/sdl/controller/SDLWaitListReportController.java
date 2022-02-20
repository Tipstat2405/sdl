package com.scb.sdl.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scb.sdl.service.SDLWaitListReportService;


@RestController
@RequestMapping("/report/sdl/")
public class SDLWaitListReportController {
	
	@Autowired
	private SDLWaitListReportService waitListReportService;
	
	@GetMapping("/waitlist")
	  public ResponseEntity<Resource> getSDLWaitListReportFile(@RequestParam String fileType) {
		
	    String filename = "SDLWaitListReport.csv";
	    System.out.print(fileType);
	    InputStreamResource waitListFile = null ;
	    if(fileType.equals("csv")) {
	    	fileType ="application/csv";fileType ="application/csv";
	    	waitListFile = new InputStreamResource(waitListReportService.getWaitListCSVFile());
	    	return ResponseEntity.ok()
	    	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + "SDL WaitList.csv")
	    	        .contentType(MediaType.parseMediaType("application/csv"))
	    	        .body(waitListFile);
	    }else if (fileType.equals("excel")) {
	    	fileType ="application/vnd.ms-excel";
	    	waitListFile = new InputStreamResource(waitListReportService.getWaitListEXCELFile());
	    	return ResponseEntity.ok()
	    	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + "SDL WaitList.xlsx")
	    	        .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
	    	        .body(waitListFile);
		}else {
			fileType ="application/pdf";
	    	waitListFile = new InputStreamResource(waitListReportService.getWaitListPDFFile());
	    	return ResponseEntity.ok()
	    	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + "SDL WaitList.pdf")
	    	        .contentType(MediaType.parseMediaType(fileType))
	    	        .body(waitListFile);
		}
	    
	    
	  }

}
