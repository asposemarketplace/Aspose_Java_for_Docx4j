package pptx4j.slide;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;

public class AsposeTraverseSlides
{
	public static void main(String[] args)
	{
		//Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation("data/pptx4j/presentation.pptx");

		//Accessing slides
		for (ISlide slide : pres.getSlides())
		{
			System.out.println(slide.getSlideNumber());			
		}
	}
}
