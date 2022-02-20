package com.scb.sdl.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.sdl.Repository.SDLWaitListReportDao;
import com.scb.sdl.model.Response.SDLWaitListReportResponse;
import com.scb.sdl.utils.file.CSVHelper;
import com.scb.sdl.utils.file.ExcelHelper;
import com.scb.sdl.utils.file.PDFHelper;



@Service
public class SDLWaitListReportService {
	
	@Autowired
	private SDLWaitListReportDao waitListReportDao;
	

	public InputStream getWaitListCSVFile() {
		List<SDLWaitListReportResponse> waitListReportResponses = waitListReportDao.getWaitListReportDao();
		ByteArrayInputStream in = CSVHelper.getWaitListReportCSVFile(waitListReportResponses);
	    
		return in;
	}


	public InputStream getWaitListEXCELFile() {
		List<SDLWaitListReportResponse> waitListReportResponses = waitListReportDao.getWaitListReportDao();
		ByteArrayInputStream in = ExcelHelper.getWaitListReportEXCELFile(waitListReportResponses);
	    
		return in;
	}


	public InputStream getWaitListPDFFile() {
		List<SDLWaitListReportResponse> waitListReportResponses = waitListReportDao.getWaitListReportDao();
		ByteArrayInputStream in = PDFHelper.getWaitListReportPDFFile(waitListReportResponses);
	    
		return in;
	}

	
}
