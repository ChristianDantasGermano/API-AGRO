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
	
	public void setBois(String[] valor,double[] valorNum) {
		Peso peso = new Peso(valorNum[0],valorNum[1]);
		Bovinos obj = new Bovinos(regBoi,peso,valor[0],valor[1],valor[2]);
		regBoi++; 
		bois.add(obj);
	}
	
	public void setSuinos(String[] valor,double[] valorNum) {
		Peso peso = new Peso(valorNum[0],valorNum[1]);
		Suinos obj = new Suinos(regSuino,peso,valor[0],valor[1],valor[2]);
		regSuino++;
		suinos.add(obj);
	}
}
 