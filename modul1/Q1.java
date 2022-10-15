 // Write a Java program to Take three numbers from the user and print the 
//greatest number. 
package Module1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
			int a,b,c,n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter A :");
			a = sc.nextInt();
			System.out.println("Enter B :");
			b = sc.nextInt();
			System.out.println("Enter c :");
			c = sc.nextInt();
			                 
			if(a>b)
			{
				if(a>c)
				{
					System.out.println("Greatest Number = "+a);
				}
			}
			else if (b>c)
			{
				System.out.println("Greatest Number = "+b);
			} 
			else
			{
				System.out.println("Greatest Number = "+c);
			}

	}
                                             
}
