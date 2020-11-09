package Vacinacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor 
public abstract class Vacina {
	@Getter @Setter protected int cod;
	@Getter @Setter protected String nome;
	@Getter @Setter protected String descricao;
	@Getter @Setter protected String observacao;
}
