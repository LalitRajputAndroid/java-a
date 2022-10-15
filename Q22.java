/* Create a class named 'Shape' with a method to print "This is this is shape". 
Then create two other classes named 'Rectangle', 'Circle' inheriting the 
Shape class, both having a method to print "This is rectangular shape" and 
"This is circular shape" respectively. Create a subclass 'Square' of 
'Rectangle' having a method to print "Square is a rectangle". Now call the 
method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/
package Module2;
class shape{
	public void shap() {
		System.out.println("This is Shape");
	}
}
class Rectangle1 extends shape{
	public void Rec() {
		System.out.println("This is rectangular Shape");
	}
}
class Circle extends shape{
	public void circ() {
		System.out.println("This is Circular  Shape");
	}
}
class Square1 extends Rectangle1{
	public void Squa() {
		System.out.println("Square is a rectanguler Shape");
	}
}
public class Q22 {
		public static void main(String[] args) {
			Square1 obj = new Square1();
			obj.Rec();
			obj.shap();
		}
}
