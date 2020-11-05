package Calculos;

import java.util.ArrayList;

public class CalculoPreco {
	
	protected ArrayList<String> animal = new ArrayList<String>();
	protected double valorPeso;
	protected double valorCotacao;
	
	public CalculoPreco(ArrayList<String> animal, double valorPeso, double valorCotacao) {
		this.animal.addAll(animal);
		this.valorPeso = valorPeso;
		this.valorCotacao = valorCotacao;
	}
	
	public double CalculaPeso() {
		return valorPeso * valorCotacao;
	}

}
