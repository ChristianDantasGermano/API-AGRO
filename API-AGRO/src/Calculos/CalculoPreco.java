package Calculos;

import java.util.ArrayList;

import Dados.Animal;

public abstract class CalculoPreco {
	
	protected ArrayList<Animal> animal = new ArrayList<Animal>();
	protected double valorPeso;
	
	public CalculoPreco(ArrayList<Animal> animal, double valorPeso) {
		this.animal.addAll(animal);
		this.valorPeso = valorPeso;
	}
	
	public abstract double CalculaPreco(double valorPeso, double valorCotacao);

}
