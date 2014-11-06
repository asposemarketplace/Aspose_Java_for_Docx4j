package asposefeatures.converter.converttoformats.java;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

public class AsposeConverter
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/asposefeatures/converter/converttoformats/data/";
		Workbook workbook = new Workbook(dataPath + "workbook.xls");
		
		//Save the document in PDF format
		workbook.save(dataPath + "AsposeConvert_Out.pdf", SaveFormat.PDF);

        // Print message
        System.out.println("Excel to PDF conversion performed successfully.");
	}
}
