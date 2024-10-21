package entities;

public class Aluno {
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	
	public double calculaMedia() {
		return (n1 + 30 + n2 + 35 + n3 + 35) - 100;
	}

}
