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
		//A heran�a � uma rela��o do tipo "� um"
		//Por isso a atribui��o a seguir � v�lida j� que uma BusinessAccount "� uma" Account
		
		//acc = bacc;
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Anna", 0.0, 200.0);
		
		System.out.println(acc);
		//System.out.println(acc2);
		//System.out.println(acc3);
		
		//DOWNCASTING
		
		//acc2 foi declarada como Account. Ela � objeto Account independente do que tenha sido colocado
		//dentro dela. Assim, quando fizermos:
		//BusinessAcount acc4 = acc2; 
		//vai dar erro
		//Portanto, nesse caso, o downcasting tem que ser manual
		

		BusinessAcount acc4 = (BusinessAcount)acc2; //forma correta de se fazer um downcasting
		acc4.loam(100.0);
		
		 /*Aqui, acc3 n�o � um BusinessAcount, por�m o compilador n�o "sabe". 
		   O downcasting n�o aconter�. 
		   O erro vai aparecer em tempo de execu��o*/
		
		//BusinessAcount acc5 = (BusinessAcount)acc3;
		
		/*
		 * Para resolver esse problema, vamos fazer uso da comando instandeof
		 * dentro de um la�o for
		 * O isntaceof vai checar se os objetos s�o do mesmo tipo
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
