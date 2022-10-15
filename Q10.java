/*Create a class to print the area of a square and a rectangle. The class has 
two methods with the same name but different number of parameters. 
The method for printing area of a rectangle has two parameters which are 
length and breadth respectively while the other method for printing area 
of square has one parameter which is side of square.*/
package Module2;

import java.net.MulticastSocket;
import java.util.Scanner;

class area{
	public void method(int a){
		int ans;
		ans = a*a; 
		System.out.println("\nArea of square = "+ans);
	}
	public void method(int l,int b) {
		int ans = l*b;
		System.out.println("\nArea of Rectangle = "+ans);
	}
}
public class Q10 {
	public static void main(String[] args) {
		int a,l,b;
		area obj = new area();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a square side :");
		a = sc.nextInt();
		obj.method(a);
		System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.println("Enter a Area of length :");
		l = sc.nextInt();
		System.out.println("Enter a Area of breadth :");
		b = sc.nextInt();
		obj.method(l, b);
	}
}
