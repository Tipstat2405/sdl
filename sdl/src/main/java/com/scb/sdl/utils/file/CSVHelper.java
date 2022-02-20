package com.scb.sdl.utils.file;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.QuoteMode;

import com.scb.sdl.model.Response.SDLChargesOutstandingReportResponse;
import com.scb.sdl.model.Response.SDLWaitListReportResponse;
import com.scb.sdl.model.Response.SDLockerAccessReportResponse;
import com.scb.sdl.model.Response.SDLockerHistoryReportResponse;
import com.scb.sdl.model.Response.SDLockerInactiveReportResponse;

public class CSVHelper {

	public static ByteArrayInputStream getWaitListReportCSVFile(
			List<SDLWaitListReportResponse> waitListReportResponses) {
		
		final CSVFormat format = CSVFormat.DEFAULT.withHeader("Branch Code", "Branch Name", "WL Registered Date","Waitlisted Ref No","Waitlist serial No","Preferred Locker type requested","Customer Name","Relationship No","Mobile No");
		
	    try (ByteArrayOutputStream out = new ByteArrayOutputStream();
	        CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
	   
	      for (SDLWaitListReportResponse sdlWaitListReportResponse : waitListReportResponses) {
	        List<String> data = Arrays.asList(
	              sdlWaitListReportResponse.getBranchCode(),
	              sdlWaitListReportResponse.getBranchName(),
	              sdlWaitListReportResponse.getWaitingListRigisteredDate(),
	              sdlWaitListReportResponse.getWaitingListRefNumber(),
	              sdlWaitListReportResponse.getWaitingListSerNumber(),
	              sdlWaitListReportResponse.getPrefLockerType(),
	              sdlWaitListReportResponse.getCustomerName(),
	              sdlWaitListReportResponse.getRelationshipNumber(),
	              sdlWaitListReportResponse.getMobileNumber()
	              )
	            ;
	        csvPrinter.printRecord(data);
	       
	      }
	      csvPrinter.flush();
	      return new ByteArrayInputStream(out.toByteArray());
	    } catch (IOException e) {
	      throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
	    }
	}

	public static ByteArrayInputStream getLockerHistoryReportCSVFile(
			List<SDLockerHistoryReportResponse> historyReportResponses) {

		final CSVFormat format = CSVFormat.DEFAULT.withHeader("Locker Reference No", "Box Number", "Cabinet Number","Relationship Number","Account Number","Customer Name","Locker Status");
		
	    try (ByteArrayOutputStream out = new ByteArrayOutputStream();
	        CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
	   
	      for (SDLockerHistoryReportResponse sdLockerHistoryReportResponse : historyReportResponses) {
	        List<String> data = Arrays.asList(
	              sdLockerHistoryReportResponse.getLockerRefNumber(),
	              sdLockerHistoryReportResponse.getBoxNumber(),
	              sdLockerHistoryReportResponse.getCabinateNumber(),
	              sdLockerHistoryReportResponse.getRelationshipNumber(),
	              sdLockerHistoryReportResponse.getAccountNumber(),
	              sdLockerHistoryReportResponse.getCustomerName(),
	              sdLockerHistoryReportResponse.getLockerStatus()
	              )
	            ;
	        csvPrinter.printRecord(data);
	       
	      }
	      csvPrinter.flush();
	      return new ByteArrayInputStream(out.toByteArray());
	    } catch (IOException e) {
	      throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
	    }
	}

	public static ByteArrayInputStream getSDLockerAccessReportCSVFile(
			List<SDLockerAccessReportResponse> lockerAccessReportResponses) {
final CSVFormat format = CSVFormat.DEFAULT.withHeader("Branch code","Branch Name","Locker Reference No","Box Number","Cabinet Number","Relationship Number","Account Number","Customer Name","POA Rel No","POA Names","Entry Time","Exit Time","Maker ID","Checker ID","Date of access");



	    try (ByteArrayOutputStream out = new ByteArrayOutputStream();
	        CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
	   
	      for (SDLockerAccessReportResponse lockerAccessReportResponse : lockerAccessReportResponses) {
	        List<String> data = Arrays.asList(
	              lockerAccessReportResponse.getBranchCode(),
	              lockerAccessReportResponse.getBranchName(),
	              lockerAccessReportResponse.getLockerRefNumber(),
	              lockerAccessReportResponse.getBoxNumber(),
	              lockerAccessReportResponse.getCabinateNumber(),
	              lockerAccessReportResponse.getRelationshipNumber(),
	              lockerAccessReportResponse.getAccountNumber(),
	              lockerAccessReportResponse.getCustomerName(),
	              lockerAccessReportResponse.getPoaRefNumber(),
	              lockerAccessReportResponse.getPoaRefNames(),
	              lockerAccessReportResponse.getEntryTime(),
	              lockerAccessReportResponse.getExitTime(),
	              lockerAccessReportResponse.getCheckerID(),
	              lockerAccessReportResponse.getMakerID(),
	              lockerAccessReportResponse.getDateOfAccess()
	              )
	            ;
	        csvPrinter.printRecord(data);
	       
	      }
	      csvPrinter.flush();
	      return new ByteArrayInputStream(out.toByteArray());
	    } catch (IOException e) {
	      throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
	    }
	}

	public static ByteArrayInputStream getSDLockerInactiveReportCSVFile(
			List<SDLockerInactiveReportResponse> lockInactiveReportServices) {
		final CSVFormat format = CSVFormat.DEFAULT.withHeader("Branch code","Branch Name","Locker Reference No","Box Number","Cabinet Number","Relationship Number","Account Number","Customer Name","POA Rel No","POA Names","Entry Time","Exit Time","Maker ID","Checker ID","Date of access");
        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
	        CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
	   
	      for (SDLockerInactiveReportResponse lockerInactiveReportResponse : lockInactiveReportServices) {
	        List<String> data = Arrays.asList(
	        		lockerInactiveReportResponse.getBranchCode(),
	        		lockerInactiveReportResponse.getBranchName(),
	        		lockerInactiveReportResponse.getLockerRefNumber(),
	        		lockerInactiveReportResponse.getBoxNumber(),
	        		lockerInactiveReportResponse.getCabinateNumber(),
	        		lockerInactiveReportResponse.getRelationshipNumber(),
	                lockerInactiveReportResponse.getAccountNumber(),
	                lockerInactiveReportResponse.getCustomerName(),
	                lockerInactiveReportResponse.getPoaRefNumber(),
	                lockerInactiveReportResponse.getPoaRefNames(),
	                lockerInactiveReportResponse.getEntryTime(),
	                lockerInactiveReportResponse.getExitTime(),
	                lockerInactiveReportResponse.getCheckerID(),
	                lockerInactiveReportResponse.getMakerID(),
	                lockerInactiveReportResponse.getDateOfAccess()
	              )
	            ;
	        csvPrinter.printRecord(data);
	       
	      }
	      csvPrinter.flush();
	      return new ByteArrayInputStream(out.toByteArray());
	    } catch (IOException e) {
	      throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
	    }
	}

	public static ByteArrayInputStream getSDLChargesOutstandingReportCSVFile(
			List<SDLChargesOutstandingReportResponse> chargesOutstandingReportResponses) {
		final CSVFormat format = CSVFormat.DEFAULT.withHeader("Locker Reference No","Box Number","Cabinet Number","Charge code","Account Number","Customer Name","Charge Amount outstanding","No.of cycles");
        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
	        CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
        	
        	
	      for (SDLChargesOutstandingReportResponse chargesOutstandingReportResponse : chargesOutstandingReportResponses) {
	        List<String> data = Arrays.asList(
	        		chargesOutstandingReportResponse.getLockerRefNumber(),
	        		chargesOutstandingReportResponse.getBoxNumber(),
	        		chargesOutstandingReportResponse.getCabinateNumber(),
	        		chargesOutstandingReportResponse.getChargeCode(),
	        		chargesOutstandingReportResponse.getAccountNumber(),
	        		chargesOutstandingReportResponse.getCustomerName(),
	        		chargesOutstandingReportResponse.getChargeAmounOutstanding(),
	        		chargesOutstandingReportResponse.getNoOfCycles()
	              )
	            ;
	        csvPrinter.printRecord(data);
	       
	      }
	      csvPrinter.flush();
	      return new ByteArrayInputStream(out.toByteArray());
	    } catch (IOException e) {
	      throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
	    }
	}

	

	

}
