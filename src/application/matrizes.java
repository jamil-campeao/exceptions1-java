package application;

import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
//		// MATRIZES
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Digite a dimensão da matriz: ");
//		int n = sc.nextInt();
//		int negativos = 0;
//		int[][] mat = new int[n][n];
//		
//		for(int i = 0; i < mat.length; i++) {
//			for(int j = 0; j < mat[i].length; j ++) {
//				mat[i][j] = sc.nextInt();
//				if (mat[i][j] < 0) {
//					negativos++;
//				}
//			}
//		}
//		
//		System.out.println("Diagonal principal: ");
//		for(int i = 0; i < mat.length; i++) {
//			for(int j = 0; j < mat[i].length; j++) {
//				if (i == j) {
//					System.out.print(mat[i][j] + " ");
//				}
//			}
//		}
//		
//		System.out.println("\n");
//		System.out.println("Numero negativos: " + negativos);
//		
//		
//		
//		sc.close();
		
		// MATRIZES não quadradas
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero de linhas da matriz: ");
		int linhas = sc.nextInt();
		
		System.out.print("Digite o numero de colunas da matriz: ");
		int colunas = sc.nextInt();
		
		int[][] mat = new int[linhas][colunas];
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.print("Digite um elemento para pesquisar na matriz: ");
		int elemento = sc.nextInt();
		
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				if (mat[i][j] == elemento) {
					System.out.println("Posição: " + i + "," + j);
					
					if (j > 0) {
						if (mat[i][j-1] != 0) {
							System.out.println("Esquerda: " + mat[i][j-1]);
						}
					}
					
					if (i > 0 && j > 0) {
						if (mat[i-1][j-1] != 0) {
							System.out.println("Acima: " + mat[i-1][j-1]);
						}
					}
					
					if (j < colunas - 1) {
						if (mat[i][j+1] != 0) {
							System.out.println("Direita: " + mat[i][j+1]);
						}
					}
					
					if (i < linhas - 1) {
						if (mat[i+1][j] != 0) {
							System.out.println("Abaixo: " + mat[i+1][j]);
						}
					}

				}
			}
			
		}
		
		sc.close();

	}

}
