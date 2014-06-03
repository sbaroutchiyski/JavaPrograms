import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Deck_of_Cards {

	public static void main(String[] args) throws FileNotFoundException {

		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		String[] suits = { "\u2660", "\u2663", "\u2665", "\u2666" };
		String[] deck = new String[56];
		int count = 0;
		int cardNumber = 0;
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				deck[cardNumber] = cards[j] + " " + suits[i];
				cardNumber++;
			}
		}
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(
					"Deck_of_Cards.pdf"));
			document.open();
			BaseFont basefont = BaseFont.createFont(
					"D:\\JavaProjects\\Intro-Java-Homework\\times.ttf",
					BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
			Font fontRed = new Font(basefont, 18f, Font.NORMAL, new BaseColor(
					255, 0, 0));
			Font fontBlack = new Font(basefont, 18f, Font.NORMAL,
					new BaseColor(0, 0, 0));
			for (int j = 0; j < 8; j++) {
				PdfPTable table = new PdfPTable(13);
				table.setWidthPercentage(100f);
				for (int i = 0; i < 13; i++) {

					if (i % 2 == 0 && count < 52) {
						if (count < 26) {
							PdfPCell cell1 = new PdfPCell(new Paragraph(
									deck[count], fontBlack));
							cell1.setFixedHeight(60);
							cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
							cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
							table.addCell(cell1);
						} else {
							PdfPCell cell1 = new PdfPCell(new Paragraph(
									deck[count], fontRed));
							cell1.setFixedHeight(60);
							cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
							cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
							table.addCell(cell1);
						}

						count++;
					} else {
						PdfPCell cell2 = new PdfPCell(new Paragraph(" "));
						cell2.setBorder(Rectangle.NO_BORDER);
						cell2.setFixedHeight(60);
						table.addCell(cell2);
					}

				}

				Paragraph par = new Paragraph(" ");
				document.add(table);
				document.add(par);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		document.close();
		for (String temp : deck) {
			System.out.println(temp);
		}
	}
}
