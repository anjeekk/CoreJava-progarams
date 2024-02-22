package javaprogram;

abstract class Animal {
	
	abstract void sound();
	void display() {
		System.out.println("this is abstract class.....");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("sound is barking..........");
	}

	public static void main(String[] args) {
		
		Animal a= new Dog();
		a.display();
		//Dog d=new Dog();
		a.sound();
	}

}
