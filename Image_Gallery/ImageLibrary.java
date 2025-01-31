package Image_Gallery;
import java.util.*;
public class ImageLibrary {
	ArrayList<image> arr = new ArrayList<>();
	public void insert(image m) {
		arr.add(m);
	}
	public image search(String k) {
		for(image img: arr) {
			if(img.getColour().equalsIgnoreCase(k)) {
				System.out.println(img.toString());
				return img;
			}
		}
		return null;
	}
	public void display() {
		if(arr.isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		for(image p:arr) {
			System.out.println(p.toString());
		}
	}
}
