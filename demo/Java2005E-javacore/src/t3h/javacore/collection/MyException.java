package t3h.javacore.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyException {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("C:\\test\\a.txt"); 
	        BufferedReader fileInput = new BufferedReader(file);
		} catch (Exception ex) {
			System.out.println("File is not found! " + ex.getMessage());
		}
		
		MyException myException = new MyException();
		try {
			myException.validate();
		} catch (ValidateException e) {
			System.out.println(e.getCode() + ": " + e.getMessage());
		}
		
	}
	
	public void validate() throws ValidateException{
		String filePath = "C:\\test\\a123.txt";
		File file = new File(filePath);
		if (!file.exists()) {
			throw new ValidateException("404", "File not found!");
		}
	}
}

class ValidateException extends Exception {
	private String code;
	private String message;
	
	public ValidateException(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
