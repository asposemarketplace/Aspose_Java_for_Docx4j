package docx4j.bookmark;

import com.aspose.words.Bookmark;
import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.SaveFormat;

public class AsposeBookmarksDelete
{
	// See more @ http://www.aspose.com/docs/display/wordsjava/Bookmarks+in+Aspose.Words
	
	public static void main(String[] args) throws Exception
	{
		Document doc = new Document("data/docx4j/Aspose_Bookmark.doc");

		// By name.
		Bookmark bookmark = doc.getRange().getBookmarks().get("AsposeBookmark");
		bookmark.remove();
		
		doc.save("data/docx4j/Aspose_BookmarkDeleted.doc", SaveFormat.DOC);
		System.out.println("Done.");
	}
}
