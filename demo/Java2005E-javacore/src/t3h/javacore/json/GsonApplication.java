package t3h.javacore.json;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.Gson;

public class GsonApplication {

	public static void main(String[] args) {
		Gson gson = new Gson();
		
		// Convert object to json string
		Student student = new Student(10, "Nguyen Van A");
		String studentJsonStr = gson.toJson(student);
		System.out.println(studentJsonStr);
		
		// Convert json string to object
		String studentStr = "{\"id\":43,\"name\":\"Nguyen Van B\"}";
		Student studentConverted = gson.fromJson(studentStr, Student.class);
		System.out.println("Name: " + studentConverted.getName());
	}
}

class Student {
	private int id;
	
	
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@JSONField(name = "studentName")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
