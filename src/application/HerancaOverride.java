package application;

import entities.AccountHeranca;
import entities.BusinessAccountHeranca;
import entities.SavingsAccountHeranca;

public class HerancaOverride {

	public static void main(String[] args) {
//		AccountHeranca acc1 = new AccountHeranca(1001, "Alex", 1000.0);
//		acc1.withdraw(200.0);
//		System.out.println("Saldo conta normal: " + acc1.getBalance());
//		
//		AccountHeranca acc2 = new SavingsAccountHeranca(1002, "Maria", 1000.0, 0.01);
//		acc2.withdraw(200);
//		System.out.println("Saldo conta poupança: " + acc2.getBalance());
//		
//		
//		AccountHeranca acc3 = new BusinessAccountHeranca(1003,"Lucas", 1000.0, 500.0);
//		acc3.withdraw(200.0);
//		System.out.println("Saldo conta empresarial: " + acc3.getBalance());
		
//		AccountHeranca x = new AccountHeranca(1020, "Alex", 1000.0);
		
		AccountHeranca y = new SavingsAccountHeranca(1023, "Maria", 1000.0, 0.01);
		
//		x.withdraw(50.0);
		y.withdraw(50.0);
		
//		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		

	}

}
