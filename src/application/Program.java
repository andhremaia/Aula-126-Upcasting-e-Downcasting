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
		
		//acc = bacc;
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Anna", 0.0, 200.0);
		
		System.out.println(acc);
		//System.out.println(acc2);
		//System.out.println(acc3);
		
		//DOWNCASTING
		
		//acc2 foi declarada como Account. Ela é objeto Account independente do que tenha sido colocado
		//dentro dela. Assim, quando fizermos:
		//BusinessAcount acc4 = acc2; 
		//vai dar erro
		//Portanto, nesse caso, o downcasting tem que ser manual
		

		BusinessAcount acc4 = (BusinessAcount)acc2; //forma correta de se fazer um downcasting
		acc4.loam(100.0);
		
		 /*Aqui, acc3 não é um BusinessAcount, porém o compilador não "sabe". 
		   O downcasting não aconterá. 
		   O erro vai aparecer em tempo de execução*/
		
		//BusinessAcount acc5 = (BusinessAcount)acc3;
		
		/*
		 * Para resolver esse problema, vamos fazer uso da comando instandeof
		 * dentro de um laço for
		 * O isntaceof vai checar se os objetos são do mesmo tipo
		 * */
		
		if (acc3 instanceof BusinessAcount) {
			BusinessAcount acc5 = (BusinessAcount)acc3;
			acc5.loam(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}	
