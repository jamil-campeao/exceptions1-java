package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {

	public static void main(String[] args) {
		method1();
		
		System.out.println("fim do programa");

	}
	
	public static void method1() {
		System.out.println("** METODO1 INICIO");
		
		method2();
		
		System.out.println("** METODO1 FIM");
	}
	
	public static void method2() {
		System.out.println("** METODO2 INICIO");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vect[posicao]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao inválida");
			e.printStackTrace();
			sc.next();
		}
		
		catch (InputMismatchException e) {
			System.out.println("Erro na entrada");
		}
		
		sc.close();
		System.out.println("** METODO2 FIM");
	}

}
