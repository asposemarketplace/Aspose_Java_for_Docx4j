/**
 * Copyright (c) Aspose 2002-2014. All Rights Reserved.
 *
 * LICENSE: This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://opensource.org/licenses/gpl-3.0.html>;.
 *
 * @author  Shoaib Khan
 * 
 * @link	https://asposejavadocx4j.codeplex.com/
 * @link	https://sourceforge.net/projects/asposejavafordocx4j/
 * @link	https://github.com/asposemarketplace/Aspose_Java_for_Docx4j
 * @link    https://bitbucket.org/asposemarketplace/aspose-java-for-docx4j/
 */

package aspose.slides;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;

public class AsposeThumbnail
{
	public static void main(String[] args) throws Exception
	{
		//Instantiate a PresentationEx class that represents the PPTX file
		Presentation pres = new Presentation("data/presentation.pptx");
		
		//Access the first slide
		ISlide sld = pres.getSlides().get_Item(0);
		
		//Create a full scale image
		BufferedImage image = sld.getThumbnail(1f, 1f);
		
		//Save the image to disk in JPEG format
		ImageIO.write(image,"jpeg",new File("data/AsposeThumbnail.jpg"));

        //Printing the status
        System.out.println("Thumbnail created successfully!");
	}
}
