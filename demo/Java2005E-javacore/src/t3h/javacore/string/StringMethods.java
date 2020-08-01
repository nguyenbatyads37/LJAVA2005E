package t3h.javacore.string;

public class StringMethods {
	static String  checkEmpty = new String("gia");
	public static void main(String[] args) {
		
		// length in java
		String s1 = "java";
		System.out.println(s1.length());
		
		String s2 = new String("java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(checkEmpty.isEmpty());
		
		String concat = s1.concat(s2);
		System.out.println(concat);
		
		String oldString = "my name is Khan my name is Java";
		String replace = oldString.replace("name", "nick name");
		System.out.println(replace);
		
		String subString = "hellojava";
		System.out.println(subString.substring(3, 7));
		
		int age = 10;
		String ageStr = String.valueOf(age);
		System.out.println(ageStr);
		
		String needToHandle = "Nguyen-Van-Be";
		String[] handleArray = needToHandle.split("-");
		for (String item : handleArray) {
			System.out.println(item);
		}
	}
}
