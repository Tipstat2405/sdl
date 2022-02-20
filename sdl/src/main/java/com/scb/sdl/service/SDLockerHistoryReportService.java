package com.scb.sdl.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.sdl.Repository.SDLockerHistoryReportDao;
import com.scb.sdl.model.Response.SDLWaitListReportResponse;
import com.scb.sdl.model.Response.SDLockerHistoryReportResponse;
import com.scb.sdl.utils.file.CSVHelper;
import com.scb.sdl.utils.file.ExcelHelper;
import com.scb.sdl.utils.file.PDFHelper;

@Service
public class SDLockerHistoryReportService {

	@Autowired
	private SDLockerHistoryReportDao sdLockerHistoryReportDao;
	
	public InputStream getLockerHistoryCSVFile() {
		List<SDLockerHistoryReportResponse> waitListReportResponses = sdLockerHistoryReportDao.getSDLockerHistoryListReportDao();
		ByteArrayInputStream in = CSVHelper.getLockerHistoryReportCSVFile(waitListReportResponses);
	    return in;
	}

	public InputStream getLockerHistoryEXCELFile() {
		List<SDLockerHistoryReportResponse> waitListReportResponses = sdLockerHistoryReportDao.getSDLockerHistoryListReportDao();
		ByteArrayInputStream in = ExcelHelper.getLockerHistoryReportExcelFile(waitListReportResponses);
	    return in;
	}

	public InputStream getLockerHistoryPDFFile() {
		List<SDLockerHistoryReportResponse> waitListReportResponses = sdLockerHistoryReportDao.getSDLockerHistoryListReportDao();
		ByteArrayInputStream in = PDFHelper.getLockerHistoryReportPdfFile(waitListReportResponses);
	    return in;
	}

}
