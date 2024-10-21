package entities;

public class PessoaFisica extends ContribuintesAbstratos{
	private double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		if (getRendaAnual() < 20000.00  && getGastosSaude() == 0) {
			imposto = (getRendaAnual() * 0.15);
		} 
		else if (getRendaAnual() < 20000.00 && getGastosSaude() > 0) {
			imposto =  ((getRendaAnual() * 0.15) - (getGastosSaude() * 0.50));
		}
		
		else if (getRendaAnual() > 20000.00 && getGastosSaude() == 0) {
			imposto =  (getRendaAnual() * 0.25);
		} 
		else if (getRendaAnual() > 20000.00 && getGastosSaude() > 0) {
			imposto = (getRendaAnual() * 0.25) - (getGastosSaude() * 0.50);
		}
		return imposto;
		
	}
	

}
