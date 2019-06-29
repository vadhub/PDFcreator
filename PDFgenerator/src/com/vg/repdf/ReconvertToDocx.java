package com.vg.repdf;

import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;

public class ReconvertToDocx {
	
	public void convert(String input, String output){
		
		
		PdfDocument doc = new PdfDocument();	
		doc.loadFromFile(input);
		doc.saveToFile(output, FileFormat.DOCX);
		doc.close();
		
		
		System.out.println("Easy!!!");
	}

}
