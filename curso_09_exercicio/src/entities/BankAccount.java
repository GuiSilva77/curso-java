package entities;

public class BankAccount {
	private int accountNumber;
	private String name;
	private double balance;

	public BankAccount(int accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public BankAccount(int accountNumber, String name, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void withdraw(double withdrawValue) {
		if (balance < withdrawValue)
			return;

		double saqueTax = 5;

		balance -= withdrawValue + saqueTax;
	}

	public void deposit(double value) {
		balance += value;
	}

	@Override
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + name + ", Balance: "
				+ ((balance >= 0) ? String.format("R$ %.2f", balance) : String.format("-R$ %.2f", Math.abs(balance)))
				+ "\n";
	}
}
