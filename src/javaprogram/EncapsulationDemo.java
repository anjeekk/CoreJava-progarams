package javaprogram;

public class EncapsulationDemo {
	 private String name= "anji";
	 
	 private String name1;
	 
	public String getName() {
		return name;
	}
	
	public void setName1(String name1) {
		System.out.println("change the name...");
		this.name1=name1;
	}

	public String getName1() {
		return name1;
	}
}
