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
		sb.append(" " + loamLimit + "\n");
		return sb.toString();
		
				
	}
	
}
