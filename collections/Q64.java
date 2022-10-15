/* Write a Java program to replace the second element of an ArrayList with 
the specified element.*/
package Module2.collections;

import java.util.ArrayList;

public class Q64 {
		public static void main(String[] args) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			
			System.out.println(list);
			list.set(1, 6);
			System.out.println("After Replace : "+list);
		}
}
