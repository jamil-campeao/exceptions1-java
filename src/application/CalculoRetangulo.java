package application;

import java.util.Scanner;

import entities.Retangulo;

public class CalculoRetangulo {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a altura e largura do retângulo");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", retangulo.area());
		System.out.printf("PERIMETRO: %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL: %.2f%n", retangulo.diagonal());
		
		sc.close();

	}

}
