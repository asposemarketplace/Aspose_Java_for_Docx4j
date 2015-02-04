package xlsx4j.workingwithworkbook;

import com.aspose.cells.Workbook;

/**
 * @author Shoaib Khan
 */

public class OpenSaveSpreadSheetAspose
{
	public static void main(String[] args) throws Exception
	{
		//Creating an Workbook object with an Excel file path
		Workbook workbook = new Workbook("data/xlsx4j/pivot.xlsm");
		
		//Saving the Excel file
	    workbook.save("data/xlsx4j/pivot-rtt-Aspose.xlsm");
	    
	    //Print Message
	    System.out.println("Worksheet saved successfully.");
	}
}
