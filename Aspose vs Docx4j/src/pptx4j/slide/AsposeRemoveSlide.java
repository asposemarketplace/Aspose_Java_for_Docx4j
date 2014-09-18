package pptx4j.slide;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeRemoveSlide
{
	public static void main(String[] args)
	{
        //Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation("data/pptx4j/presentation.pptx");

		//Accessing a slide using its index in the slides collection
		ISlide slide = pres.getSlides().get_Item(1);

		//Removing a slide using its reference
		pres.getSlides().remove(slide);
		
		//Removing a slide using its slide index
		pres.getSlides().removeAt(0);

		//Writing the presentation file
		pres.save("data/pptx4j/RemovedSlide-Aspose.pptx",SaveFormat.Pptx);

        //Printing the status
        System.out.println("Slides removed successfully!");
	}
}
