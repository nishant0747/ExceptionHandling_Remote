package Ex;

public class tryCatch 
{
	
		public static void main(String[] args) 
		{
			int a = 10;
			int b = 0;
			int c = 0;

			try 
			{
				c = a / b; // risky code
			} 
			catch (ArithmeticException t)
			{
				
				System.out.println("Exception found");
			}
			
			finally
			{
				System.out.println("I am here");
			}

			

		}
		
}
