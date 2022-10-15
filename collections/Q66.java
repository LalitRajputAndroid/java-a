/* Write a Java program to compare two sets and retain elements which are 
same on both sets.*/
package Module2.collections;

import java.util.HashSet;

public class Q66 {
		public static void main(String[] args) {
			HashSet<String> hSet = new HashSet<>();
			hSet.add("one");
			hSet.add("Two");
			hSet.add("Three");
			hSet.add("Four");
			
			System.out.println(hSet);
			
			HashSet<String> hSet1 = new HashSet<>();
			hSet1.add("one");
			hSet1.add("Two");
			hSet1.add("Five");
			hSet1.add("Four");
			
			System.out.println(hSet1);
			
			hSet.retainAll(hSet1);
			System.out.println(hSet );
		}
}
