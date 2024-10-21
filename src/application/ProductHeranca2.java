package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProductHeranca;
import entities.ProductHeranca;
import entities.UsedProductHeranca;

public class ProductHeranca2 {

	public static void main(String[] args) throws ParseException {
		int n, i;
		char tipoProduto;
		String nomeProduto;
		double preco, tarifaImportacao;
		Date dataManufatura;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<ProductHeranca> list = new ArrayList<>();
		
		System.out.print("Digite o número de produtos: ");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
			System.out.println("Dados do produto #" + i + ":");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			tipoProduto = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Nome: ");
			nomeProduto = sc.nextLine();
			
			System.out.print("Preço: ");
			preco = sc.nextDouble();
			
			if (tipoProduto == 'i') {
				System.out.print("Tarifa de importação: ");
				tarifaImportacao = sc.nextDouble();
				ProductHeranca p = new ImportedProductHeranca(nomeProduto, preco, tarifaImportacao);
				list.add(p);
				
			}
			
			else if (tipoProduto == 'u') {
				System.out.print("Data da manufatura (DD/MM/YYYY): ");
				dataManufatura = sdf.parse(sc.next());
				ProductHeranca p = new UsedProductHeranca(nomeProduto, preco, dataManufatura);
				list.add(p);
			}
			
			else {
				ProductHeranca p = new ProductHeranca(nomeProduto, preco);
				list.add(p);
			}
			
		}
		
		System.out.println();
		
		System.out.println("Detalhe dos produtos: ");
		
		for(ProductHeranca p : list) {
			System.out.println(p.priceTag());
		}
		
		
		sc.close();

	}

}
