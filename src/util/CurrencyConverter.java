package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double ConversaoDolarReais(double valor, double precoDolar) {
		return (precoDolar * valor) + ((precoDolar * valor) * IOF);    
	}

}
