package application;

import java.util.Scanner;

import entities.Aluno;

public class CalculoMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.print("Digite o nome do Aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Digite as 3 notas do trimestre do(a) estudante");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		System.out.println("NOTA FINAL: " + aluno.calculaMedia());
		
		if (aluno.calculaMedia() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTOU %.2f PONTOS", 60.0 - aluno.calculaMedia());
		}
		else {
			System.out.println("APROVADO");
		}
		
		sc.close();

	}

}
