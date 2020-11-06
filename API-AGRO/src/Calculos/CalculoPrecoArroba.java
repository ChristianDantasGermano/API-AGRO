package Calculos;

public class CalculoPrecoArroba extends CalculoPreco{

	public CalculoPrecoArroba(double valorArroba) {
		super();
		valorPeso = valorArroba;
	}

	@Override
	public double calculaPreco(double valorPeso, Cotacao cotacao) {
		return valorPeso * cotacao.getCotacao();
	}	
}
