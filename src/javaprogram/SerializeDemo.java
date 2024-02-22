package javaprogram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	String name;
	int id;
	
	Employee(String name, int id){
		this.name=name;
		this.id=id;
	}
}
public class SerializeDemo {

	public static void main(String[] args) {
		

		Employee e=new Employee("anji",11);
		
		try {
			FileOutputStream f=new FileOutputStream("D:\\Demo.ser");//create file
			//FileOutputStream f=new FileOutputStream("D:\\Demo.txt");
			ObjectOutputStream out= new ObjectOutputStream(f);//create object
			out.writeObject(e);
			out.close();
			f.close();
			System.out.println("File create Successfully....");
			
		}catch(Exception ee) {
			ee.printStackTrace();
		}

	
	}
}
