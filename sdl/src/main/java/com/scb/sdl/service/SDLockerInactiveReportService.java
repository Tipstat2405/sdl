package com.scb.sdl.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.sdl.Repository.SDLockerInactiveReportDao;
import com.scb.sdl.model.Response.SDLockerAccessReportResponse;
import com.scb.sdl.model.Response.SDLockerInactiveReportResponse;
import com.scb.sdl.utils.file.CSVHelper;
import com.scb.sdl.utils.file.ExcelHelper;
import com.scb.sdl.utils.file.PDFHelper;

@Service
public class SDLockerInactiveReportService {

	@Autowired
	private SDLockerInactiveReportDao sdLockerInactiveReportDao;
	
	public InputStream getLockerInactiveReportCSVFile() {
		List<SDLockerInactiveReportResponse> lockInactiveReportServices = sdLockerInactiveReportDao.getLockerInactiveReportDao();
		ByteArrayInputStream in = CSVHelper.getSDLockerInactiveReportCSVFile(lockInactiveReportServices);
	    return in;
	}

	public InputStream getLockerInactiveReportEXCELFile() {
		List<SDLockerInactiveReportResponse> lockInactiveReportServices = sdLockerInactiveReportDao.getLockerInactiveReportDao();
		ByteArrayInputStream in = ExcelHelper.getSDLockerInactiveReportEXCELFile(lockInactiveReportServices);
	    return in;
	}

	public InputStream getLockerInactiveReportPDFFile() {
		List<SDLockerInactiveReportResponse> lockInactiveReportServices = sdLockerInactiveReportDao.getLockerInactiveReportDao();
		ByteArrayInputStream in = PDFHelper.getSDLockerInactiveReportPDFFile(lockInactiveReportServices);
	    return in;
	}

}
