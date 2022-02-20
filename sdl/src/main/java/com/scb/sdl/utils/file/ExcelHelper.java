package com.scb.sdl.utils.file;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.scb.sdl.model.Response.SDLChargesOutstandingReportResponse;
import com.scb.sdl.model.Response.SDLWaitListReportResponse;
import com.scb.sdl.model.Response.SDLockerAccessReportResponse;
import com.scb.sdl.model.Response.SDLockerHistoryReportResponse;
import com.scb.sdl.model.Response.SDLockerInactiveReportResponse;

public class ExcelHelper {

	  public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	  static String[] HEADERs = { "Branch Code", "Branch Name", "WL Registered Date","Waitlisted Ref No","Waitlist serial No","Preferred Locker type requested","Customer Name","Relationship No","Mobile No"};
	  static String SHEET = "SDLWaitListReport";
	public static ByteArrayInputStream getWaitListReportEXCELFile(
			List<SDLWaitListReportResponse> waitListReportResponses) {
		try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
		      Sheet sheet = workbook.createSheet(SHEET);
		      // Header
		      Row headerRow = sheet.createRow(0);
		      for (int col = 0; col < HEADERs.length; col++) {
		        Cell cell = headerRow.createCell(col);
		        cell.setCellValue(HEADERs[col]);
		      }
		      int rowIdx = 1;
		      for (SDLWaitListReportResponse waitListReportResponse : waitListReportResponses) {
		        Row row = sheet.createRow(rowIdx++);
		        row.createCell(0).setCellValue(waitListReportResponse.getBranchCode());
		        row.createCell(1).setCellValue(waitListReportResponse.getBranchName());
		        row.createCell(2).setCellValue(waitListReportResponse.getWaitingListRigisteredDate());
		        row.createCell(3).setCellValue(waitListReportResponse.getWaitingListRefNumber());
		        row.createCell(4).setCellValue(waitListReportResponse.getWaitingListSerNumber());
		        row.createCell(5).setCellValue(waitListReportResponse.getPrefLockerType());
		        row.createCell(6).setCellValue(waitListReportResponse.getCustomerName());
		        row.createCell(7).setCellValue(waitListReportResponse.getRelationshipNumber());
		        row.createCell(8).setCellValue(waitListReportResponse.getMobileNumber());
		      }
		      workbook.write(out);
		      return new ByteArrayInputStream(out.toByteArray());
		    } catch (IOException e) {
		      throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
		    }
	}
	public static ByteArrayInputStream getLockerHistoryReportExcelFile(
			List<SDLockerHistoryReportResponse> sdLockerHistoryReportResponses) {
		String[] HEADERs = { "Locker Reference No", "Box Number", "Cabinet Number","Relationship Number","Account Number","Customer Name","Locker Status"};
		 String SHEET = "Locker Box History";
		try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
		      Sheet sheet = workbook.createSheet(SHEET);
		      // Header
		      Row headerRow = sheet.createRow(0);
		      for (int col = 0; col < HEADERs.length; col++) {
		        Cell cell = headerRow.createCell(col);
		        cell.setCellValue(HEADERs[col]);
		      }
		      int rowIdx = 1;
		      for (SDLockerHistoryReportResponse sdLockerHistoryReportResponse : sdLockerHistoryReportResponses) {
		        Row row = sheet.createRow(rowIdx++);
		        row.createCell(0).setCellValue(sdLockerHistoryReportResponse.getLockerRefNumber());
		        row.createCell(1).setCellValue(sdLockerHistoryReportResponse.getBoxNumber());
		        row.createCell(2).setCellValue(sdLockerHistoryReportResponse.getCabinateNumber());
		        row.createCell(3).setCellValue(sdLockerHistoryReportResponse.getRelationshipNumber());
		        row.createCell(4).setCellValue(sdLockerHistoryReportResponse.getAccountNumber());
		        row.createCell(5).setCellValue(sdLockerHistoryReportResponse.getCustomerName());
		        row.createCell(6).setCellValue(sdLockerHistoryReportResponse.getLockerStatus());
		      
		      }
		      workbook.write(out);
		      return new ByteArrayInputStream(out.toByteArray());
		    } catch (IOException e) {
		      throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
		    }
	}
	public static ByteArrayInputStream getSDLockerAccessReportEXCELFile(
			List<SDLockerAccessReportResponse> lockerAccessReportResponses) {
		String[] HEADERs = { "Branch code","Branch Name","Locker Reference No","Box Number","Cabinet Number","Relationship Number","Account Number","Customer Name","POA Rel No","POA Names","Entry Time","Exit Time","Maker ID","Checker ID","Date of access"};
		 String SHEET = "Locker Access";
		try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
		      Sheet sheet = workbook.createSheet(SHEET);
		      // Header
		      Row headerRow = sheet.createRow(0);
		      for (int col = 0; col < HEADERs.length; col++) {
		        Cell cell = headerRow.createCell(col);
		        cell.setCellValue(HEADERs[col]);
		      }
		      
		      int rowIdx = 1;
		      for (SDLockerAccessReportResponse lockerAccessReportResponse : lockerAccessReportResponses) {
		        Row row = sheet.createRow(rowIdx++);
		        row.createCell(0).setCellValue(lockerAccessReportResponse.getBranchCode());
		        row.createCell(1).setCellValue(lockerAccessReportResponse.getBranchName());
		        row.createCell(2).setCellValue(lockerAccessReportResponse.getLockerRefNumber());
		        row.createCell(3).setCellValue(lockerAccessReportResponse.getBoxNumber());
		        row.createCell(4).setCellValue(lockerAccessReportResponse.getCabinateNumber());
		        row.createCell(5).setCellValue(lockerAccessReportResponse.getRelationshipNumber());
		        row.createCell(6).setCellValue(lockerAccessReportResponse.getAccountNumber());
		        row.createCell(7).setCellValue(lockerAccessReportResponse.getCustomerName());
		        row.createCell(8).setCellValue(lockerAccessReportResponse.getPoaRefNumber());
		        row.createCell(9).setCellValue(lockerAccessReportResponse.getPoaRefNames());
		        row.createCell(10).setCellValue(lockerAccessReportResponse.getEntryTime());
		        row.createCell(11).setCellValue(lockerAccessReportResponse.getExitTime());
		        row.createCell(12).setCellValue(lockerAccessReportResponse.getMakerID());
		        row.createCell(13).setCellValue(lockerAccessReportResponse.getCheckerID());
		        row.createCell(14).setCellValue(lockerAccessReportResponse.getDateOfAccess());
		       
		      }
		      workbook.write(out);
		      return new ByteArrayInputStream(out.toByteArray());
		    } catch (IOException e) {
		      throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
		    }
	}
	public static ByteArrayInputStream getSDLockerInactiveReportEXCELFile(
			List<SDLockerInactiveReportResponse> lockInactiveReportServices) {
		 String[] HEADERs = { "Branch code","Branch Name","Locker Reference No","Box Number","Cabinet Number","Relationship Number","Account Number","Customer Name","POA Rel No","POA Names","Entry Time","Exit Time","Maker ID","Checker ID","Date of access"};
		 String SHEET = "Inactive Locker";
		try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
		      Sheet sheet = workbook.createSheet(SHEET);
		      // Header
		      Row headerRow = sheet.createRow(0);
		      for (int col = 0; col < HEADERs.length; col++) {
		        Cell cell = headerRow.createCell(col);
		        cell.setCellValue(HEADERs[col]);
		      }
		      
		      int rowIdx = 1;
		      for (SDLockerInactiveReportResponse lockerInactiveReportResponse : lockInactiveReportServices) {
		        Row row = sheet.createRow(rowIdx++);
		        row.createCell(0).setCellValue(lockerInactiveReportResponse.getBranchCode());
		        row.createCell(1).setCellValue(lockerInactiveReportResponse.getBranchName());
		        row.createCell(2).setCellValue(lockerInactiveReportResponse.getLockerRefNumber());
		        row.createCell(3).setCellValue(lockerInactiveReportResponse.getBoxNumber());
		        row.createCell(4).setCellValue(lockerInactiveReportResponse.getCabinateNumber());
		        row.createCell(5).setCellValue(lockerInactiveReportResponse.getRelationshipNumber());
		        row.createCell(6).setCellValue(lockerInactiveReportResponse.getAccountNumber());
		        row.createCell(7).setCellValue(lockerInactiveReportResponse.getCustomerName());
		        row.createCell(8).setCellValue(lockerInactiveReportResponse.getPoaRefNumber());
		        row.createCell(9).setCellValue(lockerInactiveReportResponse.getPoaRefNames());
		        row.createCell(10).setCellValue(lockerInactiveReportResponse.getEntryTime());
		        row.createCell(11).setCellValue(lockerInactiveReportResponse.getExitTime());
		        row.createCell(12).setCellValue(lockerInactiveReportResponse.getMakerID());
		        row.createCell(13).setCellValue(lockerInactiveReportResponse.getCheckerID());
		        row.createCell(14).setCellValue(lockerInactiveReportResponse.getDateOfAccess());
		       
		      }
		      workbook.write(out);
		      return new ByteArrayInputStream(out.toByteArray());
		    } catch (IOException e) {
		      throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
		    }
	}
	
	public static ByteArrayInputStream getSDLChargesOutstandingReportCSVFile(
			List<SDLChargesOutstandingReportResponse> chargesOutstandingReportResponses) {
		 String[] HEADERs = { "Locker Reference No","Box Number","Cabinet Number","Charge code","Account Number","Customer Name","Charge Amount outstanding","No.of cycles"};
		 String SHEET = "SDL Charges Outstanding";
		try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
		      Sheet sheet = workbook.createSheet(SHEET);
		      // Header
		      Row headerRow = sheet.createRow(0);
		      for (int col = 0; col < HEADERs.length; col++) {
		        Cell cell = headerRow.createCell(col);
		        cell.setCellValue(HEADERs[col]);
		      }
		      
		      int rowIdx = 1;
		      for (SDLChargesOutstandingReportResponse chargesOutstandingReportResponse : chargesOutstandingReportResponses) {
		        Row row = sheet.createRow(rowIdx++);
		        row.createCell(0).setCellValue(chargesOutstandingReportResponse.getLockerRefNumber());
		        row.createCell(1).setCellValue(chargesOutstandingReportResponse.getBoxNumber());
		        row.createCell(2).setCellValue(chargesOutstandingReportResponse.getCabinateNumber());
		        row.createCell(3).setCellValue(chargesOutstandingReportResponse.getChargeCode());
		        row.createCell(4).setCellValue(chargesOutstandingReportResponse.getAccountNumber());
		        row.createCell(5).setCellValue(chargesOutstandingReportResponse.getCustomerName());
		        row.createCell(6).setCellValue(chargesOutstandingReportResponse.getChargeAmounOutstanding());
		        row.createCell(7).setCellValue(chargesOutstandingReportResponse.getNoOfCycles());
		      
		       
		      }
		      workbook.write(out);
		      return new ByteArrayInputStream(out.toByteArray());
		    } catch (IOException e) {
		      throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
		    }
	}

}
