package t3h.demo.mvn;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Application {

	public static void main(String[] args) {
		JSONObject jsonObject = JSON.parseObject("{\"name\": \"Nguyen Van B\"}");
		System.out.println(jsonObject.getString("name"));
	}

}
