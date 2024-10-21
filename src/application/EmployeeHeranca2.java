package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.OtsourcedEmplyeeHeranca;
import entities.EmployeeHeranca;

public class EmployeeHeranca2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int n, i, horas;
		double valorPorHora, valorAdicional;
		char terceirizado;
		String nome;
		
		Scanner sc = new Scanner(System.in);
		List<EmployeeHeranca> list = new ArrayList<>();
		
		System.out.print("Entre com a quantidade funcionários: ");
		n = sc.nextInt();
		
		for(i=1; i <= n; i++) {
			System.out.println("Dados Funcionário #" + i + ":");
			System.out.print("Tercerizado? (S/N): ");
			terceirizado = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Nome: ");
			nome = sc.nextLine();
			
			System.out.print("Horas: ");
			horas = sc.nextInt();
			
			System.out.print("Valor por hora: ");
			valorPorHora = sc.nextDouble();
			
			if (terceirizado == 'S') {
				System.out.print("Valor adicional: ");
				valorAdicional = sc.nextDouble();
				EmployeeHeranca emp = new OtsourcedEmplyeeHeranca(nome, horas, valorPorHora, valorAdicional);
				list.add(emp);
			}
			else {
				list.add(new EmployeeHeranca(nome, horas, valorPorHora)); //Outra forma de adicionar os valores na lista.
			}
			
		}
		
		System.out.println();
		
		System.out.println("Pagamentos: ");
		
		for(EmployeeHeranca emp : list) {
			System.out.println(emp.getName() + " - R$ " + String.format("%.2f", emp.payment()));
		}
		
		
		
		
		sc.close();

	}

}
