package entities;

public class EmpregadoTerceirizado extends Empregado {

	private Double despesaAdicional;

	public EmpregadoTerceirizado() {
		super();
	}

	public EmpregadoTerceirizado(String nome, Integer hora, Double valorHora, Double despesaAdicional) {
		super(nome, hora, valorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}

}
