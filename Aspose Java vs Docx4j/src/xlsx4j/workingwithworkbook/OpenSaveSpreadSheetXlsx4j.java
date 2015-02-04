/**
 * NOTICE: ORIGINAL FILE MODIFIED
 */

package xlsx4j.workingwithworkbook;

import org.docx4j.openpackaging.io.SaveToZipFile;
import org.docx4j.openpackaging.packages.OpcPackage;

public class OpenSaveSpreadSheetXlsx4j
{
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		String inputfilepath  = "data/xlsx4j/pivot.xlsm";
		
		boolean save = true;
		String outputfilepath = "data/xlsx4j/pivot-rtt-xlsx4j.xlsm";
				
		// Open a document from the file system
		// 1. Load the Package
		OpcPackage pkg = OpcPackage.load(new java.io.File(inputfilepath));
		
		// Save it
		
		if (save) {		
			SaveToZipFile saver = new SaveToZipFile(pkg);
			saver.save(outputfilepath);
		}
	}
}
