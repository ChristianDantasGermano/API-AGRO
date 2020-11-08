package Repository;

import java.util.ArrayList;
import java.util.List;

import Dados.Bovinos;
import Dados.Suinos;
import lombok.Getter;

public class AnimalRepository {
	@Getter List<Bovinos> bois = new ArrayList<Bovinos>();;
	@Getter List<Suinos> suinos = new ArrayList<Suinos>();;
	
	public void setBois(Bovinos obj) {
		bois.add(obj);
	}
	
	public void setSuinos(Suinos obj) {
		suinos.add(obj);
	}
}
 