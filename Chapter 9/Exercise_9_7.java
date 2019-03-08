// Zack Friedman 2/27/19

public class Exercise_9_7 {
	public static void main(String[] args) {
		Account a = new Account();
		
		System.out.println("Account");
		System.out.print("\n");
		a.setId(1122);
		System.out.println("\tID: " + a.getId());
		a.setBalance(20000);
		System.out.println("\tBalance: $" + a.getBalance());
		a.setAnnualInterestRate(4.5);
		System.out.println("\tAnnual Interest Rate: " + a.getAnnualInterestRate() + "%");
		System.out.print("\n");
		a.withdraw(2500.00);
		System.out.println("\tWithdrew $2500.00");
		a.deposit(3000.00);
		System.out.println("\tDeposited $3000.00");
		System.out.print("\n");
		System.out.println("\tBalance: $" + a.getBalance());
		System.out.println("\tMonthly Interest: " + a.getMonthlyInterest());
		System.out.println("\tDate Account Created: " + a.date());
	} // main end
}