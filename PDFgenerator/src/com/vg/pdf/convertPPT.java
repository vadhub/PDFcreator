package com.vg.pdf;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class convertPPT {
	public void PDFconvertor(String inputWord, String outputFile, String fileType) throws DocumentException, IOException{
		
		 	FileInputStream inputStream = new FileInputStream(inputWord);
		    double zoom = 4;
		    //increase quality image to 2 
		    AffineTransform at = new AffineTransform();
		    at.setToScale(zoom, zoom);
		    
		    //create document
		    Document pdfDocument = new Document();
		    
		    //write to outputfile
		    PdfWriter pdfWriter = PdfWriter.getInstance(pdfDocument, new FileOutputStream(outputFile));
		    //
		    PdfPTable table = new PdfPTable(1);
		    pdfWriter.open();
		    pdfDocument.open();
		    Dimension pgsize = null;
		    Image slideImage = null;
		    BufferedImage img = null;
		    
		    if (fileType.equalsIgnoreCase(".pptx")) {
		        XMLSlideShow ppt = new XMLSlideShow(inputStream);
		        pgsize = ppt.getPageSize();
		        List<XSLFSlide> slide = ppt.getSlides();
		        pdfDocument.setPageSize(new Rectangle((float) pgsize.getWidth(), (float) pgsize.getHeight()));
		        pdfWriter.open();
		        pdfDocument.open();
		        for (int i = 0; i < slide.size(); i++) {
		            img = new BufferedImage((int) Math.ceil(pgsize.width * zoom), (int) Math.ceil(pgsize.height * zoom), BufferedImage.TYPE_INT_RGB);
		            Graphics2D graphics = img.createGraphics();
		            graphics.setTransform(at);

		            graphics.setPaint(Color.white);
		            graphics.fill(new Rectangle2D.Float(0, 0, pgsize.width, pgsize.height));
		            slide.get(i).draw(graphics);
		            graphics.getPaint();
		            slideImage = Image.getInstance(img, null);
		            table.addCell(new PdfPCell(slideImage, true));
		        }
		    }
		    pdfDocument.add(table);
		    pdfDocument.close();
		    pdfWriter.close();		    
            
        System.out.println("well done");
    }
}
