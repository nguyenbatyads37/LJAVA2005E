package t3h.javacore.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamApplication {

	public static void main(String[] args) {
		File demoOutputStream = new File("D:\\demoOutputStream.txt");
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream(demoOutputStream);
			bos = new BufferedOutputStream(fos);
			bos.write("this is the content".getBytes());
			bos.flush();
			
			fis = new FileInputStream(demoOutputStream);
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				fis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
