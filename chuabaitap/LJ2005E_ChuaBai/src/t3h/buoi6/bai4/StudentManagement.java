package t3h.buoi6.bai4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class StudentManagement {
	
	private File studentFile;
	private List<Student> listStudent;
	
	public StudentManagement(String pathFile) {
		this.studentFile = new File(pathFile);
		if (!this.studentFile.exists()) {
			try {
				studentFile.createNewFile();
			} catch (IOException e) {
				System.out.println("Error when creating student file: " + pathFile);
			}
		}
		this.listStudent = new ArrayList<Student>();
		try {
			jsonArrToListStudent(getListStudent(), this.listStudent);
		} catch (IOException e) {
			System.out.println("Error when converting student json array to student list");
		}
	}
	
	public void saveListStudent() throws IOException {
		String jsonStr = JSON.toJSONString(listStudent);
		FileOutputStream studentFos = new FileOutputStream(this.studentFile);
		studentFos.write(jsonStr.getBytes());
		studentFos.flush();
		studentFos.close();
	}
	
	public JSONArray getListStudent() throws IOException {
		String result = "";
		int i;
		FileInputStream studentFis = new FileInputStream(this.studentFile);
		while((i = studentFis.read()) != -1) {
			result += (char) i;
		}
		studentFis.close();
		if (result.isEmpty()) {
			return new JSONArray();
		}
		return JSONArray.parseArray(result);
	}
	
	public void saveNewStudent(Student student) throws IOException {
		listStudent.add(student);
		saveListStudent();
	}
	
	public void printStudentById(int id) throws IOException {
		JSONArray arrayStudent = getListStudent();
		for(int i = 0; i < arrayStudent.size(); i++) {
			JSONObject student = (JSONObject)arrayStudent.get(i);
			if (student.getString("id").equals(String.valueOf(id))) {
				System.out.println("Student id: " + student.getString("id"));
				System.out.println("Student name: " + student.getString("name"));
				System.out.println("Student age: " + student.getString("age"));
			}
		}
	}
	
	public void printStudents() throws IOException {
		JSONArray arrayStudent = getListStudent();
		for(int i = 0; i < arrayStudent.size(); i++) {
			JSONObject student = (JSONObject)arrayStudent.get(i);
			System.out.println("Student id: " + student.getString("id"));
			System.out.println("Student name: " + student.getString("name"));
			System.out.println("Student age: " + student.getString("age"));
		}
	}
	
	private void jsonArrToListStudent(JSONArray jsonArray, List<Student> list) {
		for(int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			Student student = new Student();
			student.setId(jsonObject.getIntValue("id"));
			student.setName(jsonObject.getString("name"));
			student.setAge(jsonObject.getIntValue("age"));
			student.setClasses(jsonObject.getString("classes"));
			student.setSubject(jsonObject.getString("subject"));
			list.add(student);
		}
	}
}
