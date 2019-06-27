package com.vg.tools;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

import com.vg.pdf.ReconverterIMG;

public class ParsePages {
	private static	ReconverterIMG rec = new ReconverterIMG();
	public void ParserImage(String dest, String passOutput) throws IOException{
		int i = 0;
		PDDocument doc = PDDocument.load(new File(dest));
		while(i<doc.getNumberOfPages()){
				rec.reconvertor(dest, passOutput +i+".jpg", i);
				i++;
		}
		
	}
}
