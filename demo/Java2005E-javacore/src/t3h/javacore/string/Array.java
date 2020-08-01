package t3h.javacore.string;

public class Array {

	public static void main(String[] args) {
		String[] myArrayStr = {"item1", "item2", "item3"};
		myArrayStr[0] = "new item1";
		for (String item : myArrayStr) {
			System.out.println(item);
		}
		System.out.println(myArrayStr.length);
	}
}
