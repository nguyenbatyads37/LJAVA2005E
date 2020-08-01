package t3h.javacore.stringbuffer;

public class DemoStringBuffer {

	public static void main(String[] ars) {
		StringBuffer sb = new StringBuffer("Nguyen");
		sb.append(" Van");
		System.out.println(sb.toString());

		sb.insert(0, "Hello: ");
		System.out.println(sb);

		sb.replace(0, 7, "Hi: ");
		System.out.println(sb);

		sb.delete(0, 4);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		long beforeBuffer = System.currentTimeMillis();
		StringBuffer myStringBuffer = new StringBuffer("Nguyen");
		for (int i = 0; i < 100000; i++) {
			myStringBuffer.append(" Van");
		}
		
		long afterBuffer = System.currentTimeMillis();
		System.out.println("Thoi gian append cua StringBuffer: " + (afterBuffer - beforeBuffer));

		long beforeBuilder = System.currentTimeMillis();
		StringBuilder myStringBuilder = new StringBuilder("Nguyen");
		for (int i = 0; i < 100000; i++) {
			myStringBuilder.append(" Van");
		}
		
		long afterBuilder = System.currentTimeMillis();
		System.out.println("Thoi gian append cua StringBuilder: " + (afterBuilder - beforeBuilder));

	}
}
