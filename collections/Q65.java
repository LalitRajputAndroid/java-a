/* Write a Java program to print all the elements of an ArrayList using the 
position of the elements.*/
package Module2.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Q65 {
		public static void main(String[] args) {
			ArrayList<String> colour = new ArrayList<String>();
			colour.add("Black");
			colour.add("White");
			colour.add("Red");
			colour.add("Blue");
			
			System.out.println(colour);
			
			Iterator<String> itr = colour.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
}
