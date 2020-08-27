package t3h.buoi4.bai1;

public class Student implements Comparable<Student>{

	private int studentId;
	private String name;
	private int age;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student(int studentId, String name, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Student newStudent) {
		return this.getStudentId() - newStudent.getStudentId();
	}
}
