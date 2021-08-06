package entities;

public class SavingAccount extends Account {
	
	private Double interestRate;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public String toString() {		
			StringBuilder sb = new StringBuilder();
			sb.append("Conta: ");
			sb.append(number + "\n");
			sb.append("Holder: ");
			sb.append(holder + "\n");
			sb.append("Balance: ");
			sb.append(balance + "\n");
			sb.append("Interes Rate: ");
			sb.append(interestRate + "\n");
			return sb.toString();
	}
}
