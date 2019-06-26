package com.vg.pdf;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;

public class ConvertIMG {
	
	public void Image(String dest, String image) throws MalformedURLException, IOException, DocumentException{
		Document document = new Document();
		File file = new File(dest);
		
        file.getParentFile().mkdirs();
        
        Image img = Image.getInstance(image);
        
        img.scaleAbsolute(400f, 400f);
        //img.setAbsolutePosition(200f, 400f);
        
        document.open();
        
        document.add(img);
        
        document.close();
		
	}

}
