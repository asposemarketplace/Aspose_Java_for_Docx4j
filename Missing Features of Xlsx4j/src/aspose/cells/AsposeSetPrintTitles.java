package aspose.cells;

import com.aspose.cells.FileFormatType;
import com.aspose.cells.PageSetup;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.WorksheetCollection;

public class AsposeSetPrintTitles
{
	public static void main(String[] args) throws Exception
	{
		//Instantiating a Workbook object
		Workbook workbook = new Workbook();
		
		//Accessing the first worksheet in the Workbook file
		WorksheetCollection worksheets = workbook.getWorksheets();
		Worksheet sheet = worksheets.get(0);
		
		//Obtaining the reference of the PageSetup of the worksheet
		PageSetup pageSetup = sheet.getPageSetup();     
		
		//Defining column numbers A & B as title columns
		pageSetup.setPrintTitleColumns("$A:$B");
		
		//Defining row numbers 1 & 2 as title rows
		pageSetup.setPrintTitleRows("$1:$2");
		
		// Workbooks can be saved in many formats
		workbook.save("data/AsposePrintTitles.xlsx", FileFormatType.XLSX);

		System.out.println("Print Titles Set successfully."); // Print Message
	}
}
