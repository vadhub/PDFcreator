package com.vg.pdf;

import java.io.File;


import java.io.IOException;

public class Starter {
	
	public static final String TEXT = "C://Users/�����/Desktop/tu.txt";
	public static final String IMAGE = "C://Users/�����/Desktop/1.gif";
	public static final String DEST = "C://Users/�����/Desktop/HelloWorld.pdf";
	public static final String DOCS = "C://Users/�����/Desktop/project.docx";
	
	static ConvertWord cw = new ConvertWord();
	

	public static void main(String[] args) throws IOException {
		
		cw. PDFconvertor(new File(DOCS), new File("C://Users/�����/Desktop/Hello.pdf"));
	    }	        
	
	}
	
	