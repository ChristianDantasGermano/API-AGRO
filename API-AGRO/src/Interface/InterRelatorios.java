package Interface;

import java.util.ArrayList;
import Dados.Animal;
import DadosGerados.Relatorios;

public class InterRelatorios extends InterfaceTexto{
	public ArrayList<Object> animal = new ArrayList<Object>();
	public ArrayList<Object> vacinas = new ArrayList<Object>();
	
	public void MenuRelatorio() {
		setarListas();
		Relatorios rl = new Relatorios(animal,cartaoVacina.getCartaoVacina());
		System.out.print("##----------Relatórios---------##\n\n");
		System.out.print("##-----------------------------##\n");
		System.out.print("||     totalAnimais: "+rl.getTotalAnimais()+"\n");
		System.out.print("||     totalKg: "+rl.getTotalKg() +"\n");
		System.out.print("||     totalArroba: "+rl.getTotalArroba()+"\n");
		System.out.print("||     QuantMachos: "+rl.getQuantMachos()+"\n");
		System.out.print("||     QuantFemeas: "+rl.getQuantFemeas()+"\n");
		System.out.print("||     AnimaisVacinados: "+rl.getQuantVacinado()+"%\n");
		System.out.print("||     FaltamVacinar: "+rl.getQuantFaltaVacinar()+"%\n");
		System.out.print("||     PrecoTotalKg: "+rl.getTotalPrecokg()+"\n");
		System.out.print("||     PrecoTotal@: "+rl.getTotalPrecoarroba()+"\n");
		System.out.print("##-----------------------------##\n");
		//rl.getQuantVacinado()
		//rl.getQuantFaltaVacinar()
		MenuPrincipal();	
	}
	public void setarListas() {
		if(animais.getBois().size() > 0) {
			for(Animal obj : animais.getBois()) {
				this.animal.add(obj.getRegistro());
				this.animal.add(obj.getRaca());
				this.animal.add(obj.getGenero());
				this.animal.add(obj.getDataNascimento());
				this.animal.add(obj.getPesoKg());
				this.animal.add(obj.getPesoArroba());
			}
		}
		if(animais.getSuinos().size() > 0) {
			for(Animal obj : animais.getSuinos()) {
				this.animal.add(obj.getRegistro());
				this.animal.add(obj.getRaca());
				this.animal.add(obj.getGenero());
				this.animal.add(obj.getDataNascimento());
				this.animal.add(obj.getPesoKg());
				this.animal.add(obj.getPesoArroba());
			}
		}
		
	}

}
