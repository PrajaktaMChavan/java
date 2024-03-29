package inter;

public class ATM implements Bank {
	int balance=10000;

	@Override
	public void withdraw(int a) {
		System.out.println(a+" withdrawl successfully");
		balance-=a;
		System.out.println("Avl.Balance :-"+balance);
		
	}

	@Override
	public void deposit(int a) {
		System.out.println(a+" withdrawl successfully");
		balance+=a;
		System.out.println("Avl.Balance :-"+balance);
		
	}

	@Override
	public void checkbalance() {
		System.out.println("Avl.Balance:- "+balance);
		
	}
	public static void main(String[] args) {
		ATM a1= new ATM();
		a1.checkbalance();
		a1.withdraw(3500);
		a1.deposit(5000);
	}

}
