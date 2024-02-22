package javaprogram;

public class DemoThred extends Thread{
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println("...."+i);
			
		}
		System.out.println("this is run method....");
	}

	public static void main(String[] args) {
		
		DemoThred dt= new DemoThred();//user
	 Thread t=new Thread(dt);//thread
	 t.setDaemon(false);
	 t.start();
	 System.out.println(Thread.currentThread().isDaemon());
	// System.out.println();
	

		
	}

}
