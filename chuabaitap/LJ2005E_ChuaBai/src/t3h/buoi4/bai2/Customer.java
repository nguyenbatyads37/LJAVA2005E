package t3h.buoi4.bai2;

public class Customer {

	private int cmnd;
	private String name;
	
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Customer(int cmnd, String name) {
		super();
		this.cmnd = cmnd;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Customer [cmnd=" + cmnd + ", name=" + name + "]";
	}
}
