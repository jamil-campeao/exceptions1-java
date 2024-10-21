package application;

import java.util.Scanner;

import entities.Products;
import entities.ProductsVetor;

public class Vetor {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		//Ler a altura de N pessoas e fazer a media aritmetica das alturas
//		int n = sc.nextInt();
//		double soma = 0;
//		
//		double[] vect = new double[n];
//		
//		for(int i=0; i<n; i++) {
//			vect[i] = sc.nextDouble();
//			soma += vect[i];
//		}
//		double media = soma / n;
//		
//		System.out.printf("Media de alturas: %.2f%n", media);
		
//		sc.close();
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero de repeticoes para setar o for: ");
		int n = sc.nextInt();
		double soma = 0;
		ProductsVetor[] vect = new ProductsVetor[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do produto: ");
			String name = sc.nextLine();
			System.out.print("Digite o preço do produto: ");
			double price = sc.nextDouble();
			
			vect[i] = new ProductsVetor(name, price);
			
			soma += vect[i].getPrice();
		}
		
		double media = soma / vect.length;
		System.out.printf("Preço médio: %.2f%n", media);
		
		sc.close();
	}

}
