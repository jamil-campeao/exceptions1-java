package application;

import java.util.Scanner;

import entities.Funcionario;

public class CalculoFuncionario {

	public static void main(String[] args) {
		double porcentagem;
		
		Funcionario funcionario = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do funcionário: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Digite o salário bruto do funcionário: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Digite o valor de imposto deste funcionário: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + funcionario.nome + ", R$ " + funcionario.calcularSalario());
		
		System.out.print("Digite a porcentagem para aumentar o salário bruto do funcionário: ");
		porcentagem = sc.nextDouble();
		
		funcionario.aumentarSalario(porcentagem);
		
		System.out.println("Dados atualizados: Funcionário: " + funcionario.nome +", R$ " + funcionario.calcularSalario());
		
		sc.close();

	}

}
