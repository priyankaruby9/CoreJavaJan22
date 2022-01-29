package test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 7;
		boolean flag = true;
		
		/*if(num % 2 == 0) {
			
			System.out.println( " The num is even ");
		}else {
			System.out.println(" the number is odd");
		}*/
		
		for (int i = 2; i <num/2; i++) {
			int reminder = num%i;
			if (reminder == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("The num is prime");
		}else {
			System.out.println("The num is not prime");
		}
	}

}
