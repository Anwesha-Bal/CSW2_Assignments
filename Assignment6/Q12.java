package Assignment6;

import java.io.File;
import java.io.IOException;

public class Q12 {
	public static void listAll(File dir) {
		File [] files = dir.listFiles();
		if(files!=null) {
			for(File file : files) {
				if(file.isDirectory()) {
					System.out.println(file.getName());
					listAll(file);
				}
				else {
					System.out.println(file.getName());
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directoryPath = "src";
		File directory = new File(directoryPath);
		try {
			if(!directory.exists()) {
				throw new IOException ("Directory doesn't exist");
			}
			listAll(directory);
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
