package DadosGerados;

import java.util.ArrayList;

import Dados.Peso;
import lombok.Getter;
import lombok.Setter;

public class Relatorios {
	@Getter @Setter protected ArrayList<Object> animais = new ArrayList<Object>();
	@Getter @Setter protected int totalAnimais;
	@Getter @Setter protected double TotalKg;
	@Getter @Setter protected double TotalArroba;
	@Getter @Setter protected int quantMachos;
	@Getter @Setter protected int quantFemeas;
	@Getter @Setter protected int quantVacinado;
	@Getter @Setter protected int quantFaltaVacinar;
	
	
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
	
}
