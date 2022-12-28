package aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Account: SuperClass
		 * BusinessAccount e SavingsAccount: classes secundarias
		 */
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		
		Account acc1 = bacc; 
		
		//Variavel do tipo Account sendo instanciada como BusinessAccount or SavingsAccount
		//nesse caso é aceito pois Account é superclass de BusinessAccount
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		
		// DOWNCASTING
		
		/*
		 * DESSE MODO NÃO É ACEITO. variavel do tipo BusinessAccount (secudanria) recebendo
		 * intanciação da superClasse (Account)
		 * 
		 * BusinessAccount baccTest = new Account (101, "Alex gray", 0.0);
		 */
		
		// o DOWNCASTING deve ser feito assim
		
		//acc2 é superClass
		BusinessAccount bcc1 = (BusinessAccount)acc2;
		
		/*
		 * BusinessAccount acc5 = (BusinessAccount)acc3;
		 * não é possivel pois acc3 não é subclass de BusinessAccount
		 */
		
		if (acc2 instanceof Account) {
			System.out.println("Account");
		}else {
			System.out.println("bu");
		}
		
		
		
		

	}

}
