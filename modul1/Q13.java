/* Write a Java program to print numbers between 1 to 100 which are 
divisible by 3, 5 and by both.*/
package Module1;

public class Q13 {
	public static void main(String[] args) {
		int i;
		System.out.println("Divisible by 3, 5 and both : ");
		for(i=1;i<=100;i++){
			
			if(i%3==0 || i%5==0 || i%3==0 && i%5==0){
				
				System.out.println(i);
			}
		}
	}
}
  