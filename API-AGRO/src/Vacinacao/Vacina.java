package Vacinacao;

public abstract class Vacina {
	protected String nome;
	protected String descricao;
	protected String observacao;

	protected Vacina(String nome, String descricao, String observacao) {
		this.nome = nome;
		this.descricao = descricao;
		this.observacao = observacao;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getObservacao() {
		return observacao;
	}

}
