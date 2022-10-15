/* Write a Java program to shuffle elements in an array list.
*/
package Module2.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Q49 {
		public static void main(String[] args) {
			 ArrayList list = new ArrayList<>(); 
				list.add("REd");
				list.add("Blue");
				list.add("Orange");
				list.add("White");
				list.add("Green");
				
				System.out.println(list);
				Collections.shuffle(list);
				System.out.println("After shuffle elements : "+list);
		}
}
