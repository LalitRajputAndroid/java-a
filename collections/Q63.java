/* Write a Java program to increase the size of an array list.
*/
package Module2.collections;

import java.util.ArrayList;
import java.util.List;

public class Q63 {
		public static void main(String[] args) {
			ArrayList aList = new ArrayList<>();
			aList.add(1);
			aList.add(2);
			aList.add(3);
			aList.add(4);
			
			System.out.println(aList);
//		    aList.ensureCapacity(6);
		    aList.add(5);
		    aList.add(6);
		    aList.add(7);
		    
		    System.out.println(aList);
		}
}
