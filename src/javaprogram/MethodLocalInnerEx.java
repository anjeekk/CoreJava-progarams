package javaprogram;


class OuterM{
	void outermethod() {
		class inner{//method local inner class
			void innermethod() {
				System.out.println("ths is inner method,....");
			}
		}
		inner i= new inner();
		i.innermethod();
	}
}
public class MethodLocalInnerEx {

	public static void main(String[] args) {

		OuterM o=new OuterM();
		o.outermethod();
		
	}
	

}
