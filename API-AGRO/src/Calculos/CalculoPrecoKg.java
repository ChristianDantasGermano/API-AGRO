package Calculos;

public class CalculoPrecoKg extends CalculoPreco{
	
	public CalculoPrecoKg(double valorKg) {
		super();
		valorPeso = valorKg;
	}

	@Override
	public double calculaPreco(double valorPeso, Cotacao cotacao) {
		return valorPeso * cotacao.getCotacao();
	}


}

