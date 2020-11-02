package Vacinacao;

import java.util.Date;

public class AgendaVacina {
	private Vacina vacina;
	private Date dataVacinacao;

	public AgendaVacina(Vacina vacina, Date dataVacinacao) {
		this.vacina = vacina;
		this.dataVacinacao = dataVacinacao;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public Date getDataVacinacao() {
		return dataVacinacao;
	}

	public void setDataVacinacao(Date dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}

}
