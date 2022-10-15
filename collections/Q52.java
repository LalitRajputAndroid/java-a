/* Write a Java program to get the number of elements in a hash set.
*/
package Module2.collections;

import java.util.HashSet;

public class Q52 {
		public static void main(String[] args) {
			HashSet set = new HashSet<>();
			set.add('c');
			set.add("C++");
			set.add("html");
			set.add("CSS");
			set.add("java");
			
			System.out.println("Hash Set Elements : "+set);
			System.out.println("Number of Elements : "+set.size());
		}
}
