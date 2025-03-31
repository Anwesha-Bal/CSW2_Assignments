package Assignment6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		String fileName = ip.nextLine();
		File file = new File(fileName);
		try {
			if(!file.exists()) {
				throw new FileNotFoundException("File not found: "+fileName);
			}
			System.out.println("File metadata: ");
			System.out.println("Name: "+file.getName());
			System.out.println("Path: "+file.getPath());
			System.out.println("Absolute path: "+file.getAbsolutePath());
			System.out.println("Parent: "+file.getParent());
			System.out.println("Exists: "+file.exists());
			System.out.println("Is File: "+file.isFile());
			System.out.println("Is directory: "+file.isDirectory());
			System.out.println("Is hidden: "+file.isHidden());
			System.out.println("Length: "+file.length()+" bytes.");
			Date lastModifieDate = new Date(file.lastModified());
			DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("Last modified: "+dateformat.format(lastModifieDate));
			System.out.println("Readable : "+Files.isReadable(Paths.get(file.getPath())));
			System.out.println("Writable : "+Files.isWritable(Paths.get(file.getPath())));
			System.out.println("Executable : "+Files.isExecutable(Paths.get(file.getPath())));
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
