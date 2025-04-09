package extraQuestion;
import java.io.File;
import java.util.*;
public class GetFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directory = "src";
		File f = new File(directory);
		if(f.exists()) {
			System.out.println("The file exist");
			
		}
	}

}
