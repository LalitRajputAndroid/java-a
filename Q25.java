/* W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by 
zero exception and another one is to handle 
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;*/
package Module2;

public class Q25 {
		public static void main(String[] args) {
			
			int a[] = new int [5];
			try {
				try {
					
					a[5] = 30/0;
					
				} catch (ArithmeticException e) {
					
					System.out.println("Any number not divide by zero");
				}
				
				System.out.println(a[5]);
				
			}catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("Array index out of Bounds ");
			}
		}		
}

     