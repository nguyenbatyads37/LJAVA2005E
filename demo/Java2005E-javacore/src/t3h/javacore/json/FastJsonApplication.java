package t3h.javacore.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class FastJsonApplication {

	public static void main(String[] args) {
		
		// convert string to object
		String studentStr = "{\"id\":43,\"name\":\"Nguyen Van B\"}";
		JSONObject student = JSON.parseObject(studentStr);
		
		String studentStrArr = "[{\"id\":43,\"name\":\"Nguyen Van B\"}]";
		JSONArray studentArr = JSON.parseArray(studentStrArr);
		System.out.println(studentArr.get(0).toString());
		
		// convert object to string
		Student newStudent = new Student(100, "Nguyen Van A");
		String newStudentStr = JSON.toJSONString(newStudent);
		System.out.println(newStudentStr);
	}

}