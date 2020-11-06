package Calculos;

import java.util.ArrayList;

import Dados.Animal;

public class CalculoPrecoArroba extends CalculoPreco{

	public CalculoPrecoArroba(ArrayList<Animal> animal, double valorPeso) {
		super(animal, valorPeso);
	}

	@Override
	public double CalculaPreco(double valorPeso, double valorCotacao) {
		return valorPeso * 150;
	}
	

}
