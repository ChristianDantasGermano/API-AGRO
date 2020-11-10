package Repository;

import java.util.ArrayList;
import java.util.List;

import Dados.Bovinos;
import Dados.Suinos;
import Financeiro.Venda;
import lombok.Getter;

public class VendaRepository {
	private @Getter List<Venda> vendas = new ArrayList<Venda>();
	
	public void VenderBois(List<Bovinos> bois) {
		Venda obj = new Venda();
		obj.setBovinos(bois);
		obj.CalcularVendaBoi();
		vendas.add(obj);
	}
	
	public void VenderPorcos(List<Suinos> suinos) {
		Venda obj = new Venda();
		obj.setSuinos(suinos);
		obj.CalcularVendaPorco();	
		vendas.add(obj);
	}
	

}
