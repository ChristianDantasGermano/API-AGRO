package Interface;

import java.util.ArrayList;
import java.util.List;

import Dados.Bovinos;
import Dados.Suinos;
import Vacinacao.Vacina;
import Vacinacao.VacinaBovino;
import Vacinacao.VacinaSuino;

public class InterAnimais extends InterfaceTexto{
	
	protected Bovinos boi;
	protected Suinos porco;
	
	public void MenuAnimais() {
		System.out.print("\n##-----------Animais-------------##\n\n");
		System.out.print("|-----------------------------------|\n");
		System.out.print("| Opção 1 - CadastrarBoi            |\n");
		System.out.print("| Opção 2 - CadastrarPorco          |\n");
		System.out.print("| Opção 3 - ConsultarBois           |\n");
		System.out.print("| Opção 4 - ConsultarPorcos         |\n");
		System.out.print("| Opção 5 - Voltar                  |\n");
		System.out.print("|-----------------------------------|\n");
		System.out.print("Digite uma opção:");
		valorInt = ler.nextInt();
		switch (valorInt) {
		case 1:
			CadBoi();
			break;
		case 2:
			CadSuino();
			break;
		case 3:
			ConBois();
			MenuAnimais();
			break;
		case 4:
			ConPorcos();
			MenuAnimais();
			break;
		case 5:
			MenuPrincipal();
			break;
		default:
			System.out.print("\nOpção Incorreta!");
			break;
		}
	}
	
	private void CadBoi() {
		System.out.print("##---------CAD-Bovino-------##\n\n");
		Cad();
		boi = new Bovinos(valorArrayTexto[0],valorArrayTexto[1],valorArrayTexto[2]);
		animais.setBois(valorArrayDouble,boi);
		AdcVacinaBoi();
		MenuAnimais();
	}
	
	private void CadSuino() {
		System.out.print("##---------CAD-Suino-------##\n\n");
		Cad();
		porco = new Suinos(valorArrayTexto[0],valorArrayTexto[1],valorArrayTexto[2]);
		animais.setSuinos(valorArrayDouble, porco);
		AdcVacinaPorco();
		MenuAnimais();
	}
	
	private void Cad() {
		valorArrayTexto = new String[3];
		valorArrayDouble = new double[2];
		System.out.print("Digite a raça:");
		valorArrayTexto[0] =  ler.next();
		System.out.print("Digite o gênero:");
		valorArrayTexto[1] =  ler.next();
		System.out.print("Digite a data de nascimento:");
		valorArrayTexto[2] =  ler.next();
		System.out.print("Digite o peso em KG:");
		valorArrayDouble[0] =  ler.nextDouble();
		System.out.print("Digite o peso em Arroba(se aplicavel):");
		valorArrayDouble[1] =  ler.nextDouble();	
	}
	
	protected void ConBois(){
		System.out.print("\n##---------CON-Bovino-------##\n\n");
		for(Bovinos obj: animais.getBois()) {
			System.out.print("\nBoi: codigo("+obj.getRegistro()+"):"+obj.getRaca()+" "+obj.getGenero()+
					" "+obj.getDataNascimento()+" "+obj.getPesoKg()+"Kg "+obj.getPesoArroba()+"@ ");
		}			
	}
	
	protected void ConPorcos(){
		System.out.print("\n##---------CON-Suínos-------##\n\n");
		for(Suinos obj: animais.getSuinos()) {
			System.out.print("\nPorco codigo("+obj.getRegistro()+"): "+obj.getRaca()+" "+obj.getGenero()+
					" "+obj.getDataNascimento()+" "+obj.getPesoKg()+"Kg "+obj.getPesoArroba()+"@\n");
		}		
	}
	
	protected void AdcVacinaBoi(){
		List<Vacina> vacinasBoi = new ArrayList<Vacina>();
		
		ConVacinasBoi();
		System.out.print("\nSelecione as Vacinas já tomadas");
		System.out.print("\nDigite o codigo da vacina(separa por ';'):");
		valorTexto = ler.next();
		String valores[] = valorTexto.split(";");
		for(String var :valores) {
			int temp = Integer.parseInt(var);
			vacinasBoi.add(vacinas.GetVacinaBovino(temp));
		}
		cartaoVacina.setCartaoVacina(boi, vacinasBoi);
		System.out.print("Cadastrado com sucesso!");
	}
	
	protected void AdcVacinaPorco(){
		List<Vacina> vacinasPorco = new ArrayList<Vacina>();
		
		ConVacinasPorco();
		System.out.print("\nSelecione as Vacinas já tomadas");
		System.out.print("\nDigite o codigo da vacina(separa por ';'):");
		valorTexto = ler.next();
		String valores[] = valorTexto.split(";");
		for(String var :valores) {
			int temp = Integer.parseInt(var);			
			vacinasPorco.add(vacinas.GetVacinaSuino(temp));
		}
		cartaoVacina.setCartaoVacina(porco, vacinasPorco);
		System.out.print("\nCadastrado com sucesso!");
	}
	
	protected void ConVacinasBoi() {
		System.out.print("\n##----------VACINAS---------##\n\n");
		for(VacinaBovino obj: vacinas.getBois()) {
			System.out.print("\nVacina codigo("+obj.getCod()+"): "+obj.getNome()+" "+obj.getDescricao()+" "+obj.getObservacao()+"\n");
		}	
	}
	
	protected void ConVacinasPorco() {
		System.out.print("\n##----------VACINAS---------##\n\n");
		for(VacinaSuino obj: vacinas.getSuinos()) {
			System.out.print("\nVacina codigo("+obj.getCod()+"): "+obj.getNome()+" "+obj.getDescricao()+" "+obj.getObservacao()+"\n");
		}
	}

}
