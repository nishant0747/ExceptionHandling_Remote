package Ex;

import java.util.InputMismatchException;

public class multipleCatch 

{
	
	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int c = 0;
		int d = a+1;
        
		try 
		{
			c = a / b; // risky code
			System.out.println(d);
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			c = a / 1;
			System.out.println("ArrayIndexOutOfBoundsException found");
		}
		catch (InputMismatchException e)
		{
			c = a / 2;
			System.out.println("InputMismatchException found");
		}
		catch (ArithmeticException e)
		{
			c = a+5;
			System.out.println("ArithmeticException found");
		}

		System.out.println(c);
		
		System.out.println("hii");
		System.out.println(d);


	}
}
