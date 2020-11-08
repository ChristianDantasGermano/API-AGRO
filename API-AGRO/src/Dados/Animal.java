package Dados;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor 
public abstract class Animal {
	@Getter @Setter protected int registro;
	@Setter protected Peso peso = new Peso();
	@Getter @Setter protected String raca;
	@Getter @Setter protected String genero;
	@Getter @Setter protected String dataNascimento;
	
	public double getPesoKg() {
		return peso.getPesoKg();
	}
	
    public double getPesoArroba() {
    	return peso.getPesoArroba();
	}
}
