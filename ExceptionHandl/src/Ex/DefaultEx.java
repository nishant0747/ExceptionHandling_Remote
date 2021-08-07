package Ex;

import java.util.InputMismatchException;

public class DefaultEx 

{
	
	public static void main(String[] args) throws InputMismatchException 
	{
		
		int a = 45;
		int b = 0;
		int c;
		int d = 10;
		int e;
		
		
		
		
		try //only risky code can be executed within try block
		{
			e = a+d;
			c = d/b; //risky code
		
			c =a/b;  //risky code
			         //if risky code turn into unrisky then it will run
			System.out.println("UseBydefaultexception");
			System.out.println(e);
			System.out.println(c);
			
		}
		
		catch(ArrayIndexOutOfBoundsException t)
		{
			
			System.out.println("Exception 1 found ");
		}


		
		catch(InputMismatchException w)
		{
			
			
			
		}
		
		catch(ArithmeticException x)
		{
			
		}
		
		
		catch(Exception r)
		{
	
			System.out.println("Exception 2 found");
	
		}
		
	
			

}
}
