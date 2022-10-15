/* Create an abstract class 'Parent' with a method 'message'. It has two 
subclasses each having a method with the same name 'message' that 
prints "This is first subclass" and "This is second subclass" respectively. 
Call the methods 'message' by creating an object for each subclass.*/
package Module2;
abstract class parent{ 
	abstract void massage();
}
class child_class1 extends parent{
	public void massage(){
		System.out.println("The is first subclass");
	}
}
class child_class2 extends parent{
	public void massage(){
		System.out.println("The is second subclass");
	}
}
public class Q16 {
	public static void main(String[] args) {
		child_class1 c1 = new child_class1();
		c1.massage();
		
		child_class2 c2 = new child_class2();
		c2.massage();
	}
}
