/* Write a program in Java to display the pattern like right angle triangle 
with a number. 
1
12
123
1234
12345*/
package Module1;

import java.util.Iterator;

public class Q6 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j );
			}
			
		  System.out.print("\n");
		}
	}
}
