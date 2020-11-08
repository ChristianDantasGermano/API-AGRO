package DadosGerados;

import java.util.ArrayList;

import Dados.Peso;
import Financeiro.CalculoPreco;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Relatorios {
	@Getter @Setter protected ArrayList<Object> animais = new ArrayList<Object>();
	@Getter @Setter protected int totalAnimais;
	@Getter @Setter protected double TotalKg;
	@Getter @Setter protected double TotalArroba;
	@Getter @Setter protected int quantMachos;
	@Getter @Setter protected int quantFemeas;
	@Getter @Setter protected int quantVacinado;
	@Getter @Setter protected int quantFaltaVacinar;
	@Getter @Setter protected double totalPrecokg;
	@Getter @Setter protected double totalPrecoarroba;
	CalculoPreco cp = new CalculoPreco();
	
	
	public Relatorios(ArrayList<Object> animal, ArrayList<Object> vacinas,
			ArrayList<Object> agendados) {
		PreencheAnimal(animal);
		PreencheVacina(vacinas, agendados);
		PreenchePreco(animal);
	}
	public void PreencheAnimal(ArrayList<Object> animal) {
		this.animais.addAll(animal);
		int contM = 0;
		int contF = 0;
		double contKg = 0;
		double contArroba = 0;
		
		//obtendo os valores dos animais
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
		//colocando nas variaveis
		this.TotalKg = contKg;
		this.TotalArroba = contArroba;
		this.quantMachos = contM;
		this.quantFemeas = contF;
		
	}
	
	public void PreencheVacina(ArrayList<Object> vacinas, ArrayList<Object> agendados) {
		int contVacinados = 0;
		int contFaltaVacinar = 0;
		
		//obtendo a contagem
		for(Object obj : vacinas) {
			contVacinados++;
		}
		for(Object obj : agendados) {
			contFaltaVacinar++;
		}
		//colocando nas variaveis
		this.quantVacinado = (contVacinados/totalAnimais)*100;
		this.quantFaltaVacinar = (contFaltaVacinar/totalAnimais)*100;
	}
	
	public void PreenchePreco(ArrayList<Object> animal) {
		double contaprecokg = 0;
		double contaprecoarroba = 0;
		
		for (int i = 1; i < animais.size(); i = i + 6) {
			Peso p = new Peso((double) animais.get(i), (double) animais.get(i + 1));
			contaprecokg = contaprecokg + p.getPesoKg();
			contaprecoarroba = contaprecoarroba + p.getPesoArroba();
		}
		//colocando nas variaveis
		this.totalPrecokg = cp.calculaPrecoKg(contaprecokg);
		this.totalPrecoarroba = cp.calculaPrecoArroba(contaprecoarroba);
	}
	
}
