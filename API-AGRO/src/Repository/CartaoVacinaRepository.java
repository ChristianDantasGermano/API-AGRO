package Repository;

import java.util.ArrayList;
import java.util.List;

import Dados.Animal;
import Vacinacao.CartaoVacina;
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
	
	public List<Vacina> VacinasTomadas(Animal obj){
		//System.out.println(obj.getRegistro());1
		//System.out.println(cartaoVacina);
		for(CartaoVacina cartao: cartaoVacina) {
			//System.out.println("Dentro for: "+obj.getRegistro());
			//System.out.println("Dentro for: "+cartao.getAnimal().getRegistro());
			if(cartao.getAnimal().getRegistro() == obj.getRegistro()) {
				return cartao.getVacinas();
			}
		}
		System.out.println("Nada encontrado!!!");
		return null;
	}
	
}
