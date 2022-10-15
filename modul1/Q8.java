/* Write a Java program that reads a positive integer and count the number 
of digits the number.
Input an integer number less than ten billion: 125463 Number of digits in 
the number: 6
*/
package Module1;

import java.awt.SystemTray;
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n,i=0;
		System.out.println("Enter a number :");
		n = sc.nextLong();
		
		if (n<=1000000000) {
			while(n>0)
			{
				n = n/10;
				i++;
			}
			System.out.println("Number of Digits :"+i);
		}
		else {
			System.out.println("please Enter number less than ten billion :");
		}
	}
}
