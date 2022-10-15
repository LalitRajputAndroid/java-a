/* W.A.J.P to check whether a given string ends with the contents of another 
string. "Java Exercises" ends with "se"? False "Java Exercise" ends with 
"se"? True*/

package Module2;

public class Q4 {

	public static void main(String[] args) {
		String s = "Java Exercises",s1 = "se";
		
		System.out.println("Fast String = "+s);
		System.out.println("Second String = "+s1);
		
		System.out.println("Result 1:"+s.endsWith(s1));
		
		String s2 = "Java Exercise", s3 = "se";
		
		System.out.println("Result 2 :"+s2.endsWith(s3));
	}

}
