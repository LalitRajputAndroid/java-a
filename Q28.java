/* W.A.J.P to read 10 integer values using Scanner class from keyboard. 
Generate the exception if the entered value is less than 10 and or greater 
than 40. Program should display appropriate message as and when this 
exception occurs otherwise it will display all the entered values.*/
package Module2;

import java.util.Scanner;

public class Q28 {
		public static void main(String[] args) {
			int n[] = new int[10]; 
			int i;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter A array number : ");
			for( i=0;i<=10;i++)
			{	
				n[i] = sc.nextInt();
			}
			System.out.println("Array Value = ");
			if(n[i]>=10||n[i]<=40) {
				
				for( i = n[i]; i<=10 ;i++) {
					
					System.out.println(n[i]);
				}
			}
			else {
				
				throw new ArithmeticException("Entered value only less than 10 and greater than 40");
			}
		
		}	
}
