package com.vg.pdf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Starter {
	
	public static final String TEXT = "C://Users/Вадим/Desktop/tu.txt";
	public static final String IMAGE = "C://Users/Вадим/Desktop/1.gif";
	public static final String DEST = "C://Users/Вадим/Desktop/HelloWorld.pdf";
	public static final String DOCS = "C://Users/Вадим/Desktop/project.docx";
	
	static ConvertWord cw = new ConvertWord();
	

	public static void main(String[] args) throws IOException {
		
		cw. PDFconvertor(new File(DOCS), new File("C://Users/Вадим/Desktop/Hello.pdf"));
		
		Document document = new Document();
		File file = new File(DEST);
		
        file.getParentFile().mkdirs();
	      try
	      {
	        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(DEST));
	        BufferedReader br = new BufferedReader(new FileReader(TEXT));
	        
	        document.open();
	        Paragraph p;
	        
	        String strLine;
	        	   while ((strLine = br.readLine()) != null){	        		   
	                   p = new Paragraph(strLine);
	                   document.add(p);
	        	   }
	         document.close();
	         
	         System.out.println("pdf file created");
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
	    }	        
	
	}
	
	