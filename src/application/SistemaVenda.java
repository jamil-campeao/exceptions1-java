package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class SistemaVenda {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do produto");
		System.out.print("Nome: ");
		String name = sc.nextLine();

		System.out.print("Preço: ");
		double price = sc.nextDouble();

		System.out.print("Quantidade no estoque: ");
		int quantity = sc.nextInt();
		
		Products products = new Products(name, price, quantity);
		
		products.setName("TESTE");
		System.out.println("Nome atualizado: " + products.getName());
		products.setPrice(1000.00);
		System.out.println("Preco atualizado: " + products.getPrice());

		System.out.println("Informações do produto: " + products);
		System.out.println("");

		System.out.print("Entre com o numero de produtos a ser adicionado no estoque: ");
		quantity = sc.nextInt();
		products.addProducts(quantity);

		System.out.println("Dados atualizados: " + products);
		System.out.println("");

		System.out.print("Entre com o numero de produtos a ser removidos no estoque: ");
		quantity = sc.nextInt();
		products.removeProducts(quantity);

		System.out.println("Dados atualizados: " + products);
		System.out.println("");

		sc.close();

	}

}
