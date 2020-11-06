package Dados;

import java.util.Date;

import Calculos.Peso;

public abstract class Animal {
	protected double registro;
	protected Peso peso;
	protected String raca;
	protected String genero;
	protected Date dataNascimento;

	protected Animal(double registro, Peso peso, String raca, String genero, Date dataNascimento) {
		this.registro = registro;
		this.peso = peso;
		this.raca = raca;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
	}

	public double getRegistro() {
		return registro;
	}

	public Peso getPeso() {
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
