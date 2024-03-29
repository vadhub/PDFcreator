package com.vg.pdf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ConvertTXT {
	public void Covert(String dest, String text) throws DocumentException, IOException{
		Document document = new Document();
		File file = new File(dest);
		
        file.getParentFile().mkdirs();
        
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(dest));
        BufferedReader br = new BufferedReader(new FileReader(text));
        
        document.open();
        Paragraph p;
        
        String strLine;
        
        while ((strLine = br.readLine()) != null){
        	p = new Paragraph(strLine);
             document.add(p);
        }
         document.close();
         
         System.out.println("pdf file created");
	}
}