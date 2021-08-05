package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		//Um objeto da classe especializada vai ser atribuida a um objeto da classe generalista
		//A herança é uma relação do tipo "é um"
		//Por isso a atribuição a seguir é válida já que uma BusinessAccount "é uma" Account
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Anna", 0.0, 200.0);
		
		System.out.println(acc);
		System.out.println(acc2);
		System.out.println(acc3);
	}
}	
