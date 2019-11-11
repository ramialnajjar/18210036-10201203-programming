import java.util.Scanner;
public class Test3 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner (System.in);
		
		System.out.println("The pyramid :");
		System.out.println("Please enter the amount of rows");
		
		int n = s1.nextInt(); 
		
		 int x = 1;  
	      
	     int y = 0;
	     
	     int space = n;
	     
	     int space_count = 0;
	     
	     int count = 0;
	          
	        for ( x = 1; x <= n;) 
	        { 
	        	
	            if (space > space_count && count == 0) 
	            { 
	                System.out.print (" "); 
	                space--; 
	                continue; 
	            } 
	      
	            if (space == space_count) 
	            {  
	                space_count--; 
	                space = n; 
	            } 
	        	
	        	
	            if (y < x) 
	            { 
	                System.out.print ("*"); 
	                y++; 
	                count = 1 ;
	                continue;
	            } 
	      
	            if (y == x) 
	            { 
	                System.out.println (); 
	                x++; 
	                y = 0;
	                count = 0;
	            } 
	        } 

		
	    s1.close();    
	}

}
