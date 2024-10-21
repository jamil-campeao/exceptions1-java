package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.AccountHeranca;
import entities.BusinessAccountHeranca;
import entities.SavingsAccountHeranca;

public class ClassesAbstratas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List <AccountHeranca> list = new ArrayList<>();
		
		list.add(new SavingsAccountHeranca(1001, "Jamil", 500.0, 0.01));
		list.add(new BusinessAccountHeranca(1002, "Lucas", 1000.0, 400.0));
		list.add(new SavingsAccountHeranca(1003, "Bob", 300.0, 0.01));
		list.add(new BusinessAccountHeranca(1004, "Mario", 2000.0, 900.0));
		
		
		double soma = 0.0;
		
		for(AccountHeranca acc : list) {
			soma += acc.getBalance();
		}
		
		System.out.printf("Total dos saldos das contas: %.2f%n", soma);
		
		for(AccountHeranca acc : list) {
			acc.deposit(10.0);
		}
		
		for(AccountHeranca acc : list) {
			System.out.printf("Saldo atualizado da conta %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
