package xlsx4j.workingwithworksheet;

import com.aspose.cells.Picture;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.WorksheetCollection;

/**
 * @author Shoaib Khan
 */
public class AddImageAspose
{
	public static void main(String[] args) throws Exception
	{
		//Instantiating a Workbook object
		Workbook workbook = new Workbook();

		Worksheet sheet = workbook.getWorksheets().get(0);

		//Adding a picture at the location of a cell whose row and column indices
		//are 5 in the worksheet. It is "F6" cell
		int pictureIndex = sheet.getPictures().add(5,5,"data/xlsx4j/greentick.png");
		Picture picture = sheet.getPictures().get(pictureIndex);

		//Saving the Excel file
		workbook.save("data/xlsx4j/AddImage-Aspose.xlsx",SaveFormat.XLSX);
		
		//Print Message
	    System.out.println("Image added successfully.");
	}
}
