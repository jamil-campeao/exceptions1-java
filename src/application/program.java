package application;

import java.util.Scanner;

import entities.Triangle;

public class program {

	public static void main(String[] args) {
		double p, areaX, areaY;
		Scanner sc  = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medidas do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.area();
		
		areaY = y.area();
		
		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: X");
		}
		else {
			System.out.println("Maior área: Y");
		}
		sc.close();

	}

}
