package Assignment6;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Q11 {
	private static String getCurrentDate() {
		Date date = new Date();
		return new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(date);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner ip = new Scanner(System.in);
				System.out.println("Enter your diary enter: ");
				String entry = ip.nextLine();
				File file = new File("diary.txt");
				try {
					if(file.exists()) {
						System.out.println("The file 'diary.txt' already exists. Existing content will be overwritten. Do you want to append it?(Y/N)");
						String response = ip.nextLine().trim().toUpperCase();
						if(response.equals("Y")||response.equals("YES")) {
							FileWriter writer = new FileWriter(file,true);
							writer.write(getCurrentDate()+"\n"+entry+"\n");
							writer.close();
							System.out.println("Diary was added successfully.");
						}
						else {
							System.out.println("Existing without making any changes");
							return;
						}
					}
					else {
						if(file.createNewFile()) {
							System.out.println("File 'diary.txt' created successfully");
							FileWriter writer = new FileWriter(file,true);
							writer.write(getCurrentDate()+"\n"+entry+"\n");
							writer.close();
							System.out.println("Diary entry added successfully");
						}
						else {
							System.out.println("Failed to create a file "+file);
							return;
						}
					}
				}catch(IOException e) {
					System.out.println("An error occurred while writing to the file: "+e.getMessage());
				}
				finally {
					ip.close();
				}
	}

}
