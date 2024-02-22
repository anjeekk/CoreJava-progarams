package javaprogram;

public class MultiThread implements Runnable{
	
	String name;
	MultiThread(String name1){
		name=name1;
		
	}
		public void run() {
			for(int i=1;i<10;i++) {
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					System.out.println(e);
				
				}	
				System.out.println("thead1.."+i);
				//System.out.println("thead2.."+i);
			}
	
	
		}
	public static void main(String[] args) {

		MultiThread m1= new MultiThread("thread..1");
		MultiThread m2=new MultiThread("thread..2");
		ThreadGroup tg=new ThreadGroup("Group");
		Thread t1=new Thread(tg,m1);
		t1.setName("kumar");
		t1.setPriority(1);		
		System.out.println(t1);
		
		Thread t2=new Thread(tg,m2);
		t2.setName("anji");
		t2.setPriority(2);
		System.out.println(t2);
		
		
		t1.start();
		try {
			t1.join();
		}catch (Exception e) {

			System.out.println(e);
		}
	
		t2.start();
//		try {
//			t2.join();
//		}catch (Exception e) {
//
//			System.out.println(e);
//		}
		
		for(int i=0;i<=5;i++) {
			System.out.println("main..."+i);
		}
	}

	

}
