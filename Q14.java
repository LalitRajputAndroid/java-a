/* B41. Write a program to print the area and perimeter of a triangle having 
sides of 3, 4 and 5 units by creating a class named 'Triangle' without any 
parameter in its constructor.*/
package Module2;

import java.util.Scanner;

class Triangle{
	int b,l;
	double ans;
	
	Triangle(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Breath : ");
		b = sc.nextInt();
		System.out.println("Enter a length : ");
		l = sc.nextInt();
		ans = 0.5*b*l;
		System.out.println("Area of a Triangle : "+ans);
		
	}
	Triangle(int a,int s,int c){
		
		ans = a*s*c; 
		System.out.println("Perimeter of a Triangle : "+ans);
	}
}
public class Q14 {
	public static void main(String[] args) {
		Triangle obj = new Triangle();
		Triangle obj1 = new Triangle(3, 4, 5);
	}
}
