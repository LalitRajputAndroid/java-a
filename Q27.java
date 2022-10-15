/* W.A.J. P to demonstrate try catch block, take two numbers from the user 
by Command line argument and perform the division operation and 
handle Arithmetic
O/PException in thread main java. Lang. ArithmeticException:/ by zero*/
package Module2;

import java.util.Scanner;

class division{
	public void user_input()throws ArithmeticException {
		int a,b,ans;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A : ");
		a = sc.nextInt();
		System.out.println("Enter B : ");
		b = sc.nextInt();
		
		ans = a/b;
		System.out.println(ans);
	}
}
public class Q27 {
		public static void main(String[] args) {
			division obj = new division();
			
			try {
				obj.user_input();
			}catch (ArithmeticException e) {
				System.out.println("Any number not divide by Zero");
			}
		}
}
