package t3h.buoi4.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortApplication {
	
	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(new Student(1, "Student1", 20));
		listStudent.add(new Student(20, "Student20", 20));
		listStudent.add(new Student(14, "Student14", 20));
		listStudent.add(new Student(16, "Student16", 20));
		listStudent.add(new Student(10, "Student10", 20));
		
		// Sort
		listStudent.sort(new Comparator<Student>() {
			@Override
			public int compare(Student student1, Student student2) {
				return student1.getStudentId() - student2.getStudentId();
			}
		});
		
		listStudent.sort((student1, student2) -> 
			student1.getStudentId() - student2.getStudentId());
		
		Collections.sort(listStudent, (st1, st2) -> {
			return st1.getStudentId() - st2.getStudentId();
		});
		
		Collections.sort(listStudent);
		
//		for (Student student : listStudent) {
//			System.out.println(student.toString());
//		}
		
		Student newStudent = new Student(1, "New student 1", 10);
		
		// Check unique studentId
		for(int i = 0; i < listStudent.size(); i++) {
			if (listStudent.get(i).getStudentId() == newStudent.getStudentId()) {
				listStudent.remove(i);
				listStudent.add(newStudent);
				break;
			}
		}
		
		for (Student student : listStudent) {
			System.out.println(student.toString());
		}
		
	}
}
