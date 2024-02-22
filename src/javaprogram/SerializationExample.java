package javaprogram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	String name;
	int num;
	
	Employee(String name, int num){
		this.name=name;
		this.num=num;
	}
}


public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		Employee e=new Employee("anji",102);
//		
//		FileOutputStream f=new FileOutputStream("E:\\serial.ser");
//		ObjectOutputStream of=new ObjectOutputStream(f);
//		
//		of.writeObject(e);
		FileInputStream f=new FileInputStream("E:\\FileExample.ser");
		ObjectInputStream  of=new ObjectInputStream(f);
		Employee emp=(Employee) of.readObject();	
		of.close();
		f.close();
		System.out.println("success....");
		//System.out.println(emp.name+":"+emp.num);
	}

}
