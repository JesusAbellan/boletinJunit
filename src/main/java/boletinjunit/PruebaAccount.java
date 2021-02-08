package boletinjunit;

public class PruebaAccount {
	public static void main(String[] args) {
		Account a = new Account("Pepe", 123456789, 3500);
		System.out.println(a);
		
		a.addInterest();
		a.addInterest();
		System.out.println(a);
		
		a.deposit(200.10f);
		System.out.println(a);
		
		a.withdraw(100, 100);
		System.out.println(a);
	}
}
