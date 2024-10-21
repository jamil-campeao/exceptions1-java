package util;

public class calculosVetores {
		
		public static int somaDoisVetores(int a, int b) {
			return a + b;
		}
		
		public static double mediaVetor(double total, double quantidade) {
			return total / quantidade; 
		}
		
		public static double arredondaValorVetor2Casas(double valor) {
			return Math.round(valor * 100) / 100;
		}


}
