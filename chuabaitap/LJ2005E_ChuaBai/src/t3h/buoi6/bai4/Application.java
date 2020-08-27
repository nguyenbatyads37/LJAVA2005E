package t3h.buoi6.bai4;

import java.io.IOException;
import java.util.Scanner;

public class Application {
	
	private final static String FILE_PATH = "D:\\student.json";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to our application.");

		StudentManagement studentManagement = new StudentManagement(FILE_PATH);
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("1. Enter new student");
			System.out.println("2. Print all of students");
			System.out.println("3. Enter student id to print");
			System.out.println("0. Enter 0 to exit");
			int input = scanner.nextInt();
			
			switch (input) {
			case 1:
				Student newStudent = new Student();
				System.out.println("Student id: ");
				String id = scanner.next();
				newStudent.setId(Integer.valueOf(id));
				
				System.out.println("Student name: ");
				String name = scanner.next();
				newStudent.setName(name);
				
				System.out.println("Student age: ");
				String age = scanner.next();
				newStudent.setAge(Integer.valueOf(age));
				newStudent.setClasses("LJAVA2005e");
				newStudent.setSubject("Tech");
				try {
					studentManagement.saveNewStudent(newStudent);
				} catch (IOException e) {
					System.out.println("Error when save new student");
				}
				break;
			case 2:
				try {
					studentManagement.printStudents();
				} catch (IOException e) {
					System.out.println("Error when print all students");
				}
				break;
			case 3:
				String idSearch = scanner.next();
				try {
					studentManagement.printStudentById(Integer.valueOf(idSearch));
				} catch (NumberFormatException | IOException e) {
					System.out.println("Error when print student by id");
				}
				break;
			case 0:
				isRunning = false;
				break;
			default:
				break;
			}
		}
	}
}
