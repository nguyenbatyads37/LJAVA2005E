package t3h.buoi3;

public class Application {

	public static void main(String[] args) {
		Student student = new Student();
		
		Student student1 = new Student();
		student1.name = "Quynh";
		student1.age = 20;
		student1.school = "Dai Hoc Cong Nghiep";
		student1.subject = "CNTT";
		
		System.out.println(student.convert(student1));
	}
}
