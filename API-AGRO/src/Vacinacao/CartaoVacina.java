package Vacinacao;

import java.util.ArrayList;
import java.util.List;

import Dados.Animal;

public class CartaoVacina {
	private Animal animal;
	private List<Vacina> vacinas = new ArrayList<Vacina>();
	private List<AgendaVacina> vanicasAgendadas = new ArrayList<AgendaVacina>();

	public CartaoVacina(Animal animal, List<Vacina> vacinas, List<AgendaVacina> vanicasAgendadas) {
		this.animal = animal;
		this.vacinas = vacinas;
		this.vanicasAgendadas = vanicasAgendadas;
	}

	public Animal getAnimal() {
		return animal;
	}

	public List<Vacina> getVacinas() {
		return vacinas;
	}

	public List<AgendaVacina> getVanicasAgendadas() {
		return vanicasAgendadas;
	}

}
