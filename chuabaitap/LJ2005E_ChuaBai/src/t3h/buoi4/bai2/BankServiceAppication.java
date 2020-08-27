package t3h.buoi4.bai2;

import java.util.LinkedList;
import java.util.Queue;

public class BankServiceAppication {

	public static void main(String[] args) {
		Queue<Customer> customerQueue = new LinkedList<Customer>();
		
		customerQueue.offer(new Customer(12341234, "Nguyen Van A"));
		customerQueue.offer(new Customer(22341234, "Nguyen Van B"));
		customerQueue.offer(new Customer(32341234, "Nguyen Van C"));
		customerQueue.offer(new Customer(42341234, "Nguyen Van D"));
		
		Customer handlingCustomer = customerQueue.poll();
		System.out.println("Serve success: " + handlingCustomer.getName());
		
		Customer handlingCustomer1 = customerQueue.poll();
		System.out.println("Serve success: " + handlingCustomer1.getName());
		
		Customer handlingCustomer2 = customerQueue.poll();
		System.out.println("Serve success: " + handlingCustomer2.getName());
	}

}
