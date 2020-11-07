package Financeiro;

public abstract class CalculoPreco {
	protected double valorPeso;
	
	public CalculoPreco() {
		
	}
	
	public abstract double calculaPreco(double valorPeso, Cotacao cotacao);
}
