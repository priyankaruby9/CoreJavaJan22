package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int[]array1 = {5 , 6, 7, 8, 9};
		
		try {
			int result = num/2;
			System.out.println(array1[10]);
			
		}catch(ArithmeticException e) {
			
			System.out.println("inside Arithmetic Exception");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("inside ArrayIndexOutOfBoundsException");
			
		} catch (Exception e) {
			
			System.out.println("inside default exception");
			
		} finally {
			
			System.out.println("inside finally");
		}
		
		System.out.println("after try and catch");
	}

}
