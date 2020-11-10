package Financeiro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Dados.Animal;
import Dados.Bovinos;
import Dados.Suinos;
import lombok.Getter;
import lombok.Setter;

public class Venda {
	
	@Getter @Setter private List<Bovinos> bovinos = new ArrayList<Bovinos>();
	@Getter @Setter private List<Suinos> suinos = new ArrayList<Suinos>();
	@Getter @Setter private ArrayList<Double> valorAnimalUniKg = new ArrayList<Double>();
	@Getter @Setter private ArrayList<Double> valorAnimalUniArroba = new ArrayList<Double>();
	@Getter @Setter private double valorTotalKg;
	@Getter @Setter private double valorTotalArroba;
	@Getter @Setter private Date dataVenda;
	CalculoPreco cp = new CalculoPreco();	

	public void CalcularVendaBoi() {
		double tempkg;
		double tempArroba;
		valorTotalKg=0;
		valorTotalArroba =0;		
		for (Animal obj : bovinos) {
			tempkg = cp.calculaPrecoKg(obj.getPesoKg());
			tempArroba = cp.calculaPrecoArroba(obj.getPesoArroba());
			valorAnimalUniKg.add(tempkg);
			valorAnimalUniArroba.add(tempArroba);
			valorTotalKg =+ tempkg; 
		    valorTotalArroba =+ tempArroba;
		}		
		dataVenda = new Date();		
	}
	
	public void CalcularVendaPorco() {
		double tempkg;
		double tempArroba;
		valorTotalKg=0;
		valorTotalArroba =0;		
		for (Animal obj : suinos) {
			tempkg = cp.calculaPrecoKg(obj.getPesoKg());
			tempArroba = cp.calculaPrecoArroba(obj.getPesoArroba());
			valorAnimalUniKg.add(tempkg);
			valorAnimalUniArroba.add(tempArroba);
			valorTotalKg =+ tempkg; 
		    valorTotalArroba =+ tempArroba;
		}		
		dataVenda = new Date();		
	}
	

}

	
	
