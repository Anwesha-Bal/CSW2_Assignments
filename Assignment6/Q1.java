package Assignment6;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Q1 {
	private static String getCurrentDateTime() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your diary entry ");
		String entry = ip.nextLine();
		File file = new File("diary.text");
		try {
			if(file.exists()) {
				throw new IOException("Error: The file 'diary.txt' already exists. Existing to prevent overwrite");
			}
			else {
				if(file.createNewFile()) {
					System.out.println("File 'diary.txt' created successfully");
					try (FileWriter writer = new FileWriter (file,true)) {
						writer.write(getCurrentDateTime()+"\n"+entry+"\n");
						System.out.println("Diary Entry Added Successfully");
						}
					}
				else {
					System.out.println("Failed to create file "+file);
					return;
				}
			}
		}
		catch(IOException e) {
			System.err.println("An error occurred while writing to the file: "+e.getMessage());
		}
		finally {
			ip.close();
		}
	}

}
