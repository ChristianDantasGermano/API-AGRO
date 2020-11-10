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
		codeBoi=3;
		codePorco=3;
		
		VacinaBovino bov1 = new VacinaBovino(0,"Brucelose","Uso entre 3 e 8 meses","somente em fêmeas");
		VacinaBovino bov2 = new VacinaBovino(1,"Clostridioses","Causa mortalidade rapida","A parti 2 meses");
		VacinaBovino bov3 = new VacinaBovino(2,"Leptospirose","Aplica entre 3 e 6 meses de idade","A cada 6 meses");
		
		VacinaSuino sui1 = new VacinaSuino(0,"Rinite atrófica","Espirros","Dada com 7 dias");
		VacinaSuino sui2 = new VacinaSuino(1,"Pleuropneumonia","Perda de peso","aplica 4 e 5 semnas");
		VacinaSuino sui3 = new VacinaSuino(2,"Leptospirose","Abordo","1ª dose no desmame");
		
		bois.add(bov1);
		bois.add(bov2);
		bois.add(bov3);
		
		suinos.add(sui1);
		suinos.add(sui2);
		suinos.add(sui3);
			
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
