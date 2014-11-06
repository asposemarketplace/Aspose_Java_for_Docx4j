package asposefeatures.datahandling.calculatesubtotals.java;

import com.aspose.cells.CellArea;
import com.aspose.cells.Cells;
import com.aspose.cells.ConsolidationFunction;
import com.aspose.cells.Workbook;

public class AsposeCalculateSubTotals
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/asposefeatures/datahandling/calculatesubtotals/data/";
		//Instantiate a new workbook
		Workbook workbook = new Workbook(dataPath + "book1.xls");
		
		//Get the Cells collection in the first worksheet
		Cells cells = workbook.getWorksheets().get(0).getCells();
		
		//Create a cellarea i.e.., B3:C19
		CellArea ca = new CellArea();
		ca.StartRow = 2;
		ca.StartColumn =1;
		ca.EndRow = 18;
		ca.EndColumn = 2;
		
		//Apply subtotal, the consolidation function is Sum and it will applied to
		//Second column (C) in the list
		cells.subtotal(ca, 0, ConsolidationFunction.SUM, new int[] { 1 });
		
		//Save the excel file
		workbook.save(dataPath + "AsposeTotal_Out.xls");
		
		// Print message
		System.out.println("Process completed successfully");
	}
}
