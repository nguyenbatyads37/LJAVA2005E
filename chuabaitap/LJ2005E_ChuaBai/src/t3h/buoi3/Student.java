package t3h.buoi3;

public class Student {
	public String name;
	public int age;
	public String subject;
	public String school;
	
	public Student(String name, int age, String subject, String school) {
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.school = school;
	}
	
	public Student() {}

	public String convert(Student student) {
		StringBuilder strJson = new StringBuilder();
		strJson.append("{\n\t" + '"' + "Student" + '"' + " : {\n\t\t")
			.append('"' + "name" + '"' + " : " + '"' + student.name + '"' + ",\n\t\t")
			.append('"' + "age" + '"' + " : " + '"' + student.age + '"' + ",\n\t\t")
			.append('"' + "subject" + '"' + " : " + '"' + student.subject + '"' + ",\n\t\t")
			.append('"' + "school" + '"' + " : " + '"' + student.school + '"' + "\n\t\t")
			.append("}\n}");
		return strJson.toString();
	}
}
