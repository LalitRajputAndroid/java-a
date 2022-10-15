/* Write a Java program to update specific array element by given element.
*/
package Module2.collections;

import java.util.ArrayList;

public class Q44 {
		public static void main(String[] args) {
			ArrayList list = new ArrayList<>(); 
			list.add("REd");
			list.add("Blue");
			list.add("Orange");
			
			System.out.println(list);
			list.add(1,"Black");
			System.out.println(list);
		}
}
