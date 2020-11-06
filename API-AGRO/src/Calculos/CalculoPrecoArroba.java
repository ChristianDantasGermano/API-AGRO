package Calculos;

import java.util.ArrayList;

import Dados.Animal;

public class CalculoPrecoArroba extends CalculoPreco{

	public CalculoPrecoArroba(ArrayList<Animal> animal, double valorPeso) {
		super(animal, valorPeso);
		
		for(Animal a: animal) {
			//valorPeso = a.getPeso().getPesoArroba;
		}
	}

	@Override
	public double CalculaPreco(double valorPeso, double valorCotacao) {
		return valorPeso * 150;
	}
	

}
