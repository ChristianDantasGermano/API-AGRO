package Dados;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor 
public abstract class Animal {
	@Getter @Setter protected double registro;
	@Getter @Setter protected Peso peso;
	@Getter @Setter protected String raca;
	@Getter @Setter protected String genero;
	@Getter @Setter protected String dataNascimento;
		
}
