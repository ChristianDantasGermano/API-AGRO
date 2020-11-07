package Vacinacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor 
public class AgendaVacina {
	@Getter @Setter private Vacina vacina;
	@Getter @Setter private String dataVacinacao;

}
