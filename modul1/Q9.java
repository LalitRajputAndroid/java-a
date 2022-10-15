/* Write a Java program to count the letters, spaces, numbers and other 
characters of an input string.*/
package Module1;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a any String :");
		name = sc.next();
		
		System.out.println("String Length :"+name.length());
	}
}
