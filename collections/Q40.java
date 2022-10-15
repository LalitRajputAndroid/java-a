/* Write a Java program to create a new array list, add some colours (string) 
and print out the collection.*/
package Module2.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q40 {
	public static void main(String[] args) {
		ArrayList<String> colour = new ArrayList<String>();
		colour.add("Black");
		colour.add("White");
		colour.add("Red");
		colour.add("Blue");
		System.out.println("Colour : "+colour);
		
	}
}