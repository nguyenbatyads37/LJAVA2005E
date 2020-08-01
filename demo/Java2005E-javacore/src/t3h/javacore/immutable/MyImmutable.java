package t3h.javacore.immutable;

public class MyImmutable {
	private final String value;

	public MyImmutable(String value) {
		this.value = value;
	}
	
	public String changeValue(String newValue) {
		String newString = new String(newValue);
		return newString;
	}
}
