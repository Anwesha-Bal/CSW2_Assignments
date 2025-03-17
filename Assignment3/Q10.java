package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;

public class Q10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("Please provide a valid path");
			return;
		}
		String filePathString = args[0];
		File file = new File(filePathString);
		if(!file.exists()) {
			throw new CustomFileNotFoundException1("File not Found Nia "+filePathString);
		}
		try {
			FileReader reader = new FileReader(filePathString);
			System.out.println("Contents: ");
			int charValue;
			while((charValue = reader.read())!= -1) {
				System.out.print((char)charValue);
			}
			reader.close();
		}
		catch (IOException e) {
			// TODO: handle exception
			throw new CustomFileReadPermissionException("Error reading the file: "+e.getMessage());
		}
	}

}
class CustomFileNotFoundException1 extends FileNotFoundException{
	public CustomFileNotFoundException1(String message) {
		super(message);
	}
}
class CustomFileReadPermissionException extends FileNotFoundException{
	public CustomFileReadPermissionException(String message) {
		super(message);
	}
}
