package Calculos;

import java.util.ArrayList;
import java.util.Date;

import Dados.Animal;

public class Venda {
	private ArrayList<Animal> animais = new ArrayList<Animal>();
	private ArrayList<Animal> valorAnimalUni = new ArrayList<Animal>();
	private ArrayList<Animal> valorTotal = new ArrayList<Animal>();
	private Date dataVenda;
	
	public Venda(ArrayList<Animal> animais, ArrayList<Animal> valorAnimalUni, ArrayList<Animal> valorTotal,
			Date dataVenda) {
		this.animais = animais;
		this.valorAnimalUni = valorAnimalUni;
		this.valorTotal = valorTotal;
		this.dataVenda = dataVenda;
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	public ArrayList<Animal> getValorAnimalUni() {
		return valorAnimalUni;
	}

	public void setValorAnimalUni(ArrayList<Animal> valorAnimalUni) {
		this.valorAnimalUni = valorAnimalUni;
	}

	public ArrayList<Animal> getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(ArrayList<Animal> valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
	
}
