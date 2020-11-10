package DadosGerados;

import java.util.ArrayList;
import java.util.List;

import Dados.Peso;
import Financeiro.CalculoPreco;
import Vacinacao.AgendaVacina;
import Vacinacao.CartaoVacina;
import Vacinacao.Vacina;
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
	@Getter @Setter protected float quantVacinado;
	@Getter @Setter protected float quantFaltaVacinar;
	@Getter @Setter protected double totalPrecokg;
	@Getter @Setter protected double totalPrecoarroba;
	CalculoPreco cp = new CalculoPreco();
	
	
	public Relatorios(ArrayList<Object> animal, List<CartaoVacina> vacinas) {
		PreencheAnimal(animal);
		PreencheVacina(vacinas);
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
		
		for(int i = 2; i<animais.size(); i = i + 6) {
			System.out.println("Gênero do animal:"+animais.get(i));
			if(animais.get(i).equals("M") || animais.get(i).equals("m")) {
				contM++;
			}
			else if(animais.get(i).equals("F") || animais.get(i).equals("f")) {
				contF++;
			}
		}

		for(int i = 4; i<animais.size(); i = i+6) {
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
	
	public void PreencheVacina(List<CartaoVacina> vacinas) {
		float contVacinados = 0;
		float contFaltaVacinar = 0;	
		for(CartaoVacina objC : vacinas) {
			for(@SuppressWarnings("unused") Vacina objV : objC.getVacinas()) {
				contVacinados++;
			}
			for(@SuppressWarnings("unused") AgendaVacina objV : objC.getVacinasAgendadas()) {
				contFaltaVacinar++;
			}			
		}
		this.quantVacinado = ((contVacinados/(contVacinados+contFaltaVacinar))*100);
		this.quantFaltaVacinar = (contFaltaVacinar/(contVacinados+contFaltaVacinar))*100;
	}
	
	public void PreenchePreco(ArrayList<Object> animal) {
		double contaprecokg = 0;
		double contaprecoarroba = 0;
		
		for (int i = 4; i < animais.size(); i = i + 6) {
			Peso p = new Peso((double) animais.get(i), (double) animais.get(i + 1));
			contaprecokg = contaprecokg + p.getPesoKg();
			contaprecoarroba = contaprecoarroba + p.getPesoArroba();
		}
		//colocando nas variaveis
		this.totalPrecokg = cp.calculaPrecoKg(contaprecokg);
		this.totalPrecoarroba = cp.calculaPrecoArroba(contaprecoarroba);
	}
	
}
