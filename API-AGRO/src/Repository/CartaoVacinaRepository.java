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
	}
	
}
