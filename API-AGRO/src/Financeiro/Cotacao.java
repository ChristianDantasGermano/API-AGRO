package Financeiro;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor 
public class Cotacao {
	@Getter @Setter protected double cotacaoKg;
	@Getter @Setter protected double cotacaoArroba;
}
