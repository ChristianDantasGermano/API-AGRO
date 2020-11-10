package Repository;

import java.util.ArrayList;
import java.util.List;

import Dados.Bovinos;
import Dados.Peso;
import Dados.Suinos;
import lombok.Getter;

public class AnimalRepository {
	
	private @Getter List<Bovinos> bois = new ArrayList<Bovinos>();
	private @Getter List<Suinos> suinos = new ArrayList<Suinos>();
	private int regBoi;
	private int regSuino;
	
	public AnimalRepository() {
		regBoi=0;
		regSuino=0;
	}
	
	public Bovinos GetBovino(int index) {
		for(Bovinos obj : bois) {
			if(obj.getRegistro() == index){
				return obj;
			}
		}
		System.out.println("Erro");
		return null;
	}
	
	public Suinos GetSuino(int index) {
		for(Suinos obj : suinos) {
			if(obj.getRegistro() == index){
				return obj;
			}
		}
		System.out.println("Erro");
		return null;
	}

	public void setBois(double[] valorNum,Bovinos obj) {
		Peso peso = new Peso(valorNum[0],valorNum[1]);
		obj.setPeso(peso);
		obj.setRegistro(regBoi);
		regBoi++; 
		bois.add(obj);
	}
	
	public void setSuinos(double[] valorNum,Suinos obj) {
		Peso peso = new Peso(valorNum[0],valorNum[1]);
		obj.setPeso(peso);
		obj.setRegistro(regSuino);
		regSuino++;
		suinos.add(obj);
	}
	
}
 