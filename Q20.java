/* We have to calculate the area of a rectangle, a square and a circle. Create 
an abstract class 'Shape' with three abstract methods namely 
'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' 
taking one parameter each. The parameters of 'RectangleArea' are its 
length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' 
is its radius. Now create another class 'Area' containing all the three 
methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 
'Area' and call all the three methods.*/
package Module2;

import java.util.Scanner;

abstract class Shap{
	abstract void RectangleArea();
	abstract void SquareArea();
	abstract void CircleArea();
}
class Area1{
	float pi = 3.14F;
	public void RectangleArea(int l,int b) {
		int ans = l*b;
		System.out.println("Area of Rectangle : "+ans); 
	}
	
	public void SquareArea(int s) {
		int ans = s*s;
		System.out.println("Area of Square : "+ans);
	}
	
	public void CircleArea(float r) {
		float ans = pi*r*r;
		System.out.println("Area of circle : "+ans);
	}
}
public class Q20 {
	public static void main(String[] args) {
		int l,b,s;
		float r;
		Area1 a = new Area1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a length = ");
		l = sc.nextInt();
		System.out.println("Enter a Breadth = ");
		b = sc.nextInt();
		a.RectangleArea(l, b);
		
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		
		System.out.println("Enter a side = ");
		s = sc.nextInt();
		a.SquareArea(s);
		
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		
		System.out.println("Enter a Redius = ");
		r = sc.nextFloat();
		a.CircleArea(r);
		
	}
}
