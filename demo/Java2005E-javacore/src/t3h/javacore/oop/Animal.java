package t3h.javacore.oop;

public abstract class Animal {

	protected String mat;
	protected String mui;
	
	public Animal(String mat, String mui) {
		this.mat = mat;
		this.mui = mui;
	}
	
	void defaultSleep() {
		
	}
	
	abstract void sleep();

	protected void eat() {
		System.out.println("Animal is eating");
	}
}
