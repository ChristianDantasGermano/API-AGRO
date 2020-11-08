package Dados;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Bovinos extends Animal {

	public Bovinos(double registro, Peso peso, String raca, String genero, String dataNascimento) {
		super(registro, peso, raca, genero, dataNascimento);
	}

}