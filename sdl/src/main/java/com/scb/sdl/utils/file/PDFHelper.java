package com.scb.sdl.utils.file;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.stream.Stream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.scb.sdl.model.Response.SDLChargesOutstandingReportResponse;
import com.scb.sdl.model.Response.SDLWaitListReportResponse;
import com.scb.sdl.model.Response.SDLockerAccessReportResponse;
import com.scb.sdl.model.Response.SDLockerHistoryReportResponse;
import com.scb.sdl.model.Response.SDLockerInactiveReportResponse;

public class PDFHelper {

	static Document document;
	static Paragraph para;
	static PdfPTable table;
	static Font font;
	public static ByteArrayInputStream getWaitListReportPDFFile(
			List<SDLWaitListReportResponse> waitListReportResponses) {
		document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {

            PdfWriter.getInstance(document, out);
            document.open();

            // Add Text to PDF file ->
            font = FontFactory.getFont(FontFactory.COURIER, 14, 
                                          BaseColor.BLACK);
            para = new Paragraph("SDL Waitlist", font);
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            document.add(Chunk.NEWLINE);

            table = new PdfPTable(9);
            // Add PDF Table Header ->
            Stream.of("Branch Code", "Branch Name", "WL Registered Date","Waitlisted Ref No","Waitlist serial No","Preferred Locker type requested","Customer Name","Relationship No","Mobile No").forEach(headerTitle -> 
                                     {
                PdfPCell header = new PdfPCell();
                Font headFont = FontFactory.
                                  getFont(FontFactory.HELVETICA_BOLD);
                header.setBackgroundColor(BaseColor.LIGHT_GRAY);
              //  header.setHorizontalAlignment(Element.ALIGN_CENTER);
                header.setBorderWidth(1);
                header.setPhrase(new Phrase(headerTitle, headFont));
                table.addCell(header);
            });

            for (SDLWaitListReportResponse sdlWaitListReportResponse : waitListReportResponses) {
                PdfPCell idCell = new PdfPCell(new Phrase(sdlWaitListReportResponse.getBranchCode()));
                idCell.setPaddingLeft(4);
                idCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                idCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(idCell);

                PdfPCell firstNameCell = new PdfPCell(new Phrase
                                 (sdlWaitListReportResponse.getBranchName()));
                firstNameCell.setPaddingLeft(4);
                firstNameCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                firstNameCell.setHorizontalAlignment(Element.ALIGN_LEFT);
                table.addCell(firstNameCell);

                PdfPCell lastNameCell = new PdfPCell(new Phrase
                          (sdlWaitListReportResponse.getWaitingListRigisteredDate()));
                lastNameCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                lastNameCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                lastNameCell.setPaddingRight(4);
                table.addCell(lastNameCell);
                
                PdfPCell waitingListRefNumber = new PdfPCell(new Phrase
                        (sdlWaitListReportResponse.getWaitingListRefNumber()));
                waitingListRefNumber.setVerticalAlignment(Element.ALIGN_MIDDLE);
                waitingListRefNumber.setHorizontalAlignment(Element.ALIGN_RIGHT);
                waitingListRefNumber.setPaddingRight(4);
              table.addCell(waitingListRefNumber);
              
              PdfPCell waitingListSerNumber = new PdfPCell(new Phrase
                      (sdlWaitListReportResponse.getWaitingListSerNumber()));
              waitingListSerNumber.setVerticalAlignment(Element.ALIGN_MIDDLE);
              waitingListSerNumber.setHorizontalAlignment(Element.ALIGN_RIGHT);
              waitingListSerNumber.setPaddingRight(4);
            table.addCell(waitingListSerNumber);
            
            PdfPCell prefLockerType = new PdfPCell(new Phrase
                    (sdlWaitListReportResponse.getPrefLockerType()));
            prefLockerType.setVerticalAlignment(Element.ALIGN_MIDDLE);
            prefLockerType.setHorizontalAlignment(Element.ALIGN_RIGHT);
            prefLockerType.setPaddingRight(4);
          table.addCell(prefLockerType);
          PdfPCell customerName = new PdfPCell(new Phrase
                  (sdlWaitListReportResponse.getCustomerName()));
          customerName.setVerticalAlignment(Element.ALIGN_MIDDLE);
          customerName.setHorizontalAlignment(Element.ALIGN_RIGHT);
          customerName.setPaddingRight(4);
        table.addCell(customerName);
        
        PdfPCell relationshipNumber = new PdfPCell(new Phrase
                (sdlWaitListReportResponse.getRelationshipNumber()));
        relationshipNumber.setVerticalAlignment(Element.ALIGN_MIDDLE);
        relationshipNumber.setHorizontalAlignment(Element.ALIGN_RIGHT);
        relationshipNumber.setPaddingRight(4);
      table.addCell(relationshipNumber);
      PdfPCell mobileNumber = new PdfPCell(new Phrase
              (sdlWaitListReportResponse.getMobileNumber()));
      mobileNumber.setVerticalAlignment(Element.ALIGN_MIDDLE);
      mobileNumber.setHorizontalAlignment(Element.ALIGN_RIGHT);
      mobileNumber.setPaddingRight(4);
    table.addCell(mobileNumber);
            }
            document.add(table);

            document.close();
        } catch (DocumentException e) {
            
        }

        return new ByteArrayInputStream(out.toByteArray());
	}

	public static ByteArrayInputStream getLockerHistoryReportPdfFile(
			List<SDLockerHistoryReportResponse> sdLockerHistoryReportResponses) {
		document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {

            PdfWriter.getInstance(document, out);
            document.open();

            // Add Text to PDF file ->
            font = FontFactory.getFont(FontFactory.COURIER, 14, 
                                          BaseColor.BLACK);
            para = new Paragraph("Locker Box History", font);
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            document.add(Chunk.NEWLINE);

            table = new PdfPTable(7);
            // Add PDF Table Header ->
            Stream.of("Locker Reference No", "Box Number", "Cabinet Number","Relationship Number","Account Number","Customer Name","Locker Status").forEach(headerTitle -> 
                                     {
                PdfPCell header = new PdfPCell();
                Font headFont = FontFactory.
                                  getFont(FontFactory.HELVETICA_BOLD);
                header.setBackgroundColor(BaseColor.LIGHT_GRAY);
              //  header.setHorizontalAlignment(Element.ALIGN_CENTER);
                header.setBorderWidth(1);
                header.setPhrase(new Phrase(headerTitle, headFont));
                table.addCell(header);
            });

            for (SDLockerHistoryReportResponse sdLockerHistoryReportResponse : sdLockerHistoryReportResponses) {
                PdfPCell lockerRef = new PdfPCell(new Phrase(sdLockerHistoryReportResponse.getLockerRefNumber()));
                lockerRef.setPaddingLeft(4);
                lockerRef.setVerticalAlignment(Element.ALIGN_MIDDLE);
                lockerRef.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(lockerRef);

                PdfPCell boxNum = new PdfPCell(new Phrase
                                 (sdLockerHistoryReportResponse.getBoxNumber()));
                boxNum.setPaddingLeft(4);
                boxNum.setVerticalAlignment(Element.ALIGN_MIDDLE);
                boxNum.setHorizontalAlignment(Element.ALIGN_LEFT);
                table.addCell(boxNum);

                PdfPCell cabinateNu = new PdfPCell(new Phrase
                          (sdLockerHistoryReportResponse.getCabinateNumber()));
                cabinateNu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cabinateNu.setHorizontalAlignment(Element.ALIGN_RIGHT);
                cabinateNu.setPaddingRight(4);
                table.addCell(cabinateNu);
                
                PdfPCell relationshipNumber = new PdfPCell(new Phrase
                        (sdLockerHistoryReportResponse.getRelationshipNumber()));
                relationshipNumber.setVerticalAlignment(Element.ALIGN_MIDDLE);
                relationshipNumber.setHorizontalAlignment(Element.ALIGN_RIGHT);
                relationshipNumber.setPaddingRight(4);
                table.addCell(relationshipNumber);
                
                PdfPCell accountNu = new PdfPCell(new Phrase
                        (sdLockerHistoryReportResponse.getAccountNumber()));
                accountNu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                accountNu.setHorizontalAlignment(Element.ALIGN_RIGHT);
                accountNu.setPaddingRight(4);
                table.addCell(accountNu);
                
                PdfPCell customerName = new PdfPCell(new Phrase
                        (sdLockerHistoryReportResponse.getCustomerName()));
                customerName.setVerticalAlignment(Element.ALIGN_MIDDLE);
                customerName.setHorizontalAlignment(Element.ALIGN_RIGHT);
                customerName.setPaddingRight(4);
                table.addCell(customerName);
              
                PdfPCell lockerStatus = new PdfPCell(new Phrase
                      (sdLockerHistoryReportResponse.getLockerStatus()));
                lockerStatus.setVerticalAlignment(Element.ALIGN_MIDDLE);
                lockerStatus.setHorizontalAlignment(Element.ALIGN_RIGHT);
                lockerStatus.setPaddingRight(4);
                table.addCell(lockerStatus);
            
            
            }
            document.add(table);

            document.close();
        } catch (DocumentException e) {
            
        }

        return new ByteArrayInputStream(out.toByteArray());
	}

	public static ByteArrayInputStream getSDLockerAccessReportPDFFile(
			List<SDLockerAccessReportResponse> lockerAccessReportResponses) {
		document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {

            PdfWriter.getInstance(document, out);
            document.open();

            // Add Text to PDF file ->
            font = FontFactory.getFont(FontFactory.COURIER, 15, 
                                          BaseColor.BLACK);
            para = new Paragraph("Locker Access", font);
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            document.add(Chunk.NEWLINE);

            table = new PdfPTable(15);
            // Add PDF Table Header ->
            Stream.of("Branch code","Branch Name","Locker Reference No","Box Number","Cabinet Number","Relationship Number","Account Number","Customer Name","POA Rel No","POA Names","Entry Time","Exit Time","Maker ID","Checker ID","Date of access").forEach(headerTitle -> 
                                     {
                PdfPCell header = new PdfPCell();
                Font headFont = FontFactory.
                                  getFont(FontFactory.HELVETICA_BOLD);
                header.setBackgroundColor(BaseColor.LIGHT_GRAY);
              //  header.setHorizontalAlignment(Element.ALIGN_CENTER);
                header.setBorderWidth(1);
                header.setPhrase(new Phrase(headerTitle, headFont));
                table.addCell(header);
            });
            for (SDLockerAccessReportResponse lockerAccessReportResponse : lockerAccessReportResponses) {
            	PdfPCell branchCode = new PdfPCell(new Phrase(lockerAccessReportResponse.getBranchCode()));
            	branchCode.setPaddingLeft(4);
            	branchCode.setVerticalAlignment(Element.ALIGN_MIDDLE);
            	branchCode.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(branchCode);
                PdfPCell branchName = new PdfPCell(new Phrase(lockerAccessReportResponse.getBranchName()));
                branchName.setPaddingLeft(4);
                branchName.setVerticalAlignment(Element.ALIGN_MIDDLE);
                branchName.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(branchName);
                PdfPCell lockerRef = new PdfPCell(new Phrase(lockerAccessReportResponse.getLockerRefNumber()));
                lockerRef.setPaddingLeft(4);
                lockerRef.setVerticalAlignment(Element.ALIGN_MIDDLE);
                lockerRef.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(lockerRef);
                PdfPCell boxNumber = new PdfPCell(new Phrase(lockerAccessReportResponse.getBoxNumber()));
                boxNumber.setPaddingLeft(4);
                boxNumber.setVerticalAlignment(Element.ALIGN_MIDDLE);
                boxNumber.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(boxNumber);
                PdfPCell cabinateNu = new PdfPCell(new Phrase
                          (lockerAccessReportResponse.getCabinateNumber()));
                cabinateNu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cabinateNu.setHorizontalAlignment(Element.ALIGN_RIGHT);
                cabinateNu.setPaddingRight(4);
                table.addCell(cabinateNu);
                PdfPCell relationshipNumber = new PdfPCell(new Phrase
                        (lockerAccessReportResponse.getRelationshipNumber()));
                relationshipNumber.setVerticalAlignment(Element.ALIGN_MIDDLE);
                relationshipNumber.setHorizontalAlignment(Element.ALIGN_RIGHT);
                relationshipNumber.setPaddingRight(4);
                table.addCell(relationshipNumber);
                PdfPCell accountNu = new PdfPCell(new Phrase
                        (lockerAccessReportResponse.getAccountNumber()));
                accountNu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                accountNu.setHorizontalAlignment(Element.ALIGN_RIGHT);
                accountNu.setPaddingRight(4);
                table.addCell(accountNu);
                
                PdfPCell customerName = new PdfPCell(new Phrase
                        (lockerAccessReportResponse.getCustomerName()));
                customerName.setVerticalAlignment(Element.ALIGN_MIDDLE);
                customerName.setHorizontalAlignment(Element.ALIGN_RIGHT);
                customerName.setPaddingRight(4);
                table.addCell(customerName);
                PdfPCell poaRefNumber = new PdfPCell(new Phrase(lockerAccessReportResponse.getPoaRefNumber()));
                poaRefNumber.setPaddingLeft(4);
                poaRefNumber.setVerticalAlignment(Element.ALIGN_MIDDLE);
                poaRefNumber.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(poaRefNumber);
                PdfPCell poaRefNames = new PdfPCell(new Phrase(lockerAccessReportResponse.getPoaRefNames()));
                poaRefNames.setPaddingLeft(4);
                poaRefNames.setVerticalAlignment(Element.ALIGN_MIDDLE);
                poaRefNames.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(poaRefNames);
                PdfPCell entryTime = new PdfPCell(new Phrase(lockerAccessReportResponse.getEntryTime()));
                entryTime.setPaddingLeft(4);
                entryTime.setVerticalAlignment(Element.ALIGN_MIDDLE);
                entryTime.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(entryTime);
                PdfPCell exitTime = new PdfPCell(new Phrase(lockerAccessReportResponse.getExitTime()));
                exitTime.setPaddingLeft(4);
                exitTime.setVerticalAlignment(Element.ALIGN_MIDDLE);
                exitTime.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(exitTime);
                PdfPCell checkerID = new PdfPCell(new Phrase(lockerAccessReportResponse.getCheckerID()));
                checkerID.setPaddingLeft(4);
                checkerID.setVerticalAlignment(Element.ALIGN_MIDDLE);
                checkerID.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(checkerID);

                PdfPCell makerID = new PdfPCell(new Phrase
                                 (lockerAccessReportResponse.getMakerID()));
                makerID.setPaddingLeft(4);
                makerID.setVerticalAlignment(Element.ALIGN_MIDDLE);
                makerID.setHorizontalAlignment(Element.ALIGN_LEFT);
                table.addCell(makerID);

                PdfPCell dateOfAccess = new PdfPCell(new Phrase
                      (lockerAccessReportResponse.getDateOfAccess()));
                dateOfAccess.setVerticalAlignment(Element.ALIGN_MIDDLE);
                dateOfAccess.setHorizontalAlignment(Element.ALIGN_RIGHT);
                dateOfAccess.setPaddingRight(4);
                table.addCell(dateOfAccess);
            
            
            }
            document.add(table);

            document.close();
        } catch (DocumentException e) {
            
        }

        return new ByteArrayInputStream(out.toByteArray());
	}

	public static ByteArrayInputStream getSDLockerInactiveReportPDFFile(
			List<SDLockerInactiveReportResponse> lockInactiveReportResponses) {
		document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {

            PdfWriter.getInstance(document, out);
            document.open();

            // Add Text to PDF file ->
            font = FontFactory.getFont(FontFactory.COURIER, 15, 
                                          BaseColor.BLACK);
            para = new Paragraph("Inactive Locker", font);
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            document.add(Chunk.NEWLINE);

            table = new PdfPTable(15);
            // Add PDF Table Header ->
            Stream.of("Branch code","Branch Name","Locker Reference No","Box Number","Cabinet Number","Relationship Number","Account Number","Customer Name","POA Rel No","POA Names","Entry Time","Exit Time","Maker ID","Checker ID","Date of access").forEach(headerTitle -> 
                                     {
                PdfPCell header = new PdfPCell();
                Font headFont = FontFactory.
                                  getFont(FontFactory.HELVETICA_BOLD);
                header.setBackgroundColor(BaseColor.LIGHT_GRAY);
              //  header.setHorizontalAlignment(Element.ALIGN_CENTER);
                header.setBorderWidth(1);
                header.setPhrase(new Phrase(headerTitle, headFont));
                table.addCell(header);
            });
            for (SDLockerInactiveReportResponse lockerInactiveReportResponse : lockInactiveReportResponses) {
            	PdfPCell branchCode = new PdfPCell(new Phrase(lockerInactiveReportResponse.getBranchCode()));
            	branchCode.setPaddingLeft(4);
            	branchCode.setVerticalAlignment(Element.ALIGN_MIDDLE);
            	branchCode.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(branchCode);
                PdfPCell branchName = new PdfPCell(new Phrase(lockerInactiveReportResponse.getBranchName()));
                branchName.setPaddingLeft(4);
                branchName.setVerticalAlignment(Element.ALIGN_MIDDLE);
                branchName.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(branchName);
                PdfPCell lockerRef = new PdfPCell(new Phrase(lockerInactiveReportResponse.getLockerRefNumber()));
                lockerRef.setPaddingLeft(4);
                lockerRef.setVerticalAlignment(Element.ALIGN_MIDDLE);
                lockerRef.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(lockerRef);
                PdfPCell boxNumber = new PdfPCell(new Phrase(lockerInactiveReportResponse.getBoxNumber()));
                boxNumber.setPaddingLeft(4);
                boxNumber.setVerticalAlignment(Element.ALIGN_MIDDLE);
                boxNumber.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(boxNumber);
                PdfPCell cabinateNu = new PdfPCell(new Phrase
                          (lockerInactiveReportResponse.getCabinateNumber()));
                cabinateNu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cabinateNu.setHorizontalAlignment(Element.ALIGN_RIGHT);
                cabinateNu.setPaddingRight(4);
                table.addCell(cabinateNu);
                PdfPCell relationshipNumber = new PdfPCell(new Phrase
                        (lockerInactiveReportResponse.getRelationshipNumber()));
                relationshipNumber.setVerticalAlignment(Element.ALIGN_MIDDLE);
                relationshipNumber.setHorizontalAlignment(Element.ALIGN_RIGHT);
                relationshipNumber.setPaddingRight(4);
                table.addCell(relationshipNumber);
                PdfPCell accountNu = new PdfPCell(new Phrase
                        (lockerInactiveReportResponse.getAccountNumber()));
                accountNu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                accountNu.setHorizontalAlignment(Element.ALIGN_RIGHT);
                accountNu.setPaddingRight(4);
                table.addCell(accountNu);
                
                PdfPCell customerName = new PdfPCell(new Phrase
                        (lockerInactiveReportResponse.getCustomerName()));
                customerName.setVerticalAlignment(Element.ALIGN_MIDDLE);
                customerName.setHorizontalAlignment(Element.ALIGN_RIGHT);
                customerName.setPaddingRight(4);
                table.addCell(customerName);
                PdfPCell poaRefNumber = new PdfPCell(new Phrase(lockerInactiveReportResponse.getPoaRefNumber()));
                poaRefNumber.setPaddingLeft(4);
                poaRefNumber.setVerticalAlignment(Element.ALIGN_MIDDLE);
                poaRefNumber.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(poaRefNumber);
                PdfPCell poaRefNames = new PdfPCell(new Phrase(lockerInactiveReportResponse.getPoaRefNames()));
                poaRefNames.setPaddingLeft(4);
                poaRefNames.setVerticalAlignment(Element.ALIGN_MIDDLE);
                poaRefNames.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(poaRefNames);
                PdfPCell entryTime = new PdfPCell(new Phrase(lockerInactiveReportResponse.getEntryTime()));
                entryTime.setPaddingLeft(4);
                entryTime.setVerticalAlignment(Element.ALIGN_MIDDLE);
                entryTime.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(entryTime);
                PdfPCell exitTime = new PdfPCell(new Phrase(lockerInactiveReportResponse.getExitTime()));
                exitTime.setPaddingLeft(4);
                exitTime.setVerticalAlignment(Element.ALIGN_MIDDLE);
                exitTime.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(exitTime);
                PdfPCell checkerID = new PdfPCell(new Phrase(lockerInactiveReportResponse.getCheckerID()));
                checkerID.setPaddingLeft(4);
                checkerID.setVerticalAlignment(Element.ALIGN_MIDDLE);
                checkerID.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(checkerID);

                PdfPCell makerID = new PdfPCell(new Phrase
                                 (lockerInactiveReportResponse.getMakerID()));
                makerID.setPaddingLeft(4);
                makerID.setVerticalAlignment(Element.ALIGN_MIDDLE);
                makerID.setHorizontalAlignment(Element.ALIGN_LEFT);
                table.addCell(makerID);

                PdfPCell dateOfAccess = new PdfPCell(new Phrase
                      (lockerInactiveReportResponse.getDateOfAccess()));
                dateOfAccess.setVerticalAlignment(Element.ALIGN_MIDDLE);
                dateOfAccess.setHorizontalAlignment(Element.ALIGN_RIGHT);
                dateOfAccess.setPaddingRight(4);
                table.addCell(dateOfAccess);
            
            
            }
            document.add(table);

            document.close();
        } catch (DocumentException e) {
            
        }

        return new ByteArrayInputStream(out.toByteArray());
	}

	public static ByteArrayInputStream getSDLChargesOutstandingReportCSVFile(
			List<SDLChargesOutstandingReportResponse> chargesOutstandingReportResponses) {
		document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {

            PdfWriter.getInstance(document, out);
            document.open();

            // Add Text to PDF file ->
            font = FontFactory.getFont(FontFactory.COURIER, 15, 
                                          BaseColor.BLACK);
            para = new Paragraph("SDL Charges Outstanding", font);
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            document.add(Chunk.NEWLINE);

            table = new PdfPTable(8);
            // Add PDF Table Header ->
            Stream.of("Locker Reference No","Box Number","Cabinet Number","Charge code","Account Number","Customer Name","Charge Amount outstanding","No.of cycles").forEach(headerTitle -> 
                                     {
                PdfPCell header = new PdfPCell();
                Font headFont = FontFactory.
                                  getFont(FontFactory.HELVETICA_BOLD);
                header.setBackgroundColor(BaseColor.LIGHT_GRAY);
              //  header.setHorizontalAlignment(Element.ALIGN_CENTER);
                header.setBorderWidth(1);
                header.setPhrase(new Phrase(headerTitle, headFont));
                table.addCell(header);
            });
            for (SDLChargesOutstandingReportResponse chargesOutstandingReportResponse : chargesOutstandingReportResponses) {
            	 PdfPCell lockerRef = new PdfPCell(new Phrase(chargesOutstandingReportResponse.getLockerRefNumber()));
                 lockerRef.setPaddingLeft(4);
                 lockerRef.setVerticalAlignment(Element.ALIGN_MIDDLE);
                 lockerRef.setHorizontalAlignment(Element.ALIGN_CENTER);
                 table.addCell(lockerRef);
                 
                 PdfPCell boxNumber = new PdfPCell(new Phrase(chargesOutstandingReportResponse.getBoxNumber()));
                 boxNumber.setPaddingLeft(4);
                 boxNumber.setVerticalAlignment(Element.ALIGN_MIDDLE);
                 boxNumber.setHorizontalAlignment(Element.ALIGN_CENTER);
                 table.addCell(boxNumber);
                 
                 PdfPCell cabinateNu = new PdfPCell(new Phrase
                         (chargesOutstandingReportResponse.getCabinateNumber()));
                 cabinateNu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                 cabinateNu.setHorizontalAlignment(Element.ALIGN_RIGHT);
                 cabinateNu.setPaddingRight(4);
                 table.addCell(cabinateNu);
               
            	PdfPCell chargeCode = new PdfPCell(new Phrase(chargesOutstandingReportResponse.getChargeCode()));
            	chargeCode.setPaddingLeft(4);
            	chargeCode.setVerticalAlignment(Element.ALIGN_MIDDLE);
            	chargeCode.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(chargeCode);
                
                PdfPCell accountNu = new PdfPCell(new Phrase
                        (chargesOutstandingReportResponse.getAccountNumber()));
                accountNu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                accountNu.setHorizontalAlignment(Element.ALIGN_RIGHT);
                accountNu.setPaddingRight(4);
                table.addCell(accountNu);
                
                PdfPCell customerName = new PdfPCell(new Phrase
                        (chargesOutstandingReportResponse.getCustomerName()));
                customerName.setVerticalAlignment(Element.ALIGN_MIDDLE);
                customerName.setHorizontalAlignment(Element.ALIGN_RIGHT);
                customerName.setPaddingRight(4);
                table.addCell(customerName);
                
                PdfPCell chargeOutsta = new PdfPCell(new Phrase(chargesOutstandingReportResponse.getChargeAmounOutstanding()));
                chargeOutsta.setPaddingLeft(4);
                chargeOutsta.setVerticalAlignment(Element.ALIGN_MIDDLE);
                chargeOutsta.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(chargeOutsta);
             
                PdfPCell cycles = new PdfPCell(new Phrase
                          (chargesOutstandingReportResponse.getNoOfCycles()));
                cycles.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cycles.setHorizontalAlignment(Element.ALIGN_RIGHT);
                cycles.setPaddingRight(4);
                table.addCell(cycles);
               
            
            
            }
            document.add(table);

            document.close();
        } catch (DocumentException e) {
            
        }

        return new ByteArrayInputStream(out.toByteArray());
	}

}
