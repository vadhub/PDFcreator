package com.vg.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFtest {
	public static void main(String[] args) throws IOException{
		PDDocument doc = PDDocument.load(new File("C://Users/�����/Desktop/Hello.pdf"));
		PDFTextStripper ts = new PDFTextStripper();
		int numbOfPage = doc.getNumberOfPages();
		ts.setStartPage(1);
		ts.setEndPage(numbOfPage);
		
		String text = ts.getText(doc);
		System.out.println(text);
		
		FileOutputStream fos = new FileOutputStream("C://Users/�����/Desktop/Hello.txt");
		
		byte[] buf = text.getBytes();
		
		fos.write(buf);
		
		doc.close();
		fos.flush();
		fos.close();
		System.out.println("WELL DONE!!!!");
	
	}
}
