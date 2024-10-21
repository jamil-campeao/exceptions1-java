package application;

import entities.AccountHeranca;
import entities.BusinessAccountHeranca;
import entities.SavingsAccountHeranca;

public class Heranca {

	public static void main(String[] args) {
//		AccountHeranca acc = new AccountHeranca(1001, "Jamil", 0.00);
		BusinessAccountHeranca bacc = new BusinessAccountHeranca(1002, "João", 0.00, 500.00);
		
		
		//UPCASTING
		AccountHeranca acc1 = bacc;
		AccountHeranca acc2 = new BusinessAccountHeranca(1003, "Luiz", 0.0, 200.0);
		AccountHeranca acc3 = new SavingsAccountHeranca(1004, "Ana", 0.0, 0.01);
		
		
		//DOWNCASTING
		BusinessAccountHeranca acc4 = (BusinessAccountHeranca) acc2;
		acc4.loan(100.0);
		
		
		if (acc3 instanceof BusinessAccountHeranca) {
			BusinessAccountHeranca acc5 = (BusinessAccountHeranca) acc3;
			acc5.loan(200.0);
			System.out.println("Emprestado!");
			
		}
		
		if (acc3 instanceof SavingsAccountHeranca) {
			SavingsAccountHeranca acc5 = (SavingsAccountHeranca) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}

}
