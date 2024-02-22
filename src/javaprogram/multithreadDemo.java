package javaprogram;

public class multithreadDemo implements Runnable {
	int count;
	public  synchronized void  run() {
		for(int i=1;i<=1000;i++) {
			count++;
		}
	}

	public static void main(String[] args) {
		
		multithreadDemo m1=new multithreadDemo();
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m1);
		
		t1.start();
		t2.start();

		System.out.println("is Alive .."+t1.isAlive());
	//	System.out.println("is Alive .."+t1.isAlive());

		
//	 
		
//		System.out.println(t1.MIN_PRIORITY);
//		System.out.println(t2.MAX_PRIORITY);
//		
////		t1.setName("MY Thread 1....");
////		t2.setName("MY thread 2.....");
//		
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
//		
//		t1.setPriority(2);
//		t2.setPriority(3);
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());


		
		try {
			t1.join();
			//t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(m1.count);
		//System.out.println("is Alive .."+t1.isAlive());
	}
	

}
