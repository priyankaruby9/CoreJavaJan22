package oops;

public class ChildClass extends Person{  //childclass can access evrything on person parents class
	
	String Profession;
	
	public ChildClass() {
		System.out.println("Inside child default constructor");

	}
	
	public ChildClass (String Name, int Age, String Profession) {
		
		super(Name, Age); //super is use to access the parameters of parents class
		this.Profession = Profession;
	}
	
	public void print() {                 // but parents class cant access anything from child class
		System.out.println("inside child");
	}
}
