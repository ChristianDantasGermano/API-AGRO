package Financeiro;

public class CalculoPreco {
	protected double valorPeso;
	protected Cotacao cotacao;
	
	public CalculoPreco() {
		
	}
	
	public double calculaPrecoArroba(double peso) {
		this.valorPeso = peso;
		return valorPeso * cotacao.getCotacaoArroba();
	}
	
	public double calculaPrecoKg(double peso) {
		this.valorPeso = peso;
		return valorPeso * cotacao.getCotacaoKg();
	}
}
