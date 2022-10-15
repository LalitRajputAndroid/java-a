/* Write a Java program that accepts an integer (n) and computes the value 
of n+nn+nnn.
Input number: 5
5 + 55 + 555*/
package Module1;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		System.out.println("n+nn+nnn");
		System.out.println(n+"+"+n+n+"+"+n+n+n);
	}
}
