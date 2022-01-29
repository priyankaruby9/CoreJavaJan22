package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee emp1 = new Employee();
		emp1.Name = "Sachin";
		emp1.EmployeeID = 3333;
		emp1.salary = 12345;
		

		Employee emp2 = new Employee();
		emp2.Name = "Mahesh";
		emp2.EmployeeID = 4444;
		emp2.salary = 34578;
		
		//System.out.println("The employee name is " + emp1.Name);
		//System.out.println("The employee name is " + emp2.Name);*/
		//Employee emp1= new Employee("sachin", 2345, 111);
		//Employee emp2= new Employee("mahesh", 5678, 2224);
		Employee emp3= new Employee("ram", 5678);
		
		//emp1.Printname();
		//emp2.Printname();
		//emp1.Printname();
		emp3.Printname();
		Employee.salary = 2000;
		
		Employee.changecompanyname();
		Employee emp4 = new Employee(); //calling cusctructor without parameter
		
		Person per1 = new Person();
		
		ChildClass child = new ChildClass();  //childclass default constructor will alwys call parent default constructor 
		
		child.display();
		//child1.print();
		ChildClass child1 = new ChildClass ("Rahul", 30, "Actor");
		
		MethodOverloadingExample obj = new MethodOverloadingExample ();
		obj.sum(4, 5);
		obj.sum(4, 6, 8);
		
		ICICBank bank1 = new ICICBank();
		bank1.CreditCard();
		
		EncapsulationExample  obj10 = new EncapsulationExample();
		
		obj10.setName("rohit");
		System.out.println(obj10.getName());
		
	}

}
