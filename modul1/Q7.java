/* Write a program in Java to make such a pattern like right angle triangle 
with number increased by 1 The pattern like:
1
2 3
4 5 6
7 8 9 10*/

package Module1;

public class Q7 {
public static void main(String[] args) {
	int i,j,n=1;
	for(i=1;i<5;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(n);
			n++;
		}
		System.out.print("\n");
	}
  }
} 