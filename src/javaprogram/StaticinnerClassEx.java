package javaprogram;


class StaticinnerClassEx{
	static class Inner{ //inner static class
		
		void innermethood() {
			System.out.println("inner methodddd////");
		}
	
}


	public static void main(String[] args) {
		
		Inner i=new Inner();
		i.innermethood();
		
	}

}
