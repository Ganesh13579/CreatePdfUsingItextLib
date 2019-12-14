package com.pdf.converting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePdfFile {
	public void generateTable() {
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream("student.pdf"));
			document.open();
			PdfPTable table = new PdfPTable(3);
			table.setWidthPercentage(100);
			PdfPCell c1 = new PdfPCell();
			c1.addElement(new Paragraph("StudentId"));
			table.addCell(c1);
			PdfPCell c2 = new PdfPCell();
			c2.addElement(new Paragraph("StudentName"));
			table.addCell(c2);
			PdfPCell c3 = new PdfPCell();
			c3.addElement(new Paragraph("CollegeName"));
			table.addCell(c3);
			ArrayList<Student> list = StudentDbmaintaining.listObjects();
			for (Student stu : list) {
				PdfPCell c4 = new PdfPCell();
				c4.addElement(new Paragraph(Integer.toString(stu.getStuId())));
				table.addCell(c4);
				PdfPCell c5 = new PdfPCell();
				c5.addElement(new Paragraph(stu.getStuName()));
				table.addCell(c5);
//				PdfPCell c6 = new PdfPCell();
//				c6.addElement(new Paragraph(Student.getCollegeName()));
//				table.addCell(c6);
				table.addCell(new PdfPCell(new Paragraph(Student.getCollegeName())));
			}
			
			document.add(table);
			document.close();

		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
