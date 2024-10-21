package application;

import java.util.Scanner;

import util.Calculator;

public class ExercicioRaio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio, c, v;
		
		raio = sc.nextDouble();
		c = Calculator.circumferencia(raio);
		v = Calculator.volume(raio);
		
		System.out.printf("Circumferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		
		
		sc.close();

	}
}
