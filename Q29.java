/*W.A.J.P to create the validate method that takes integer value as a 
parameter. If the age is less than 18, then throw an ArithmeticException 
otherwise print a message welcome to vote.
O/P- Enter your age: 16*/
package Module2;

import java.util.Scanner;

class Age{
	public void validate(int age) {
		System.out.println(age);
	}
}
public class Q29 {
	public static void main(String[] args) {
		Age a = new Age();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		a.validate(age);
		if (age<=18) {
			throw new ArithmeticException();
		}
		else {
			System.out.println("Welcome to Vote");
		}
	}
}
