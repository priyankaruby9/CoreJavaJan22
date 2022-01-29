package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age ");
		
		int age = scanner.nextInt();
		
		if (age >= 18){
			System.out.println("You are eligible for voting");
		}else if(age == 17){
			System.out.println("You are eligible for voting this year, try doing next year");
		}
		else {
			int eligibleyear = 18- age;
			System.out.println("You are not eligible for voting try after " + eligibleyear);
		}
		scanner.close();
	}

}
