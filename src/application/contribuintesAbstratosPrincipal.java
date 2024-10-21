package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ContribuintesAbstratos;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class contribuintesAbstratosPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List <ContribuintesAbstratos> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de pagadores de imposto: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sc.nextLine(); //quebra de linha pendente
			System.out.println("Dados do pagador de imposto #" + i + ":");
			
			System.out.print("Pessoa física ou jurídica? (f/j) ");
			char tipoPessoa = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if (tipoPessoa == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
				
			} else {
				System.out.print("Numero de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));

			}
		}
		
		
		System.out.println();
		
		System.out.println("Impostos pagos:");
		double vSoma = 0;
		
		for(ContribuintesAbstratos c : list) {
			System.out.println(c.getNome() + ": R$ " +  String.format("%.2f", c.imposto()));
			vSoma += c.imposto();
			}
		
		System.out.println();
		System.out.println("Total de impostos: R$ " + String.format("%.2f", vSoma));
		
		
		sc.close();

	}

}
