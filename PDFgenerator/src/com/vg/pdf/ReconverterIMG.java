package com.vg.pdf;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

public class ReconverterIMG {
	 public void reconvertor(String inputWord, String outputFile, int page) throws IOException{
		 File f = new File(inputWord);
		 PDDocument doc = PDDocument.load(f);
		 
		 PDFRenderer ren = new PDFRenderer(doc);
		 
		 BufferedImage im = ren.renderImage(page);
		 ImageIO.write(im, "JPEG", new File(outputFile));
		 
		 System.out.println("well done");
		 
		 
	 }
}