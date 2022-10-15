/* Write a Java program to copy one array list into another.*/
package Module2.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Q48 {
		public static void main(String[] args) {
			ArrayList list1 = new ArrayList<>();
			 list1.add(5);
			 list1.add(3);
			 list1.add(2);
			 list1.add(1);
			 list1.add(4);
			 Collections.sort(list1);
			 System.out.println(list1);
			 
			 ArrayList list2 = new ArrayList<>(); 
				list2.add("REd");
				list2.add("Blue");
				list2.add("Orange");
				list2.add("White");
				list2.add("Green");
				
			System.out.println(list2);
			Collections.copy(list1, list2);
			
			System.out.println("! After Copy Arraylist !");
			
			System.out.println("list 1 : "+list1);
			System.out.println("list 2 : "+list2);
		}
}
