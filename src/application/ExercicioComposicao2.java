package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ClientComposicao;
import entities.OrderComposicao;
import entities.OrderItemComposicao;
import entities.ProductComposicao;
import entities.enums.OrderStatus;
import entities.enums.OrderStatus2;

public class ExercicioComposicao2 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do cliente:");
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		ClientComposicao clientComposicao = new ClientComposicao(name, email, birthDate);
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		OrderStatus2 status = OrderStatus2.valueOf(sc.next()); //Converte a String digitada por o tipo enumerado do Status
		OrderComposicao orderComposicao = new OrderComposicao(new Date(), status, clientComposicao);
		
		System.out.print("Quantos itens irá adicionar neste pedido? ");
		int qtditem = sc.nextInt();
		
		
		for(int i = 1; i <= qtditem; i++) {
			System.out.println("Entre com os dados do item #" + i);
			
			System.out.print("Nome do produto: ");
			sc.nextLine(); //Consome a quebra de linha pendente
			String productName = sc.nextLine();
			
			System.out.print("Preço do produto: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantidade: ");
			int productquantity = sc.nextInt();
			
			OrderItemComposicao orderItemComposicao = new OrderItemComposicao(productquantity, productPrice, new ProductComposicao(productName, productPrice));
			
			orderComposicao.addItem(orderItemComposicao); //Adiciona o item do pedido no Order
		}
		
		
		System.out.println("RESUMO DO PEDIDO: ");

		System.out.println(orderComposicao.toString());

		sc.close();

	}

}
