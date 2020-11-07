package Vacinacao;

import java.util.ArrayList;

import java.util.List;

import Dados.Animal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
public class CartaoVacina {
	@Getter @Setter private Animal animal;
	private List<Vacina> vacinas = new ArrayList<Vacina>();
	private List<AgendaVacina> vacinasAgendadas = new ArrayList<AgendaVacina>();

	public CartaoVacina(Animal animal, List<Vacina> vacinas, List<AgendaVacina> vacinasAgendadas) {
		this.animal = animal;
		this.vacinas.addAll(vacinas);
		this.vacinasAgendadas.addAll(vacinasAgendadas);
	}


	public List<Vacina> getVacinas() {
		return vacinas;
	}

	public List<AgendaVacina> getvacinasAgendadas() {
		return vacinasAgendadas;
	}

	public void setVacinas(List<Vacina> vacinas) {
		this.vacinas.addAll(vacinas);
	}

	public void setVacinas(Vacina vacinas) {
		this.vacinas.add(vacinas);
	}

	public void setvacinasAgendadas(List<AgendaVacina> vacinasAgendadas) {
		this.vacinasAgendadas.addAll(vacinasAgendadas);
	}

	public void setvacinasAgendadas(AgendaVacina vacinasAgendadas) {
		this.vacinasAgendadas.add(vacinasAgendadas);
	}

	public void completaVacinacao(AgendaVacina vacinasAgendadas) {
		this.vacinasAgendadas.remove(vacinasAgendadas);
		this.vacinas.add(vacinasAgendadas.getVacina());
	}

}
