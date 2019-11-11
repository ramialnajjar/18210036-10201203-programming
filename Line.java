import javax.swing.JOptionPane;
public class Line 
{

    public static void main(String[] args) 
    {

    	
    	
    	String s1 = JOptionPane.showInputDialog("Enter the number of stars");
    	int num1 = Integer.parseInt(s1);
        
        int x= num1 *2 -1; 
        String count = "";
        int y = 0;
        int s = 0;
        
        for(int i = 0; i <= x; i++) {
        	if (i == num1)
        	{
        		s = 1;
        		y = 1;
        	}
        	if(s == 0)
        	{
        		System.out.println(count+"*");
                count = count + " ";
        	}
        	else
        	{
        		if(y == 1)
        		{
        			y = 0;
        			count = count.substring(0,count.length()-1);
        			continue;		
        		}
        		count = count.substring(0,count.length()-1);
        	    System.out.println(count+"*");
        			
        		
        		
        	}
        	
            
            }
            System.out.println();
      }


}