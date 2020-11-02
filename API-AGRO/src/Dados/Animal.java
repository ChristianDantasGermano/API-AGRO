package Dados;

import java.util.Date;

public abstract class Animal {
	protected double registro;
	protected int peso;
	protected String raca;
	protected String genero;
	protected Date dataNascimento;

	protected Animal(double registro, int peso, String raca, String genero, Date dataNascimento) {
		this.registro = registro;
		this.peso = peso;
		this.raca = raca;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
	}

	public double getRegistro() {
		return registro;
	}

	public int getPeso() {
		return peso;
	}

	public String getRaca() {
		return raca;
	}

	public String getGenero() {
		return genero;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

}
