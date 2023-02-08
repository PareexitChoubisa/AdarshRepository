package samanvayPackage;

public class StarPattern {

	public static void main(String[] args) {
		
		int n = 5;  // Number of rows.
		 
	      // We first print Right Angled Triangle
	      //Outer Loop for number of Rows
	      for(int i=0;i<n;i++)
	      {
	          // printing '*' in each column.
	          for(int j=0;j<=i;j++)
	          {
	            // We print '*' for each row.
	            System.out.print("* ");
	          }
	 
	          System.out.println();
	      }
	 
	      // Then we print Inverted Right Angled Triangle
	      for(int i=0;i<n-1;i++)
	      {
	          for(int j=i;j<n-1;j++)
	          {
	              System.out.print("* ");
	          }
	          System.out.println();
	      }
	  }
	}  