package javaprogram;

public class threadDemo implements Runnable {
	
	
		String name;
		threadDemo(String name1){
			name=name1;
		}
		//2 step run method
		public void run() {
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					System.out.println(e);
				}
				System.out.println(name+":"+i);
			}
		}

	public static void main(String[] args) {
		
		//3 step create an object
		threadDemo td1=new threadDemo("thread1...");
		threadDemo td2=new threadDemo("thread2....");
		
		//4th step create an object for thread class and link above object
		Thread t1=new Thread(td1);
		Thread t2=new Thread(td2);
			
		
		//step 5 run method
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		for(int i=0;i<=10;i++) {
			System.out.println("MAIN:.."+i);
			
		}
		

	}

}
