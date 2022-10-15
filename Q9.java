/*Create a class to print an integer and a character with two methods having 
the same name but different sequence of the integer and the character 
parameters. For example, if the parameters of the first method are of the 
form (int n, char c), then that of the second method will be of the form 
(char c, int n).*/
package Module2;

class printinfo{
	public void method(int n,char c) {
		System.out.println("Integer ="+n);
		System.out.println("Character ="+c);
	}
	public void method(char c,int n) {
		System.out.println("Character ="+c);
		System.out.println("Integer ="+n);
  }
}
public class Q9 {
	public static void main(String[] args) {
		printinfo obj = new printinfo();
		System.out.println("\n:::::::::Method 1::::::::\n");
		obj.method(21, 'c');
		
		System.out.println("\n:::::::::Method 2::::::::::");
		obj.method('c', 22);
	}
}
