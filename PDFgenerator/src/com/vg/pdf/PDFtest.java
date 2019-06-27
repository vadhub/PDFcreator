package com.vg.pdf;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class PDFtest {
	public static void main(String[] args) throws IOException{
		PDDocument doc = PDDocument.load(new File("C://Users/�����/Desktop/wireshark.pdf"));
		PDPageTree list = doc.getPages();
		
		for(PDPage page : list){
			PDResources pdr = page.getResources();
			int i = 1;
			for(COSName name : pdr.getXObjectNames()){
				PDXObject pdxo =  pdr.getXObject(name);
				if(pdxo instanceof PDImageXObject){
					PDImageXObject im =(PDImageXObject) pdxo;
					String fileinput = "C://Users/�����/Desktop/vasya/"+i+".jpg";
					ImageIO.write(im.getImage(), "jpg", new File("C://Users/�����/Desktop/wireshark.pdf"));
					i++;
					System.out.println("well done");
				}
			}
		}
		
		System.out.println("WELL DONE!!!!");
	
	}
}
