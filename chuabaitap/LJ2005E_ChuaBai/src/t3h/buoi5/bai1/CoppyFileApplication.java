package t3h.buoi5.bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CoppyFileApplication {

	public static void main(String[] args) {
		
		File file = new File("D:\\demo.txt");
		File fileCopy = new File("D:\\demo-copy.txt");
		
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader(file);
			fileWriter = new FileWriter(fileCopy);
			String content = "";
			
			int i;
			boolean charUp = false;
			while((i = fileReader.read()) != -1) {
				System.out.println(i);
				if (charUp) {
					content += String.valueOf((char) i).toUpperCase();
					charUp = false;
				} else {
					content += String.valueOf((char) i);
				}
				if (i == 10) { // check if this character is new line or not
					charUp = true;
				}
			}
			
			content = content.substring(0, 1).toUpperCase() + content.substring(1);
			fileWriter.write(content);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
