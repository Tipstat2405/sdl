package com.scb.sdl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scb.sdl.service.SDLockerInactiveReportService;

@RestController
@RequestMapping("/report/sdl")
public class SDLockerInactiveReportController {

	@Autowired
	private SDLockerInactiveReportService sdLockerInactiveReportService;
	
	@GetMapping("/inactivelocker")
	  public ResponseEntity<Resource> getSDLockerAccessReportFile(@RequestParam String fileType) {
		
	    
	    System.out.print(fileType);
	    InputStreamResource waitListFile = null ;
	    if(fileType.equals("csv")) {
	    	fileType ="application/csv";fileType ="application/csv";
	    	waitListFile = new InputStreamResource(sdLockerInactiveReportService.getLockerInactiveReportCSVFile());
	    	return ResponseEntity.ok()
	    	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + "Inactive Locker.csv")
	    	        .contentType(MediaType.parseMediaType("application/csv"))
	    	        .body(waitListFile);
	    }else if (fileType.equals("excel")) {
	    	fileType ="application/vnd.ms-excel";
	    	waitListFile = new InputStreamResource(sdLockerInactiveReportService.getLockerInactiveReportEXCELFile());
	    	return ResponseEntity.ok()
	    	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + "Inactive Locker.xlsx")
	    	        .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
	    	        .body(waitListFile);
		}else {
			fileType ="application/pdf";
	    	waitListFile = new InputStreamResource(sdLockerInactiveReportService.getLockerInactiveReportPDFFile());
	    	return ResponseEntity.ok()
	    	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + "Inactive Locker.pdf")
	    	        .contentType(MediaType.parseMediaType(fileType))
	    	        .body(waitListFile);
		}
	    
	    
	  }

	
}
