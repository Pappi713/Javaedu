package tasks3;

public class BankAccount {
	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	
	private void deposit(float amount) throws NegativeAmount {
		if(amount < 0) {
			throw new NegativeAmount();
		}
		else {
			this.balance = this.balance + amount;
		}
	}
}
