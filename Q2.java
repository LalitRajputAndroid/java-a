// W.A.J.P to concatenate a given string to the end of another string.
package Module2;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A fast String :");
		s1 = sc.next();
		System.out.println("Enter A Second String :");
		s2 = sc.next();
		
		System.out.println("Fast String :"+s1);
		System.out.println("Second String :"+s2);
		
		System.out.println("Marge String = "+s1.concat(s2));
	}

}
