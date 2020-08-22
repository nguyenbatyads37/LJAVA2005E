package t3h.javacore.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterApplication {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\fileReaderWriter.txt");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("this is file content");
		fileWriter.flush();
		fileWriter.close();
		
		FileReader fileReader = new FileReader(file);
		int i;
		while ((i = fileReader.read()) != -1) {
			System.out.print((char)i);
		}
		fileReader.close();
	}
}
