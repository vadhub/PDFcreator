package com.vg.pdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.documents4j.api.DocumentType;
import com.documents4j.api.IConverter;
import com.documents4j.job.LocalConverter;

public class ConvertWord {
	 public void PDFconvertor(File inputWord, File outputFile){
	        try  {
	            InputStream docxInputStream = new FileInputStream(inputWord);
	            OutputStream outputStream = new FileOutputStream(outputFile);
	            
	            IConverter converter = LocalConverter.builder().build();
	            
	            converter.convert(docxInputStream).as(DocumentType.DOCX).to(outputStream).as(DocumentType.PDF).execute();
	            outputStream.close();
	            
	            System.out.println("well done");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
