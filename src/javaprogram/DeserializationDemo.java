package javaprogram;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Employes implements Serializable{
	String name;
	int num;
	Employes(String name, int num){
		this.name=name;
		this.num=num;
	}
}

public class DeserializationDemo {

	public static void main(String[] args) {

		try {
			
		
		FileInputStream f=new FileInputStream("D:\\Demo.ser");
		ObjectInputStream ob=new ObjectInputStream(f);
		Employes emp=(Employes) ob.readObject();
		ob.close();
		f.close();
		System.out.println(emp.name+""+emp.num);
		
	}catch(Exception e){
		e.printStackTrace();
		
	}

	}
}
