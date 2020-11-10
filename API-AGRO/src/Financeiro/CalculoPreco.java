package Financeiro;

public class CalculoPreco {
	protected double valorPeso;
	protected Cotacao cotacao;
	
	public CalculoPreco() {
		cotacao = new Cotacao();
	}
	
	public double calculaPrecoArroba(double peso) { 
		System.out.println("Entrou");
		System.out.println(cotacao.getCotacaoArroba());
		this.valorPeso = peso;
		return valorPeso * cotacao.getCotacaoArroba();
	}
	
	public double calculaPrecoKg(double peso) {
		System.out.println("Entrou");
		System.out.println(cotacao.getCotacaoKg());
		this.valorPeso = peso;
		return valorPeso * cotacao.getCotacaoKg();
	}
	
}
