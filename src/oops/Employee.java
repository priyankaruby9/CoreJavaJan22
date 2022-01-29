package oops;

public class Employee {
	
	public String Name;
	public int EmployeeID;
	public static int salary;
	public static String Companyname = "infosys";
	
	
	public Employee (String Name , int Employee, int salary) {  //constructor can be parameterised or not parameterised
		this.Name= Name;
		this.EmployeeID= Employee;
		this.salary= salary;
	}
	
	public Employee (String Name , int Employee) {                      //constructor
		this.Name= Name;
		this.EmployeeID= Employee;
		//this.salary= salary;
	}

	public void Printname () {
		System.out.println("Name of employee " + Name);
	}
	
	public void PrintSalary() {
		System.out.println("salary of employee " + Employee.salary );
	}
	
	public static void changecompanyname() {
		Employee.Companyname = "wipro";
	}
	
	public Employee() {
	}
}
