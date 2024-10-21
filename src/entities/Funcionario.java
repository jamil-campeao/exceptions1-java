package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double calcularSalario() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		salarioBruto += (salarioBruto * porcentagem);
	}

}
