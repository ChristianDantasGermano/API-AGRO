package Calculos;

import java.util.ArrayList;

import Dados.Animal;

public class CalculoPrecoKg extends CalculoPreco{

	public CalculoPrecoKg(ArrayList<Animal> animal, double valorPeso) {
		super(animal, valorPeso);
	}

	@Override
	public double CalculaPreco(double valorPeso, double valorCotacao) {
		return valorPeso * 1000;
	}


}

