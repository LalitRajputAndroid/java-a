/*Create a class named 'Rectangle' with two data members 'length' and 
'breadth' and two methods to print the area and perimeter of the 
rectangle respectively. Its constructor having parameters for length and 
breadth is used to initialize the length and breadth of the rectangle. Let 
class 'Square' inherit the 'Rectangle' class with its constructor having a 
parameter for its side (suppose s) calling the constructor of its parent class 
as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.*/
package Module2;

class Rectangle2{
	int lenght , breadth,ans;
	Rectangle2(int lenght,int breadth){
		this.lenght= lenght;
		this.breadth= breadth;
	}
	public void area() {
		ans = lenght + breadth;
		System.out.println("Rectangle of Area : "+ans);
	}
	public void perimeter() {
		   ans = 2*(lenght+breadth);
		   System.out.println("Rectangle a perimeter : "+ans);
	}
}
class square extends Rectangle2{

	square(int lenght, int breadth) {
		super(lenght,breadth);
	}
	
}

public class Q13 {
	public static void main(String[] args) {
		square obj = new square(10, 12);
		obj.area();
		obj.perimeter();
	}
}
