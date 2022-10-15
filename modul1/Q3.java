package Module1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Year : ");
		year = sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("Leap Year");
		}
		else if (year%400==0)
		{
			System.out.println("Leap Year");
		}
		else if (year%100==0)
		{
			System.out.println("Not Leap ");
		}
		else
		{
			System.out.println("Not Leap");
		}
	}
}
