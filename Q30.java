/* W.A.J.Pto create a custom exception if Customer withdraw amount which 
is greater than account balance then program will show custom exception 
otherwise amount will deduct from account balance.
Account balance is: 2000 Enter withdraw amount: 2500
Sorry, insufficient balance, you need more 500 Rs. To perform this 
transaction.*/
package Module2;

import java.util.Scanner;

public class Q30 {
		public static void main(String[] args) {
			int w_amount,Account_balance = 2000;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Withdraw Amount : ");
			w_amount = sc.nextInt();
			
			if(Account_balance<w_amount) {
				
				throw new ArithmeticException("Sorry, insufficient balance, you need more 500 Rs.");
			}
			else {
				System.out.println("Withdraw Succesful");
			}
		}
}
