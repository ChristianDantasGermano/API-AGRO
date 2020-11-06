package Dados;

import java.util.ArrayList;

import Calculos.Peso;

public class Relatorios {
	protected ArrayList<Object> animais = new ArrayList<Object>();
	protected int totalAnimais;
	protected double TotalKg;
	protected double TotalArroba;
	protected int quantMachos;
	protected int quantFemeas;
	protected int quantVacinado;
	protected int quantFaltaVacinar;
	
	
	public void PreencheAnimal(ArrayList<Object> animal) {
		this.animais.addAll(animal);
		int contM = 0;
		int contF = 0;
		double contKg = 0;
		double contArroba = 0;
		
		
		this.totalAnimais = animais.size()/5;
		
		for(int i = 0; i<animais.size(); i++) {
			if(animais.get(i) == "M") {
				contM++;
			}
			else if(animais.get(i) == "F") {
				contF++;
			}
		}

		for(int i = 1; i<animais.size(); i = i+6) {
			Peso p = new Peso((double)animais.get(i), (double) animais.get(i+1));
			contKg = contKg + p.getPesoKg();
			contArroba = contArroba + p.getPesoArroba();
		}
		//setando os contadores
		this.TotalKg = contKg;
		this.TotalArroba = contArroba;
		this.quantMachos = contM;
		this.quantFemeas = contF;
		
	}
	
	public void PreencheVacina() {
		
	}
	

	public int getTotalAnimais() {
		return totalAnimais;
	}


	public void setTotalAnimais(int totalAnimais) {
		this.totalAnimais = totalAnimais;
	}


	public double getTotalKg() {
		return TotalKg;
	}


	public void setTotalKg(double totalKg) {
		TotalKg = totalKg;
	}


	public double getTotalArroba() {
		return TotalArroba;
	}


	public void setTotalArroba(double totalArroba) {
		TotalArroba = totalArroba;
	}


	public int getQuantMacho() {
		return quantMachos;
	}


	public void setQuantMacho(int quantMacho) {
		this.quantMachos = quantMacho;
	}


	public int getQuantFemeas() {
		return quantFemeas;
	}


	public void setQuantFemeas(int quantFemeas) {
		this.quantFemeas = quantFemeas;
	}


	public int getQuantVacinado() {
		return quantVacinado;
	}


	public void setQuantVacinado(int quantVacinado) {
		this.quantVacinado = quantVacinado;
	}


	public int getQuantFaltaVacinar() {
		return quantFaltaVacinar;
	}


	public void setQuantFaltaVacinar(int quantFaltaVacinar) {
		this.quantFaltaVacinar = quantFaltaVacinar;
	}
	
}
