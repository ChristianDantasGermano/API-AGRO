package Repository;

import java.util.ArrayList;
import java.util.List;

import Dados.Animal;
import Vacinacao.CartaoVacina;
import Vacinacao.AgendaVacina;
import Vacinacao.Vacina;
import lombok.Getter;

public class CartaoVacinaRepository {
	private @Getter List<CartaoVacina> cartaoVacina = new ArrayList<CartaoVacina>();
	
	public void setCartaoVacina(Animal animal,List<Vacina> vacinas) {
		CartaoVacina obj = new CartaoVacina();
		obj.setAnimal(animal);
		obj.setVacinas(vacinas);
		cartaoVacina.add(obj);
	}
	
	public void AgendaVacina(Animal animal,Vacina vacinas,String data) {
		AgendaVacina obj = new AgendaVacina(vacinas,data);	
		for(CartaoVacina cartao: cartaoVacina) {
			if(cartao.getAnimal().getRegistro() == animal.getRegistro()) {
				cartao.setvacinasAgendadas(obj);
			}
		}
	}
	
	public List<Vacina> VacinasTomadas(Animal obj){
		for(CartaoVacina cartao: cartaoVacina) {
			if(cartao.getAnimal().getRegistro() == obj.getRegistro()) {
				return cartao.getVacinas();
			}
		}
		System.out.println("Nada encontrado!!!");
		return null;
	}
	
	public List<AgendaVacina> VacinasAgendads(Animal obj){
		for(CartaoVacina cartao: cartaoVacina) {
			if(cartao.getAnimal().getRegistro() == obj.getRegistro()) {
				return cartao.getVacinasAgendadas();
			}
		}
		System.out.println("Nada encontrado!!!");
		return null;
	}
	
	
	
}
