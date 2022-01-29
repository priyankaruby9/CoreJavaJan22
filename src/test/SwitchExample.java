package test;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str1 = "Green World Clean World";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		
		String str1 = scanner.nextLine();
		int vowelcount = 0;
		
		for (int i = 0; i< str1.length(); i++) {
			char temp = str1.charAt(i);
			
			switch(temp) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelcount = vowelcount+1;
				break;
			}
			
		}
		System.out.println("Total vowel count " + vowelcount);
		scanner.close();
	}
}
		
