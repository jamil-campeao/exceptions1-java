package application;

import java.util.Scanner;

import entities.BancoUsuarios;

public class SistemaBanco {

	public static void main(String[] args) {
		int conta;
		char depositoInicial;
		String nome;
		double deposito, saldo = 0;
		BancoUsuarios bu;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número da conta: ");
		conta = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Digite o titular da conta: ");
		nome = sc.nextLine();
		
		System.out.print("Deseja fazer um deposito inicial? (s/n): ");
		depositoInicial = sc.next().charAt(0);
		
		if (depositoInicial == 's') {
			System.out.print("Digite o valor do deposito inicial: ");
			deposito = sc.nextDouble();
			bu = new BancoUsuarios(conta, nome, saldo);
			bu.adicionarSaldo(deposito);
		}
		else {
			bu = new BancoUsuarios(conta, nome);
		}
		
		System.out.println("Dados da Conta:");
		System.out.println(bu);
		
		
		System.out.print("Digite um valor para depositar: ");
		deposito = sc.nextDouble();
		if (deposito > 0) {
			bu.adicionarSaldo(deposito);
		}
		
		System.out.println("Dados atualizados: " + bu);
		
		System.out.print("Digite um valor para sacar: ");
		deposito = sc.nextDouble();
		if (deposito > 0) {
			bu.retirarSaldo(deposito);	
		}
		
		System.out.println("Dados atualizados: " + bu);
		
		sc.close();

	}

}
