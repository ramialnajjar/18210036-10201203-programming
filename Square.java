import java.util.Scanner;
public class Square
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter a value");
		
		Scanner s1 = new Scanner (System.in);
		
		int n = s1.nextInt();
		
		for (int i = 1; i <= (n*n); i++)
		{
			System.out.print("*");
			
			if (i%n==0)
			{
				System.out.println();
			}
		s1.close();
	
		}
	}
		
}


