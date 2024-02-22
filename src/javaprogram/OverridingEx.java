package javaprogram;


class Human{
	public  void walk(int dis, int time) {
		int speed=dis/time;
		System.out.println(speed);
	}
	
	
}
class Athlets extends Human{
	public void walk(int dis,int time) {// method overriding
		int speed=dis/time;
		speed=speed*2;
		System.out.println("speeeeed"+speed);
	}
}

public class OverridingEx {

	public static void main(String[] args) {

		Athlets at=new Athlets();
		//Human at=new Human();
		at.walk(10,2);
	}

}
