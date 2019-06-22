package com.vg.pdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Future;

import com.documents4j.api.DocumentType;
import com.documents4j.api.IConverter;
import com.documents4j.job.LocalConverter;

public class Reconverter {
	 public void reconvertor(String inputWord, String outputFile){
	        try {
	            InputStream docxInputStream = new FileInputStream(new File(inputWord));
	            OutputStream outputStream = new FileOutputStream(new File(outputFile));
	            
	            IConverter converter = LocalConverter.make();
	            Future<Boolean> convert = converter.convert(docxInputStream).as(DocumentType.PDF).to(outputStream).as(DocumentType.DOCX).schedule();
	            
	            outputStream.close();
	            
	            System.out.println("well done");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
