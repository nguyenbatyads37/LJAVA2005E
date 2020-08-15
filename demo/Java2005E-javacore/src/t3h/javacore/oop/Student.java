package t3h.javacore.oop;

public class Student extends Person {

	// overriding
	@Override
	public void eat() {
		System.out.println("I am eating noodle");
	}
	
	// overloading
	public void study(String book) {
		System.out.println("Reading " + book);
	}
	
	public void study(String book, int drive) {
		System.out.println("I am driving " + drive + " and reading " + book);
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.study("God of war");
		student.study("god of war", 2);
	}
}
