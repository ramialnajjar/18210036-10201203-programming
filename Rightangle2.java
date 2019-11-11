import java.util.Scanner;
public class Rightangle2 
{
	public static void main(String[] args) 
	{
		
		Scanner s1 = new Scanner (System.in);
		
		System.out.println("The right-angle triangle :");
		System.out.println("Please enter the amount of rows");
		
		int n = s1.nextInt(); 
		
		 int x = 1;  
	      
	     int y = 0;
	          
	        for ( x = 1; x <= n;) 
	        { 
	            if (y <  x) 
	            { 
	                System.out.print ( "*"); 
	                y++; 
	                continue; 
	            } 
	      
	            if (y == x) 
	            { 
	                System.out.println (); 
	                x++; 
	                y = 0; 
	            } 
	        } 
	        
	        s1.close();
		
	}

}
