// Write a Java program that takes the user to provide a single character 
//from the alphabet. Print Vowel or Consonant, depending on the user 
//input. If the user input is not a letter (between a and z or A and Z), or is a 
//string of length > 1, print an error message.
package Module1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		char input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a any Alphabet :");
		input = sc.next().charAt(0);
		if (input=='a'||input=='e'||input=='i'||input=='o'||input=='u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}

}
