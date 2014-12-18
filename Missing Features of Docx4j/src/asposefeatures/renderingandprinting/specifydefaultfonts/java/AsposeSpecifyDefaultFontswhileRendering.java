package asposefeatures.renderingandprinting.specifydefaultfonts.java;

import com.aspose.words.Document;
import com.aspose.words.FontSettings;

public class AsposeSpecifyDefaultFontswhileRendering
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/asposefeatures/renderingandprinting/specifydefaultfonts/data/";
		
		Document doc = new Document(dataPath + "document.doc");
		
		// If the default font defined here cannot be found during rendering then the closest font on the machine is used instead.
		FontSettings.setDefaultFontName("Arial Unicode MS");
		
		// Now the set default font is used in place of any missing fonts during any rendering calls.
		doc.save(dataPath + "Rendering.SetDefaultFont_Out.pdf");
		doc.save(dataPath + "Rendering.SetDefaultFont_Out.xps");
		
		System.out.println("Process Completed Successfully");
	}
}
