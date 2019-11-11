import javax.swing.JOptionPane;
public class RhombusWhile  
{
	public static void main(String[] args)
	{
		 int spaces = 1;
		 
		 
		JOptionPane.showMessageDialog(null, "This is the Rhombus Program");
		
		String s1 = JOptionPane.showInputDialog("Please enter the desired size:");
		int n = Integer.parseInt(s1);

		 
		 spaces = n - 1;
		 
		 
		 for (int j = 1; j<= n; j++)
		 {
			 int i = 1;
			 
			 while (i<= spaces)
			 {
				 System.out.print(" ");
				 i++;
			 }
			 spaces--;
			 
			 i = 1; 
			 
			 while (i <= 2 * j - 1)
			 {
				 System.out.print("*");
				 i++;
			 }
			 System.out.println("");
		 }
		 
		 spaces = 1;
		 
		 for (int j = 1; j<= n - 1; j++)
		 {
			 int i = 1;
			 
			 while (i<= spaces)
			 {
				 System.out.print(" ");
				 i++;
			 }
			 spaces++;
			 
			 i = 1; 
			 
			 while (i<= 2 * (n - j) - 1)
			 {
				 System.out.print("*");
				 i++;
			 }
			 System.out.println("");
		 }
		 

	}

}






