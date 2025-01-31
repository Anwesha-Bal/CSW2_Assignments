package Image_Gallery;
import java.util.*;
public class ImageController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		image img = new image();
		img.setHeight(20.0);
		img.setWidth(20.0);
		img.setColorCode("p");
		image img2 = new image(100.0,100.0,"y");
		ImageLibrary library = new ImageLibrary();
		library.insert(img);
		library.insert(img2);
		library.display();
		System.out.println();
		System.out.println();
		String k = "q";
		if(library.search(k)==null) {
			System.out.println("Image not found");
		}
	}

}
