package application;

import java.util.Scanner;

import entities.pensionato;

//import entities.somaVetoresA;
//import entities.somaVetoresB;
//import util.somaDoisVetores;

public class ExercicioVetores {

	public static void main(String[] args) {
		// Exercicios Negativos
//		int n, numero;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Quantos numeros você vai digitar? ");
//		n = sc.nextInt();
//		Negativos[] vect = new Negativos[n];
//		
//		for(int i = 0; i < vect.length; i++) {
//			System.out.print("Digite um número: ");
//			numero = sc.nextInt();
//			
//			if (numero > 10) {
//				System.out.println("Não é permitido inserções de numeros maiores que 10");				
//			}
//			else if (numero < 0) {
//				vect[i] = new Negativos(numero);
//			}
//		}
//		System.out.println("Numero negativos:");
//		for(int j = 0; j < vect.length; j++) {
//			if(vect[j] != null) {
//				System.out.println(vect[j].getN());
//			}
//		}
//		
//		
//		sc.close();
		
		
		// Soma_vetor
//		int n, i = 0, numero;
//		double soma = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Quantos numeros voce vai digitar? ");
//		n = sc.nextInt();
//		SomaVetor[] vect = new SomaVetor[n];
//		
//		for(i = 0; i < vect.length; i++) {
//			System.out.printf("Digite um numero: ");
//			numero = sc.nextInt();
//			vect[i] = new SomaVetor(numero);
//			soma += vect[i].getN();
//		}
//		
//		for(i = 0; i < vect.length; i++) {
//			System.out.println("Valores = " + vect[i].getN());
//		}
//		System.out.println("Soma = " + soma);
//		System.out.println("Media = " + soma / vect.length);
//		
//		sc.close();
		
		
		
//		// Alturas
//		
//		int n, i, idade;
//		String nome;
//		double altura, somaAltura = 0, mediaAltura = 0, percentualMenores = 0, idadeMenor16 = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Quantas pessoas serão digitas? ");
//		n = sc.nextInt();
//		
//		AlturaVetor[] vect = new AlturaVetor[n];
//		
//		for(i = 0; i < vect.length; i++) {
//			System.out.printf("Dados da %da pessoa%n", i+1);
//			System.out.print("Nome: ");
//			nome = sc.next();
//			
//			System.out.print("Idade: ");
//			idade = sc.nextInt();
//			
//			System.out.print("Altura: ");
//			altura = sc.nextDouble();
//			
//			vect[i] = new AlturaVetor(nome, idade, altura);
//			
//			somaAltura += vect[i].getAltura();
//			
//			if (vect[i].getIdade() < 16) {
//				idadeMenor16++;
//			}
//		}
//		
//		percentualMenores = (idadeMenor16 / n) * 100.0;
//		mediaAltura = somaAltura / vect.length;
//		
//		System.out.printf("Altura Média: %.2f%n", mediaAltura);
//		System.out.println("Pessoas com menos de 16 anos: " + percentualMenores + "%");
//		
//		for(i = 0; i < vect.length; i++) {
//			if (vect[i].getIdade() < 16) {
//				System.out.println(vect[i].getNome());
//			}
//
//		}
//		
//		sc.close();
		
		
//		//NUMEROS_PARES
//		int N, i = 0, numero, pares = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Quantos numeros você vai digitar? ");
//		N = sc.nextInt();
//		numerosPares[] vect = new numerosPares[N];
//		
//		for(i = 0; i < vect.length; i++) {
//			System.out.print("Digite um numero: ");
//			numero = sc.nextInt();
//			
//			vect[i] = new numerosPares(numero);
//			
//			if (numero % 2 == 0) {
//				pares++;
//			}
//		}
//			
//			System.out.println("Numeros Pares: ");
//		for(i = 0; i < vect.length; i++) {
//			if (vect[i].getNumero() % 2 == 0) {
//				System.out.print(vect[i].getNumero() + " ");
//			}
//		}
//		System.out.println();
//		System.out.print("Quantidade de pares = " + pares);
//		
//		
//		sc.close();
		
		
		
//		// MAIOR POSICAO
//		
//		int N, i, numero, numeroAnterior = 0, maiorValor = 0, posicaoMaiorValor = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Quantos numeros você vai digitar? ");
//		N = sc.nextInt();
//		
//		maiorPosicao[] vect = new maiorPosicao[N];
//		
//		for(i = 0; i < vect.length; i++) {
//			System.out.print("Digite um numero: ");
//			numero = sc.nextInt();
//			
//			vect[i] = new maiorPosicao(numero);
//		}
//		
//		for(i = 0; i < vect.length; i++) {
//			
//			if (numeroAnterior > vect[i].getNumero() && numeroAnterior > maiorValor) {
//				maiorValor = numeroAnterior;
//				if(i != 0) {
//				posicaoMaiorValor = i - 1 ;
//			}
//			}
//			numeroAnterior = vect[i].getNumero();
//		}
//		
//		System.out.println("Maior valor = " + maiorValor);
//		System.out.println("Posicao maior valor = " + posicaoMaiorValor);
//		
//		sc.close();
		
		
		
		
		
//		//SOMA VETORES
//		int N, i, numeroA, numeroB;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Quantos valores vai ter cada vetor? ");
//		N = sc.nextInt();
//		
//		somaVetoresA[] vectA = new somaVetoresA[N];
//		somaVetoresB[] vectB = new somaVetoresB[N];
//		
//		System.out.println("Digite os valores do vetor A: ");
//		
//		for(i = 0; i < vectA.length; i++) {
//			numeroA = sc.nextInt();
//			
//			vectA[i] = new somaVetoresA(numeroA);
//		}
//		
//		System.out.println("Digite os valores do vetor B: ");
//		
//		for(i = 0; i < vectB.length; i++) {
//			numeroB = sc.nextInt();
//			
//			vectB[i] = new somaVetoresB(numeroB);
//		}
//		
//		System.out.println("Vetor resultante:");
//		
//		for(i = 0; i < N; i++) {
//			System.out.println(somaDoisVetores.soma(vectA[i].getA(), vectB[i].getB()));
//		}
//		
//		sc.close();
		
		
		
		
//		//ABAIXO DA MEDIA
//		int N, i;
//		double numero, somaValoresVetor = 0, mediaValoresVetor;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Quandos elementos vai ter o vetor? ");
//		N = sc.nextInt();
//		
//		abaixoDaMedia[] vect = new abaixoDaMedia[N];
//		
//		for(i = 0; i < vect.length; i++) {
//			System.out.print("Digite um número: ");
//			numero = sc.nextDouble();
//			vect[i] = new abaixoDaMedia(numero);
//			somaValoresVetor += vect[i].getNumero(); 
//		}
//		
//		mediaValoresVetor = calculosVetores.mediaVetor(somaValoresVetor, vect.length);
//		
//		calculosVetores.arredondaValorVetor2Casas(mediaValoresVetor);
//		
//		System.out.println("Media do vetor = " + mediaValoresVetor);
//		System.out.println("Elementos abaixo da media:");
//		for(i = 0; i < vect.length; i++) {
//			if (vect[i].getNumero() < mediaValoresVetor ) {
//				System.out.println(vect[i].getNumero());
//			}
//		}
//		
//		sc.close();
		
		
		
//		//MEDIA PARES
//		
//		int N, i, numero, somaVetor = 0, pares = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Quantos elementos vai ter o vetor? ");
//		N = sc.nextInt();
//		
//		mediaParesVetor[] vect = new mediaParesVetor[N];
//		
//		for(i = 0; i < vect.length; i++) {
//			System.out.print("Digite um numero: ");
//			numero = sc.nextInt();
//			vect[i] = new mediaParesVetor(numero);
//			
//			if (vect[i].getNumero() % 2 == 0) {
//				somaVetor += vect[i].getNumero();
//				pares++;
//			}
//		}
//		if (pares == 0) {
//			System.out.println("NENHUM NUMERO PAR");
//		} else {
//			System.out.println("Media dos pares: " + calculosVetores.arredondaValorVetor2Casas(calculosVetores.mediaVetor(somaVetor, pares)));
//		}
//			
//		sc.close();
		
		
		
		
//		// MAIS VELHO
//		int N, i, idade, idadeAnterior = 0;
//		String nome, maiorIdade = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Quantas pessoas voce vai digitar? ");
//		N = sc.nextInt();
//		
//		maisVelho[] vect = new maisVelho[N];
//		
//		for(i = 0; i < vect.length; i++) {
//			System.out.println("Dados da " + (i+1) + "a pessoa:");
//			
//			System.out.print("Nome: ");
//			nome = sc.next();
//			
//			System.out.print("Idade: ");
//			idade = sc.nextInt();
//			
//			vect[i] = new maisVelho(nome, idade);
//		}
//		
//		for(i = 0; i < vect.length; i++) {
//			if(vect[i].getIdade() > idadeAnterior) {
//				maiorIdade = vect[i].getNome();
//			}
//			
//			idadeAnterior = vect[i].getIdade(); 
//		}
//		
//		System.out.println("Pessoa mais velha: " + maiorIdade);
//
//		sc.close();
		
		
		
//		// APROVADOS
//		int N, i;
//		String nome;
//		double n1, n2, somaNotas = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Quantos alunos serão digitados? ");
//		N = sc.nextInt();
//		
//		aprovados[] vect = new aprovados[N];
//		
//		for(i = 0; i < vect.length; i++){
//			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
//			sc.nextLine();
//			nome = sc.nextLine();
//			n1 = sc.nextDouble();
//			n2 = sc.nextDouble();
//			
//			vect[i] = new aprovados(nome, n1, n2);
//		}
//		
//		System.out.println("Alunos aprovados:");
//		
//		for(i = 0; i < vect.length; i++) {
//			somaNotas = vect[i].getN1() + vect[i].getN2();
//			if(calculosVetores.mediaVetor(somaNotas, 2) >= 6.0) {
//				System.out.println(vect[i].getNome());
//			}
//		}
//				
//		sc.close();
//		
		
		
//		// DADOS PESSOAS
//		
//		int N, i, nHomens = 0;
//		double altura, somaAlturaMulheres = 0, menorAltura = 0, maiorAltura = 0, nMulheres = 0;
//		char genero;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Quantas pessoas serão digitadas? ");
//		N = sc.nextInt();
//		
//		dadosPessoas[] vect = new dadosPessoas[N];
//		
//		for(i = 0; i < vect.length; i++) {
//			System.out.print("Altura da " + (i+1) + "a pessoa: ");
//			altura = sc.nextDouble();
//			
//			System.out.print("Genero da " + (i+1) + "a pessoa: ");
//			genero = sc.next().charAt(0);
//			
//			vect[i] = new dadosPessoas(altura, genero);
//			
//			if (vect[i].getGenero() == 'M') {
//				nHomens++;
//			}
//			
//			if(vect[i].getGenero() == 'F') {
//			somaAlturaMulheres += vect[i].getAltura();
//			nMulheres++;
//			}
//		}
//		
//		menorAltura = vect[0].getAltura();
//		maiorAltura = vect[0].getAltura();
//		
//		for(i = 0; i < vect.length; i++) {
//			if (vect[i].getAltura() > maiorAltura) {
//				maiorAltura = vect[i].getAltura();
//			}
//			
//			if (vect[i].getAltura() < menorAltura){
//				menorAltura = vect[i].getAltura();
//			}
//		}
//			System.out.println("Menor Altura = " + menorAltura);
//			System.out.println("Maior Altura = " + maiorAltura);
//			System.out.printf("Media das alturas das mulheres = %.2f%n",calculosVetores.mediaVetor(somaAlturaMulheres, nMulheres));
//			System.out.println("Numero de Homens = " + nHomens);
//		
//		sc.close();
		
		
		//PENSIONATO
		int N,i, quarto;
		String nome, email;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos vão ser alugados? ");
		N = sc.nextInt();
		if (N > 10) {
			do {
				System.out.print("Quantidade máxima de quartos são 10, escolha um numero até 10: ");
				N = sc.nextInt();
			} while (N > 10);
		}
		
		pensionato[] vect = new pensionato[10];
		
		for(i = 0; i < N; i++) {
			System.out.println("Quarto #" + (i+1) + ":");
			System.out.print("Nome: ");
			sc.nextLine(); // Limpa o buffer que vem do nextInt
			nome = sc.nextLine();
			
			System.out.print("E-mail: ");
			email = sc.nextLine();
			
			System.out.print("Quarto: ");
			quarto = sc.nextInt();
			if (quarto > 9) {
				do {
					System.out.print("Somente é possível escolher quartos de 0 a 9, tente novamente: ");
					quarto = sc.nextInt();
				} while (quarto > 9);
			}
			
			System.out.println();
			//utilizo o numero do quarto como a posição que ficará armazenado as informacoes no vetor
			vect[quarto] = new pensionato(nome, email, quarto); 
	
		}
		
		System.out.println("Quartos ocupados:");
		for(i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].toString());
			}
		}
		
		
		
		sc.close();
		
		
		
	}

}
