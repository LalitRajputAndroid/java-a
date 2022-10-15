//W.A.J.P to compare a given string to the specified character sequence.
//Comparing topsint.com and topsint.com: true Comparing Topsint.com
//and topsint.com: false
package Module2;

public class Q3 {
	public static void main(String[] args) {
			String s1 = "topsint.com",s2 = "topsint.com"; 
			String s3 = "Topsint.com",s4 = "topsint.com";
			
			System.out.println("Compare String topsint.com and topsint.com : "+s1.contentEquals(s2));
			System.out.println("Compare String Topsint.com and topsint.com : "+s3.contentEquals(s4));
	}
}
