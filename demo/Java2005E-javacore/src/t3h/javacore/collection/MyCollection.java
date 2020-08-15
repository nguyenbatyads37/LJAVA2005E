package t3h.javacore.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyCollection {

//	// demo list
//	public static void main(String[] args) {
//		List<String> studentList = new LinkedList<String>();
//		studentList.add("Student1");
//		studentList.add("Student2");
//		studentList.add("Student3");
//		
//		studentList.remove("Student3");
//		
//		System.out.println(studentList.get(1));
//		
//		for(String student : studentList) {
//			System.out.println(student);
//		}
//	}
	
//	//demo queue
//	public static void main(String[] args) {
//		Queue<String> student = new LinkedList<String>();
//		student.offer("Student1");
//		student.offer("student2");
//		
//		System.out.println(student.poll());
//		System.out.println(student.poll());
//	}
	
//	//demo set
//	public static void main(String[] args) {
//		Set<String> studentSet = new HashSet<String>();
//		studentSet.add("Long");
//		studentSet.add("Long");
//		studentSet.add("Long 1");
//		
//		Iterator<String> iterator = studentSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println((String) iterator.next());
//        }
//	}
	
	//demo map
	public static void main(String[] args) {
		Map<Integer, String> studentMap = new HashMap<Integer, String>();
		studentMap.put(1, "Student1");
		studentMap.put(2, "Student2");
		studentMap.put(3, "Student3");
		
		studentMap.remove(3);
		
		Set<Integer> keySet = studentMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " - " + studentMap.get(key));
        }
	}

}
