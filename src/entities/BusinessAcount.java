package entities;

public class BusinessAcount extends Account {  
	
	private Double loamLimit;
	
	public BusinessAcount() {
		super();
	}

	public BusinessAcount(Integer number, String holder, Double balance, Double loamLimit) {
		super(number, holder, balance);
		this.loamLimit = loamLimit;
	}
	
	public void loam(double amount) {
		if (amount <= loamLimit) {
			//deposit(amount);
			balance += amount - 10.0;
		}
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
		sb.append("Loam limit: ");
		sb.append(loamLimit + "\n");
		return sb.toString();
	}
}
