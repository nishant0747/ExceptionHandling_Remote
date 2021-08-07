package Ex;

public class P1 
{
	int d = 5;
	float g = 10;
	static int a = 4;
	static float y = 5.8f;
	public static void main(String[] args) 
	{
		P1.j2();
		P1 r = new P1();
		r.j1();
		
	
	}
	
	public static void j2() 
	{
		System.out.println(a+y);
		
	}
	public void j1() 
	{
		System.out.println(this.a+y);
		int a = 3;
		int b = 0;
		int c =1;
		
		
		try
		{
			c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			int d=2;
			c=a/d;
			System.out.println("------catch is here-----");
			System.out.println(c);
			System.out.println("It's catched");
		}
		
		finally
		{
			int f = 100;
			int e = a+f;
			System.out.println("-----Finally is here-----");
			System.out.println(c=a);
			System.out.println(e);
		}
		
	}


}
