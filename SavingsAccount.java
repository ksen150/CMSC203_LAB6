
public class SavingsAccount extends BankAccount {
	
		private double rate = 0.025; 
		private int savingsNumber = 0; 
		private String accountNumber; 
		
		public SavingsAccount(String name, double amount)
		{
			super(name, amount);
			this.accountNumber = super.getAccountNumber()+ "-" + savingsNumber;
			savingsNumber++;
		}
		
		public SavingsAccount(SavingsAccount oldAccount, double amount)
		{
			super(oldAccount, amount);
			savingsNumber++;
			this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		}

		public void postInterest()
		{
			deposit(getBalance()*(rate/12));
		}
		
		public String getAccountNumber()
		{
			return accountNumber;
		}
		
		
}
