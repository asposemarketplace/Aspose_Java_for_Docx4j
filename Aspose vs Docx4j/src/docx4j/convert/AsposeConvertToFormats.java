package docx4j.convert;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;

public class AsposeConvertToFormats
{
	public static void main(String[] args) throws Exception
	{
		// Load the document from disk.
		Document doc = new Document("data/docx4j/document.doc");
		
		doc.save("data/docx4j/html/Aspose_DocToHTML.html",SaveFormat.HTML); //Save the document in HTML format.
		doc.save("data/docx4j/Aspose_DocToPDF.pdf",SaveFormat.PDF); //Save the document in PDF format.
		doc.save("data/docx4j/Aspose_DocToTxt.txt",SaveFormat.TEXT); //Save the document in TXT format.
		doc.save("data/docx4j/Aspose_DocToJPG.jpg",SaveFormat.JPEG); //Save the document in JPEG format.
        
        System.out.println("Aspose - Doc file converted in specified formats");
	}
}
