package com.vg.pdf;

import java.io.IOException;

import com.vg.repdf.ReconvertOnlyText;
import com.vg.repdf.ReconvertToDocx;
import com.vg.tools.ParsePages;


public class Starter {
	
	public static final String TEXT = "C://Users/Вадим/Desktop/tu.txt";
	public static final String IMAGE = "C://Users/Вадим/Desktop/1.gif";
	public static final String DEST = "C://Users/Вадим/Desktop/.pdf";
	public static final String DOCS = "C://Users/Вадим/Desktop/2.docx";
	
	static ConvertWord cw = new ConvertWord();
	static ConvertIMG ci = new ConvertIMG();
	static ParsePages pp = new ParsePages();
	static ReconvertOnlyText rot = new ReconvertOnlyText();
	static ReconvertToDocx rtd = new ReconvertToDocx();
	
	public static void main(String[] args) throws IOException {
		
			
			//cw. PDFconvertor(DOCS, "C://Users/Вадим/Desktop/Hello.pdf");
			//ci.imageConert(DEST, "C://Users/Вадим/Desktop/2.jpg"); Габдерахманов В.М. - проект
			//rot.reconvert("C://Users/Вадим/Desktop/Hello.pdf", "C://Users/Вадим/Desktop/vasya/test.txt");
			rtd.convert("C://Users/Вадим/Desktop/Габдерахманов В.М. - проект.pdf", "C://Users/Вадим/Desktop/vasya/texs.docx");
			//pp.ParserImage(DEST, "C://Users/Вадим/Desktop/vasya/");
	    }
	
	}