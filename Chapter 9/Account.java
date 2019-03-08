// Zack Friedman 2/27/19
/* UML Diagram:
-----------------------
	    Account
-----------------------
-id: int
-balance: double
-annualInterestRate: double
-dateCreated: Date
-----------------------
+Account()
+Account(newId: int, newBalance: double)
+getId(): int
+getBalance(): double
-----------------------
*/

class Account {
	private int id = 0;
	private double balance = 0.0;
	private static double annualInterestRate = 0.0;
	private java.util.Date dateCreated;
	
	public Account() {
		dateCreated = new java.util.Date();
	} // account end
	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new java.util.Date();
	} // account end
	public int getId() {
		return this.id;
	} // getId end
	public double getBalance() {
		return this.balance;
	} // getBalance end
	public double getAnnualInterestRate() {
		return annualInterestRate;
	} // getAnnualInterestRate end
	public void setId(int newId) {
		id = newId;
	} // setId end
	public void setBalance(double newBalance) {
		balance = newBalance;
	} // setBalance end
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	} // setAnnualInterestRate end
	public double getMonthlyInterest() {
		return balance * (annualInterestRate / 1200);
	} // getMonthlyInterestRate end
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	} // getMonthlyInterest end
	public double withdraw(double amount) {
		balance = balance - amount;
		return balance;
	} // withdraw end
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	} // deposit end
	public java.util.Date date() {
		return dateCreated;
	} // date end
}