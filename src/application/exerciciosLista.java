package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag;

import entities.listaFuncionarios;

public class exerciciosLista {

	public static void main(String[] args) {
		//FUNCIONARIOS
		Integer N, i, id;
		String nome;
		Double salario, porcentagem;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos funcionários serão registrados? ");
		N = sc.nextInt();
		
		List<listaFuncionarios> list = new ArrayList<>();
		
		for(i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i+1));
			System.out.print("Id: ");
			id = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			
			System.out.print("Salario: ");
			salario = sc.nextDouble();
			
			listaFuncionarios lf = new listaFuncionarios(id, nome, salario);
			
			list.add(lf);
		}
		
		System.out.print("Entre com o id do funcionário que terá o salário aumentado: ");
		int idProcurado = sc.nextInt();
		
		listaFuncionarios lf = list.stream().filter(lista -> lista.getId() == idProcurado).findFirst().orElse(null);
		
		if (lf != null) {
			System.out.print("Entre com a porcentagem de aumento: ");
			porcentagem = sc.nextDouble();
			lf.aumentarSalario(porcentagem);
		}
		else {
			System.out.println("Esse ID não existe");
		}
		
		for(listaFuncionarios lfunc : list) {
			System.out.println(lfunc.toString());
		}
		
		sc.close();

	}

}
