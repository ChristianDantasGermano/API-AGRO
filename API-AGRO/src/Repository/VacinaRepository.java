package Repository;

import java.util.ArrayList;
import java.util.List;

import Vacinacao.VacinaBovino;
import Vacinacao.VacinaSuino;
import lombok.Getter;

public class VacinaRepository {
	private @Getter List<VacinaBovino> bois = new ArrayList<VacinaBovino>();
	private @Getter List<VacinaSuino> suinos = new ArrayList<VacinaSuino>();
	private int codeBoi;
	private int codePorco;
	
	public VacinaRepository() {
		codeBoi=0;
		codePorco=0;
	}
	
	public VacinaBovino GetVacinaBovino(int index) {
		return bois.get(index);
	}
	
	public VacinaSuino GetVacinaSuino(int index) {
		return suinos.get(index);
	}
	
	public void setBois(String[] valor) {
		VacinaBovino obj = new VacinaBovino(codeBoi,valor[0],valor[1],valor[2]);
		codeBoi++;
		bois.add(obj);
	}
	
	public void setSuinos(String[] valor) {
		VacinaSuino obj = new VacinaSuino(codePorco,valor[0],valor[1],valor[2]);
		codePorco++;
		suinos.add(obj);
	}
}
