package com.vg.tools;

import java.io.IOException;

import org.apache.pdfbox.text.PDFTextStripper;

import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;

public class TextLayoutS extends PdfDocument{
	@Override
	public void saveToFile(String filename, FileFormat fileFormat) {
		
		super.saveToFile(filename, fileFormat);
	}
	
}
