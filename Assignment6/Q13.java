package Assignment6;
import java.io.File;
import java.util.Scanner;
public class Q13 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the name of the file to deleted: ");
		String fileName = ip.nextLine();
		File fileToDelete = new File(fileName);
		if(fileToDelete.exists()) {
			if(fileToDelete.delete()) {
				System.out.println("File deleted successfully "+fileName);
			}
			else {
				System.out.println("Unable to delete the file "+fileName);
			}
		}
		else {
			System.out.println("File does not exist: "+fileName);
		}
		ip.close();
	}
}