/* Create a class with a method that prints "This is a parent class" and its 
subclass with another method that prints "This is child class". Now, create 
an object for each of the class and call 1 - method of parent class by object 
of parent class 2 - method of child class by object of child class 3 - method 
of parent class by object of child class*/
package Module2;

class classA{
	public void print1() {
		System.out.println(" This is parent class ");
	}
}

class ClassB extends classA {
	public void print2() {
		System.out.println(" This is a child class ");
	}
}

class ClassC extends ClassB{
	public void print3() {
		System.out.println(" This is a chld class ");
	}
}
public class Q11 {
	public static void main(String[] args) {
		ClassC obj = new ClassC();
		
		obj.print1();
		obj.print2();
		obj.print3();
		
	}
}
