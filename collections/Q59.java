/* Write a Java program to join two array lists.
*/
package Module2.collections;

import java.util.ArrayList;

class join{
	public void array_list() {
		ArrayList list = new ArrayList<>();
		list.add(120);
		list.add(200);
		list.add("Name");
		
		System.out.println("1st Array list : "+list);
		
		ArrayList List = new ArrayList<>();
		List.add("India");
		List.add(91);
		List.add(100);
		
		System.out.println("2nd Array list : "+List);
		
		ArrayList j = new ArrayList<>();
		j.addAll(list);
		j.addAll(List);
		
		System.out.println("Join Aarray list : "+j);
	}
}
public class Q59 {
		public static void main(String[] args) {
			join obJ = new join();
			obJ.array_list();
		}
}
