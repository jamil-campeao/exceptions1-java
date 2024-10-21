package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CircleAbstract;
import entities.RectangleAbstract;
import entities.Shape;
import entities.enums.Color;

public class MetodosAbstratos {

	public static void main(String[] args) {
		int n;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Entre com o número de formas: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados da Forma #" + i + ":");
			
			System.out.print("Retangulo ou circulo (r/c)? ");
			char tipo = sc.next().charAt(0);
			
			System.out.print("Cor (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if (tipo == 'r') {
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				
				list.add(new RectangleAbstract(color, largura, altura));
			}
			else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				list.add(new CircleAbstract(color, raio));
			}
		}
		
		System.out.println();
		System.out.println("Areas das figuras: ");
		
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();

	}

}
