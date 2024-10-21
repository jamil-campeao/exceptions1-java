package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class ExercicioStatic {

	public static void main(String[] args) {
		double valor, precoDolar;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preço do dolar? ");
		precoDolar = sc.nextDouble();
		
		System.out.println("Quantos dolares você vai comprar? ");
		valor = sc.nextDouble();
		
		System.out.print("O quanto você vai pagar em reais: " + CurrencyConverter.ConversaoDolarReais(valor, precoDolar));
		
		
		sc.close();

	}

}
