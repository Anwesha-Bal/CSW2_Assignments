package Assignment6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		try {
			System.out.print("Enter the current name of the file: ");
			String currentFileName = ip.nextLine().trim();
			File oldFile = new File(currentFileName);
			if(!oldFile.exists()) {
				throw new FileNotFoundException("Error: The file "+currentFileName+" does'nt exist");
			}
			System.out.print("Enter the new file name: ");
			String newFileName = ip.nextLine().trim();
			File newFile = new File(newFileName);
			if(newFile.exists()) {
				throw new IOException("Error: A file with the name"+newFileName+" already exists"); 
			}
			if(oldFile.renameTo(newFile)) {
				System.out.print("File renamed from "+currentFileName+" to "+newFileName+" . ");
			}
			else {
				throw new IOException("Unable to rename");
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
