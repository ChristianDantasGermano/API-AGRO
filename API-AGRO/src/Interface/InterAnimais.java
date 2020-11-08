package Interface;

import Dados.Bovinos;
import Dados.Suinos;
import Repository.AnimalRepository;

public class InterAnimais extends InterfaceTexto {
	private static AnimalRepository animais = new AnimalRepository(); ;
	
	public void MenuAnimais() {
		System.out.print("\n##----------Animais---------##\n\n");
		System.out.print("|-----------------------------|\n");
		System.out.print("| Opção 1 - CadastrarBoi      |\n");
		System.out.print("| Opção 2 - CadastrarPorco    |\n");
		System.out.print("| Opção 3 - ConsultarBois     |\n");
		System.out.print("| Opção 4 - ConsultarPorcos   |\n");
		System.out.print("| Opção 5 - Voltar            |\n");
		System.out.print("|-----------------------------|\n");
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
			break;
		case 4:
			ConPorcos();
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
		animais.setBois(valorArrayTexto, valorArrayDouble);
		MenuAnimais();
	}
	
	private void CadSuino() {
		System.out.print("##---------CAD-Suino-------##\n\n");
		Cad();
		animais.setSuinos(valorArrayTexto, valorArrayDouble);
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
	
	private void ConBois(){
		System.out.print("##---------CON-Bovino-------##\n\n");
		for(Bovinos obj: animais.getBois()) {
			System.out.print("\nBoi: "+obj.getRegistro()+" "+obj.getRaca()+" "+obj.getGenero()+
					" "+obj.getDataNascimento()+" "+obj.getPesoKg()+"Kg "+obj.getPesoArroba()+"@ ");
		}
		MenuAnimais();			
	}
	
	private void ConPorcos(){
		System.out.print("##---------CON-Suínos-------##\n\n");
		for(Suinos obj: animais.getSuinos()) {
			System.out.print("\nPorco: "+obj.getRegistro()+" "+obj.getRaca()+" "+obj.getGenero()+
					" "+obj.getDataNascimento()+" "+obj.getPesoKg()+"Kg "+obj.getPesoArroba()+"@ ");
		}
		MenuAnimais();			
	}

}
