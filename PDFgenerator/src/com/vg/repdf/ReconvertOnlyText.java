package com.vg.repdf;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReconvertOnlyText {

	public void reconvert(String input, String output) throws IOException{
		File f = new File(input);
		String pars;
		PDFParser parser= new PDFParser(new RandomAccessFile(f, "r"));
		parser.parse();
		
		COSDocument cosdoc = parser.getDocument();
		PDFTextStripper ts = new PDFTextStripper();
		PDDocument doc = new PDDocument(cosdoc);
		pars = ts.getText(doc);
		
		PrintWriter pw = new PrintWriter(output);
		pw.print(pars);
		pw.close();
		System.out.println("WELL DONE!!!!");
	}
}
