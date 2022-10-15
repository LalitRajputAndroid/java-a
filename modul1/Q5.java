// Write a program in Java to input 5 numbers from keyboard and find their 
//sum and average using for loop
package Module1;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		int i,n;
		double average,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A 5 number :");
		for(i=0;i<5;i++)
		{
			n = sc.nextInt();
			sum = sum+n;
		}
		System.out.println("Sum :"+sum);
		average = sum/2;
		System.out.println("Average :"+average);
	}
}
