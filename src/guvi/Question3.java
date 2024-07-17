package guvi;
import java.util.Scanner;
class Account{
	Long balance;
	String bname;//Bank Account Name;
	public Account() {
		
	}
	public Account(Long balance,String bname) {
		this.balance=balance;
		this.bname=bname;
	}
	public void deposit(int amount) {
		this.balance=this.balance+amount;
	}
	public void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("Withdrawal amount is greater than balance amount:");
		}
		else
		{
			this.balance=this.balance-amount;
		}
		
	}
	public void display() {
		System.out.println("The amount balance in the Bank Account is:"+balance);
	}
}

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the initial balance in the account:");
		Long initialBalance=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Bank name:");
		String bname=sc.nextLine();
		Account account=new Account(initialBalance,bname);
		account.deposit(1000);
		account.display();
		account.withdraw(300);
		account.display();
			

	}

}
