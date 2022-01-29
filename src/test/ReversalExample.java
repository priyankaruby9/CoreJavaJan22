package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse string
		//reverse array
		//reverse number
		
		String str1 = "Clean India Green India";
		String revstr1 = "";
		
		for ( int index = str1.length()-1;index >=0; index--) {
			revstr1 = revstr1 + str1.charAt(index);
		}
		System.out.println("reversed string " + revstr1);
		
		//number of vowels
		
		int result = 0;
		for (int index = 0; index<str1.length(); index++) {
			if (str1.charAt(index)== 'a' || str1.charAt(index)== 'e' ||str1.charAt(index)== 'i'||str1.charAt(index)== 'o'||str1.charAt(index)== 'u')
				result ++;
		}
		//reversing array
		int[] array = {10,20,30,40,50};
		int[]array2 = new int[5];
		for (int i =array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
		
		//reverse number
		int number = 987654, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		
	}

}
