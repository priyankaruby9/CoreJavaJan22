package test;

import java.util.Scanner;

public class Numcheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		
		int num = scanner.nextInt();
		// TODO Auto-generated method stub
		
		if (num % 2 == 0) {
			System.out.println("number is even number");
		}else {
			System.out.println("number is odd number");
		}
		scanner.close(); //scanner will occupy storage in ram. so lot of resources will be occupied
	}
	
}
