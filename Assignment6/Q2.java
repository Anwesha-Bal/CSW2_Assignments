package Assignment6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("diary.text"); 
		try {
			if(!file.exists()) {
				throw new FileNotFoundException("File not found in the system");  
			}
			else {
				FileReader reader = new FileReader(file);
				int character;
				System.out.println("Diary Enteries: ");
				while((character = reader.read())!=-1) {
					System.out.print((char)character);
				}
			}
		}catch(FileNotFoundException e) {
			System.err.println("Error: File not found"+e.getMessage());
		}
		catch(IOException e) {
			System.err.println("An error occurred while reading the file: "+e.getMessage());
		}
	}

}
