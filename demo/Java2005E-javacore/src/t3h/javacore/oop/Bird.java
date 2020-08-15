package t3h.javacore.oop;

public class Bird extends Animal implements AnimalAction {

	public Bird(String mat, String mui) {
		super(mat, mui);
	}

	@Override
	public void fly() {
		System.out.println("Bird is flying");
	}
	
	public static void main(String[] arg) {
		Animal bird = new Bird("Mat do", "Mui nhon");
	}

	@Override
	void sleep() {
		defaultSleep();
	}

	@Override
	public void doing() {
		// TODO Auto-generated method stub
		
	}
	
}
