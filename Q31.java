/* W.A.J.P to create a class Student with attributes roll no, name, age and 
course. Initialize values through parameterized constructor. If age of 
student is not in between 15 and 21 then generate user defined exception 
"AgeNotWithinRangeException". If name contains numbers or special 
symbols raise exception "NameNotValidException". Define the two 
exception classes.*/
package Module2;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

class Student{
	int roll_no;
	String name;
	int age;
	String course;
	  Student(int roll_no , String name , int age , String course) {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.course = course;
		
		if(age<15||age>21) {
			throw new ArithmeticException("AgeNotWithinRangeException");
		}
		else {
			System.out.println("Your Age = "+age);
		}
		if(name=="lalit") {
			throw new ArrayIndexOutOfBoundsException("Name not valid ");
		}else {
			System.out.println("Your Name is : "+name);
		}
	}
}
public class Q31 {
	public static void main(String[] args) {
		int age;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age : ");
		age = sc.nextInt();
		
		System.out.println("Enter your Name : ");
		name = sc.next();
		Student obj = new Student(0, name, age, null);
	}
}
  