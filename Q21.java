/* Write a program which will ask 
the user to enter his/her marks (out of 100). Define a method that will 
display grades according to the marks entered as below:
MarksGrade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
<=40 Fail
*/
package Module2;

import java.util.Scanner;

class marks{
	int english,hindi,gujrati,sum,per;
	public void input() {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter a English Marks : ");
		english = sc.nextInt();
		
		System.out.println("Enter a Hindi Marks : ");
		hindi = sc.nextInt();
		
		System.out.println("Enter a Gujrati Marks : ");
		gujrati = sc.nextInt();
		
	}
	public void display() {
		sum = english+hindi+gujrati;
		per = (sum*100)/300;
		System.out.println("Percentage ="+per);
		System.out.print("\nGrade = ");
		if (per<=40) {
			System.out.println("You are Fail");
		}
		else if (per>=41&&per<=50) {
			System.out.print("DD");
		}
		else if (per>=51&&per<=60) {
			System.out.print("CD");
		}
		else if (per>=61&&per<=70) {
			System.out.print("BD");
		}
		else if (per>=71&&per<=80) {
			System.out.print("BB");
		}
		else if (per>=81&&per<=90) {     
			System.out.print("AB");
		}
		else if (per>=91&&per<=100) {
			System.out.print("AA");
		}
	}
}
public class Q21 {
		public static void main(String[] args) {
			marks m = new marks();
			m.input();
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			m.display();
		}
}
