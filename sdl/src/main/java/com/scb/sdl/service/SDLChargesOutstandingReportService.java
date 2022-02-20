package com.scb.sdl.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.sdl.Repository.SDLChargesOutstandingReportDao;
import com.scb.sdl.model.Response.SDLChargesOutstandingReportResponse;
import com.scb.sdl.model.Response.SDLockerAccessReportResponse;
import com.scb.sdl.utils.file.CSVHelper;
import com.scb.sdl.utils.file.ExcelHelper;
import com.scb.sdl.utils.file.PDFHelper;

@Service
public class SDLChargesOutstandingReportService {
    @Autowired
	private SDLChargesOutstandingReportDao chargesOutstandingReportDao;
    
	public InputStream getChargesOutstandingCSVFile() {
		List<SDLChargesOutstandingReportResponse> chargesOutstandingReportResponses = chargesOutstandingReportDao.getChargesOutstandingReportDao();
		ByteArrayInputStream in = CSVHelper.getSDLChargesOutstandingReportCSVFile(chargesOutstandingReportResponses);
	    return in;
	}

	public InputStream getChargesOutstandingEXCELFile() {
		List<SDLChargesOutstandingReportResponse> chargesOutstandingReportResponses = chargesOutstandingReportDao.getChargesOutstandingReportDao();
		ByteArrayInputStream in = ExcelHelper.getSDLChargesOutstandingReportCSVFile(chargesOutstandingReportResponses);
	    return in;
	}

	public InputStream getChargesOutstandingPDFFile() {
		List<SDLChargesOutstandingReportResponse> chargesOutstandingReportResponses = chargesOutstandingReportDao.getChargesOutstandingReportDao();
		ByteArrayInputStream in = PDFHelper.getSDLChargesOutstandingReportCSVFile(chargesOutstandingReportResponses);
	    return in;
	}

}
