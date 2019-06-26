package com.vg.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class ConvertIMG {
	
	public void imageConert(String dest, String image) throws MalformedURLException, IOException, DocumentException{
		Document document = new Document();
		
		PdfWriter odf = PdfWriter.getInstance(document, new FileOutputStream(new File(dest)));
		odf.open();
        
        Image img = Image.getInstance(image);
        
        img.scaleAbsolute(500, 700);
        
        document.open();
        
        document.add(img);
        
        document.close();
        
        System.out.println("Well done!");
		
	}

}
