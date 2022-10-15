/* Take two numbers from the user and perform the division operation and 
handle Arithmetic Exception. O/PEnter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero
*/
package Module2;

import java.util.Scanner;

public class Q24 {
	public static void main(String[] args) {
		try{
		int a,b,ans;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A : ");
		a = sc.nextInt();
		
		System.out.println("Enter B : ");
		b = sc.nextInt();
		
		ans = a/b;
		System.out.println("Division = "+ans);
		}
		catch (ArithmeticException e) {
			System.out.println("10 not divide by 0");
		}
	}
}
