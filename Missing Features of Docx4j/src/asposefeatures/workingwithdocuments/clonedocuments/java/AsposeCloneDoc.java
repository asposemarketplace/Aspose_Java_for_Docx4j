/**
 * Copyright (c) Aspose 2002-2014. All Rights Reserved.
 */

package asposefeatures.workingwithdocuments.clonedocuments.java;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;

public class AsposeCloneDoc
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/asposefeatures/workingwithdocuments/clonedocuments/data/";
		
		Document doc = new Document(dataPath + "document.doc");
		Document clone = doc.deepClone();
		clone.save(dataPath + "AsposeClone.doc", SaveFormat.DOC);
	}
}
