package Assignment6;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the source file path: ");
		String srcFilePath = ip.nextLine();
		System.out.print("Enter the destination file path: ");
		String destFilePath = ip.nextLine();
		File srcFile = new File(srcFilePath);
		File destFile = new File(destFilePath);
		if(!srcFile.exists()||!srcFile.isFile()) {
			System.out.println("Source file doesnot exist or not valid file");
			return;
		}
		if(destFile.exists()) {
			System.out.println("Destination file already exist. Overwrite? (yes/no)");
			String overwrite = ip.nextLine();
			if(!overwrite.equalsIgnoreCase("yes")) {
				System.out.println("File copy cancelled");
				return;
			}
		}
		try (FileReader in = new FileReader(srcFile);
			FileWriter out = new FileWriter(destFile)){
			int c;
			while((c=in.read())!=-1) {
				out.write(c);
			}
				System.out.println("File content copied successfully");
		}
		catch(IOException e) {
			System.err.println("Error occurred while copying file content"+e.getMessage());
		}
	}

}
