package entities;

public class BancoUsuarios {
	private int conta;
	private String nome;
	private double saldo;
	
	public BancoUsuarios(int conta, String nome, double depositoInicial) {
		this.conta = conta;
		this.nome = nome;
		adicionarSaldo(depositoInicial);
		
	}

	public BancoUsuarios(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarSaldo(double valor) {
		saldo += valor;
	}
	
	public void retirarSaldo(double valor) {
		saldo -= valor + 5.00;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "Conta: " + conta + ", " + 
				"Titular: " + nome + ", " +
				"Saldo: " + String.format("%.2f", saldo);
	}
	
	

}
