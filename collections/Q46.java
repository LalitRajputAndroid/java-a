/* Write a Java program to search an element in an array list.*/
package Module2.collections;

import java.util.ArrayList;

public class Q46 {
		public static void main(String[] args) {
			ArrayList list = new ArrayList<>();
			list.add("Black");
			list.add("White");
			list.add("Red");
			list.add("Blue");
			
			System.out.println(list.contains("Red"));
		}
}
