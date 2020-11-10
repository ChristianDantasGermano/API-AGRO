package Financeiro;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor 
public class Cotacao {
	@Getter @Setter protected double cotacaoKg;
	@Getter @Setter protected double cotacaoArroba;
	
	public Cotacao(){
		cotacaoKg = 280;
		cotacaoArroba = 287;
	}
}
