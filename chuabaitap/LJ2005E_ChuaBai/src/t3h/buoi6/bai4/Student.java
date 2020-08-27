package t3h.buoi6.bai4;

public class Student {

	private int id;
	private String name;
	private int age;
	private String classes;
	private String subject;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Student(int id, String name, int age, String classes, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.classes = classes;
		this.subject = subject;
	}
	
	public Student() {};
}
