/* Create a class named 'PrintNumber' to print various numbers of different 
data types by creating different methods with the same name 'printn' 
having a parameter for each data type.*/
package Module2;
class Print_number{
	Print_number(String name,int age) {
		System.out.println("Name ="+name);
		System.out.println("Age ="+age);
	}
}
public class Q8 {
	public static void main(String[] args) {
	Print_number obj = new Print_number("Lalit",21);
	}
}
