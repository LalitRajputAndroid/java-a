/* Create an abstract class 'Bank' with an abstract method 'getBalance'. 
$100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a 
method named 'getBalance'. Call this method by creating an object of 
each of the three classes*/
package Module2;
abstract class Bank{
	abstract void getBalance();
}
class BankA extends Bank {
	public void getBalance() {
		System.out.println("100$");
	}
}
class BankB extends Bank {
	public void getBalance() {
		System.out.println("150$");
	}
}
class BankC extends Bank {
	public void getBalance() {
		System.out.println("200$");
	}
}
public class Q17 {
	public static void main(String[] args) {
		BankA a = new BankA();
		a.getBalance();
		
		BankB b = new BankB();
		b.getBalance();
		
		BankC c = new BankC();
		c.getBalance();
	}
}
