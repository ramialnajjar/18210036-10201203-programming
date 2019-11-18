import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args) 
	{
		
		for (int y = 0; y < 5;)
		{
			System.out.println("Please enter a number for your desired operation:");
			System.out.println("1 - addition");
			System.out.println("2 - subtraction");
			System.out.println("3 - Multiplication");
			System.out.println("4 - Division");
			System.out.println("5 - Quit");
		
		
			
			
				Scanner s1 = new Scanner (System.in);
			
				int x = s1.nextInt();
		
				if (x == 5)
				{
					y = 5;
					break;
				}
			
				double n1 = operation ();
			
				double n2 = operation ();
		
				if (x == 1)
				{
					double sum = addition (n1,n2);
					System.out.println(sum);
				}
		
				else if (x == 2)
				{
					double sum = subtraction (n1,n2);
					System.out.println(sum);
				}
		
				else if (x == 3)
				{
					double sum = multiplication (n1,n2);
					System.out.println(sum);
				}
		
				else if (x == 4)
				{
					double sum = division (n1,n2);
					System.out.println(sum);
				}
			
				else
				{
					System.out.println("Please enter a valid value");
				}
				
		}
		
		
	}
	
	public static double addition (double n1 , double n2)
	{
		double sum = n1 + n2;
		return sum;
		
	}
	
	public static double subtraction (double n1 , double n2)
	{
		double sum = n1 - n2;
		return sum;
		
	}
	
	public static double multiplication (double n1 , double n2)
	{
		double sum = n1 * n2;
		return sum;
		
	}
	
	public static double division (double n1 , double n2)
	{
		double sum = n1 / n2;
		return sum;
		
	}

	
	public static double operation ()
	{
		Scanner s1 = new Scanner (System.in);
		
		System.out.println("Please Enter a Number");
		double n = s1.nextDouble();
		return n;
		
	}

}
