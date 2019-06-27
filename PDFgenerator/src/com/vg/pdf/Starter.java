package com.vg.pdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

import com.vg.tools.ParsePages;


public class Starter {
	
	public static final String TEXT = "C://Users/�����/Desktop/tu.txt";
	public static final String IMAGE = "C://Users/�����/Desktop/1.gif";
	public static final String DEST = "C://Users/�����/Desktop/wireshark.pdf";
	public static final String DOCS = "C://Users/�����/Desktop/7.docx";
	
	static ConvertWord cw = new ConvertWord();
	static ConvertIMG ci = new ConvertIMG();
	static ParsePages pp = new ParsePages();
	
	public static void main(String[] args) throws IOException {
		
			//cw. PDFconvertor(DOCS, "C://Users/�����/Desktop/Hello.pdf");
			//ci.imageConert(DEST, "C://Users/�����/Desktop/2.jpg");
		
			pp.ParserImage(DEST, "C://Users/�����/Desktop/vasya/");
		
		
	    }
	
	}