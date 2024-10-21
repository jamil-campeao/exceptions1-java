package entities;

public class PessoaJuridica extends ContribuintesAbstratos {
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		if (getNumeroFuncionarios() > 10) {
			imposto =  getRendaAnual() * 0.14;
		} else {
			imposto  = getRendaAnual() * 0.16;
		}
		return imposto;
	}

}
