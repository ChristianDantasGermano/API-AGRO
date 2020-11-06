package Calculos;

import java.util.ArrayList;
import java.util.Date;

import Dados.Animal;

public class Venda {
	private ArrayList<Object> animais = new ArrayList<Object>();
	private ArrayList<Object> valorAnimalUni = new ArrayList<Object>();
	private ArrayList<Object> valorTotal = new ArrayList<Object>();
	private Date dataVenda;
	public double valorArroba = 0;
	public double valorKg = 0;
	public CalculoPreco calculoArroba;
	public CalculoPreco calculoKg;
	
	
	public Venda(ArrayList<Object> animais, ArrayList<Object> valorAnimalUni, ArrayList<Object> valorTotal,
			Date dataVenda) {
		this.animais = animais;
		this.valorAnimalUni = valorAnimalUni;
		this.valorTotal = valorTotal;
		this.dataVenda = dataVenda;
	}

	public ArrayList<Object> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Object> animais) {
		this.animais = animais;
	}

	public ArrayList<Object> getValorAnimalUni() {
		return valorAnimalUni;
	}

	public void setValorAnimalUni(ArrayList<Object> valorAnimalUni) {
		this.valorAnimalUni = valorAnimalUni;
	}

	public ArrayList<Object> getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(ArrayList<Object> valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	public void precosVenda (ArrayList<Object> animais) {
		for(int i = 1; i<animais.size(); i=i+6) {
			Peso p = new Peso((double)animais.get(i), (double)animais.get(i+1));
			this.valorArroba = this.valorArroba + p.getPesoArroba();
			this.valorKg = this.valorKg + p.getPesoKg();
			calculoArroba = (CalculoPreco) new CalculoPrecoArroba(this.valorArroba);
			calculoKg = (CalculoPreco) new CalculoPrecoKg(this.valorKg);
		//	valorAnimalUni.add(calculoArroba, calculoKg);
			
		}
		
		calculoArroba = (CalculoPreco) new CalculoPrecoArroba(this.valorArroba);
		calculoKg = (CalculoPreco) new CalculoPrecoKg(this.valorKg);
		
		
	}
	
}
