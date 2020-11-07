package Financeiro;

import java.util.ArrayList;

import java.util.Date;

import Dados.Peso;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Venda {

	@Getter @Setter private ArrayList<Object> animais = new ArrayList<Object>();
	@Getter @Setter private ArrayList<Object> valorAnimalUni = new ArrayList<Object>();
	@Getter @Setter private ArrayList<Object> valorTotal = new ArrayList<Object>();
	@Getter @Setter private Date dataVenda;
	@Getter @Setter private double valorArroba = 0;
	@Getter @Setter private double valorKg = 0;
	/*
	private CalculoPrecoArroba calculoArroba;
    private CalculoPrecoKg calculoKg;
    
	public void precosVenda(ArrayList<Object> animais) {
		for (int i = 1; i < animais.size(); i = i + 6) {
			Peso p = new Peso((double) animais.get(i), (double) animais.get(i + 1));
			this.valorArroba = this.valorArroba + p.getPesoArroba();
			this.valorKg = this.valorKg + p.getPesoKg();
			calculoArroba = new CalculoPrecoArroba(this.valorArroba);
			calculoKg = new CalculoPrecoKg(this.valorKg);
			// valorAnimalUni.add(calculoArroba, calculoKg);
		}
		calculoArroba = new CalculoPrecoArroba(this.valorArroba);
		calculoKg = new CalculoPrecoKg(this.valorKg);
	}
	*/
}
