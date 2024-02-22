package javaprogram;


class Customer{
	int amount=10000;
	public synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw.....");
		if(this.amount<amount) {
			System.out.println("Less balance.....");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount=this.amount-amount;
		System.out.println("withdraw completed..... ");
	}
	
	public synchronized void deposit(int amount) {
		System.out.println("going to deposite");
		this.amount=this.amount+amount;
		System.out.println("Deposite completed...");
		notify();
	}
}

public class interThreadDemo {

	public static void main(String[] args) {
		Customer c=new Customer();
		new Thread() {
			public void run() {
				c.withdraw(1500000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(1000);
			}
			
		}.start();
		
	}

}
