package com.itheima.test1;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author ZayneChen
 * @date 2022年07月09日 8:30
 */
public class ItextTest {

    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("D:\\test.pdf"));
            document.open();
            document.add(new Paragraph("hello itext"));
            document.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

}
