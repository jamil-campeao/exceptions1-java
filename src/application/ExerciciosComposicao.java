package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ExerciciosComposicao {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nomeDepartamento, nomeTrabalhador, nivel, mesAno;
		double salarioBase, valorHora;
		int N, i, duracao;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataContrato;
		
		do {
			System.out.print("Entre com o nome do Departamento: ");
			nomeDepartamento = sc.nextLine();
			
			if (nomeDepartamento == "") {
				System.out.println("Departamento é um campo obrigatório");
			}
		} while (nomeDepartamento == "");

		System.out.println("Entre com os dados do trabalhador: ");
		
		System.out.print("Nome: ");
		nomeTrabalhador = sc.nextLine();
		
		System.out.print("Nivel: ");
		nivel = sc.nextLine();
		
		System.out.print("Salário Base: ");
		salarioBase = sc.nextDouble();
		
		//Instanciação do objeto Worker
		Worker worker = new Worker(nomeTrabalhador, WorkerLevel.valueOf(nivel),salarioBase, new Department(nomeDepartamento));
		
		System.out.print("Quantos contratos para esse trabalhador? ");
		N = sc.nextInt();
		
		for(i = 0; i < N; i++) {
			System.out.println("Entre com os dados do contrato #" + (i+1) + ":");
			
			System.out.print("Data (DD/MM/YYYY): ");
			dataContrato = sdf.parse(sc.next());
			
			System.out.print("Valor por hora: ");
			valorHora = sc.nextDouble();
			
			System.out.print("Duração (horas): ");
			duracao = sc.nextInt();
			
			HourContract contract = new HourContract(dataContrato, valorHora, duracao);
			worker.addContract(contract);
		}
		
		System.out.print("Entre com o Mês e ano para calcular o total (MM/YYYY): ");
		mesAno = sc.next();
		int month = Integer.parseInt(mesAno.substring(0,2));
		int year = Integer.parseInt(mesAno.substring(3));
		
		
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Renda em " + mesAno + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		
		sc.close();

	}

}
