package com.scb.sdl.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.sdl.Repository.SDLockerAccessReportDao;
import com.scb.sdl.model.Response.SDLWaitListReportResponse;
import com.scb.sdl.model.Response.SDLockerAccessReportResponse;
import com.scb.sdl.utils.file.CSVHelper;
import com.scb.sdl.utils.file.ExcelHelper;
import com.scb.sdl.utils.file.PDFHelper;

@Service
public class SDLockerAccessReportService {

	@Autowired
	private SDLockerAccessReportDao accessReportDao;
	
	public InputStream getLockerAccessReportCSVFile() {
		List<SDLockerAccessReportResponse> lockerAccessReportResponses = accessReportDao.getLockerAccessReportDao();
		ByteArrayInputStream in = CSVHelper.getSDLockerAccessReportCSVFile(lockerAccessReportResponses);
	    return in;
	}

	public InputStream getLockerAccessReportEXCELFile() {
		List<SDLockerAccessReportResponse> lockerAccessReportResponses = accessReportDao.getLockerAccessReportDao();
		ByteArrayInputStream in = ExcelHelper.getSDLockerAccessReportEXCELFile(lockerAccessReportResponses);
	    return in;
	}

	public InputStream getLockerAccessReportPDFFile() {
		List<SDLockerAccessReportResponse> lockerAccessReportResponses = accessReportDao.getLockerAccessReportDao();
		ByteArrayInputStream in = PDFHelper.getSDLockerAccessReportPDFFile(lockerAccessReportResponses);
	    return in;
	}

}
