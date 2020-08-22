package t3h.javacore.file;

import java.io.File;
import java.io.IOException;

public class FileAppication {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\demoFile.txt");
		file.createNewFile();
		System.out.println("is demoFile exists: " + file.exists());
		System.out.println("demoFile is a file?: " + file.isFile());
		System.out.println("demoFile is a directory?: " + file.isDirectory());
		
		file.setExecutable(true);
		file.setReadable(true);
		file.setWritable(true);
		System.out.println("demoFile can execute?: " + file.canExecute());
		System.out.println("demoFile can read?: " + file.canRead());
		System.out.println("demoFile can write?: " + file.canWrite());
		
		System.out.println("File absolute path: " + file.getAbsolutePath());
		System.out.println("File path: " + file.getPath());
		System.out.println("File name: " + file.getName());
		
		file.renameTo(new File("D:\\rename.txt"));
		
		//file.delete();
		
		File directory = new File("D:\\demo");
		directory.mkdir();
		System.out.println("List file: " + directory.listFiles()[0].getName());
		//directory.deleteOnExit();
	}

}
