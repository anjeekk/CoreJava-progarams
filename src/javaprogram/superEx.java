package javaprogram;

 class anji {
	
	int a=30;
	
	anji(){//constructor.....
		System.out.println("this Constructor..... Parent");
	}
	void kumar() {
		System.out.println("helooooooo kumar");
	}
	
	}
	
	class superEx extends anji{
		
		int a=10;//instance variable
		
		superEx(){ //constructor..
			//super();
			System.out.println("this child Constructor.... CHILD");
			
		}
		
		void kumar() {
			int a=20;//local variable
			
			super.kumar();// call to parent method
			
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(super.a);
			System.out.println("hiiiii abc child");
			
		}
	
	public static void main(String[] args) {

		superEx aa=new superEx();
		aa.kumar();
	}

}
