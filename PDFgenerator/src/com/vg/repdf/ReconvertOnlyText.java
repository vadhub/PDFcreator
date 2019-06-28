package com.vg.repdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReconvertOnlyText {

	public void reconvert(String input, String output) throws IOException{
		PDDocument doc = PDDocument.load(new File(input));
		
		PDFTextStripper ts = new PDFTextStripper();
		ts.setLineSeparator("\n");
		ts.setAddMoreFormatting(true);
		int numbOfPage = doc.getNumberOfPages();
		ts.setStartPage(1);
		ts.setEndPage(numbOfPage);
		
		String text = ts.getText(doc);
		System.out.println(text);
		
		FileOutputStream fos = new FileOutputStream(output);
		
		//formating text
		byte[] buf = text.getBytes();
		
		fos.write(buf);
		
		doc.close();
		fos.flush();
		fos.close();
		System.out.println("WELL DONE!!!!");
	}
}
