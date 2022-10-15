/* Create a class named 'Member' having the following members:
Data members 
Name
Age
Phone number
Address 5 - Salary
It also has a method named 'printSalary' which prints the salary of the 
members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 
'Employee' and 'Manager' classes have data members 'specialization' and 
'department' respectively. Now, assign name, age, phone number, 
address and salary to an employee and a manager by making an object of 
both of these classes and print the same.*/
package Module2;

import java.util.Scanner;

class Member{
  
	public Member() {
		
	} 
	public void printsalary(double salary) {
		
		System.out.println("Salary ="+salary);
	}
}
class Employee extends Member{
	
	public void printinfo(String name,int age,long phone_number,String address,double salary) {

		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);
		System.out.println("Employee Phone number : "+phone_number);
		System.out.println("Employee Address : "+address);
		
	}
}
class Manager extends Member{
	
	public void printinfo(String name,int age,long phone_number,String address,double salary) {
		
		System.out.println("Manager Name : "+name);
		System.out.println("Manager Age : "+age);
		System.out.println("Manager Phone number : "+phone_number);
		System.out.println("Manager Address : "+address);
		
	}
		
}
public class Q12 {
	public static void main(String[] args) {
			Employee obj1 = new Employee();
			Scanner sc = new Scanner(System.in);
			String name;
			int age;
			long phone_number;
			String address;
			double salary;
			
			System.out.println("Enter Employee Name = ");
			name = sc.next();
			System.out.println("Enter Employee Age = ");
			age = sc.nextInt();
			System.out.println("Enter Employee Phone number = ");
			phone_number = sc.nextLong();
			System.out.println("Enter Employee Address = ");
			address = sc.next();
			System.out.println("Enter Employee Salary = ");
			salary = sc.nextDouble();
			
			System.out.println("\n\n:::::::::::::::::::::::::!! Employee Detail !!:::::::::::::::::::::::\n\n");
			obj1.printinfo(name, age, phone_number, address, salary);
			obj1.printsalary(salary);
			
			System.out.println("\n\n");
			
			Manager obj2 = new Manager();
			System.out.println("Enter Manager Name = ");
			name = sc.next();
			System.out.println("Enter Manager Age = ");
			age = sc.nextInt();
			System.out.println("Enter Manager Phone number = ");
			phone_number = sc.nextLong();
			System.out.println("Enter Manager Address = ");
			address = sc.next();
			System.out.println("Enter Manager Salary = ");
			salary = sc.nextDouble();
			
			System.out.println("\n\n:::::::::::::::::::::::::!! Manager Detail !!:::::::::::::::::::::::\n\n");
			obj2.printinfo(name, age, phone_number, address, salary);
			obj2.printsalary(salary);
	}
}
