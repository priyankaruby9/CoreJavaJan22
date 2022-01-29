package oops;

public class Person {

	public String Name;
	public int Age;
	
	public void display() {
		System.out.println("insde parent");
	}
	
	public Person() {
		System.out.println("this calls parent constructor");
	}
	
	public Person (String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}
	
}
