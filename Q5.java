// W.A.J.P to check whether a given string starts with the contents of 
//another string. Red is favourite color. Starts with Red? True Orange is also 
//my favorite color. Starts with Red? False I3.
package Module2;

public class Q5 {
	public static void main(String[] args) {
		String s1 = "Red is favourite color", s2 = "Red";
		String s3 = "Orange is also my favorite color",s4 = "Red";
		
		System.out.println("String 1 = "+s1);
		System.out.println("String 2 = "+s2);
		
		System.out.println("Result 1 : "+s1.startsWith(s2));
		System.out.println("Result 2 : "+s3.startsWith(s4));
	}
}
