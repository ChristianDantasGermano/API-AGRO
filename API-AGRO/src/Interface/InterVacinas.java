package Interface;

import Repository.VacinaRepository;
import Vacinacao.VacinaBovino;
import Vacinacao.VacinaSuino;

public class InterVacinas extends InterfaceTexto{

	private static VacinaRepository vacinas = new VacinaRepository();
	
	public void MenuVacinas() {
		System.out.print("##-------------Vacinas-------------##\n\n");
		System.out.print("|-----------------------------------|\n");
		System.out.print("| Opção 1 - Cadastrar Vacinas Boi   |\n");
		System.out.print("| Opção 2 - Cadastrar Vacinas Porco |\n");
		System.out.print("| Opção 3 - Consultar Vacinas Boi   |\n");
		System.out.print("| Opção 4 - Consultar Vacinas Porco |\n");
		System.out.print("| Opção 5 - Voltar                  |\n");
		System.out.print("|-----------------------------------|\n");
		System.out.print("Digite uma opção:");
		valorInt = ler.nextInt();
		switch (valorInt) {
		case 1:
			CadVacinasBoi();
			break;
		case 2:
			CadVacinasPorco();
			break;
		case 3:
			ConVacinasBoi();
			break;
		case 4:
			ConVacinasPorco();
			break;
		case 5:
			MenuPrincipal();
			break;
		default:
			System.out.print("\nOpção Incorreta!");
			break;
		}
	}
	
	private void Cad() {
		valorArrayTexto = new String[3];
		System.out.print("O nome da vacina:");
		valorArrayTexto[0] =  ler.next();
		System.out.print("Descrição:");
		valorArrayTexto[1] =  ler.next();
		System.out.print("Observação(sé necessário):");
		valorArrayTexto[2] =  ler.next();	
	}
	
	protected void CadVacinasBoi() {
		System.out.print("##------CAD-VACINAS-BOIS-----##\n\n");
		Cad();
		vacinas.setBois(valorArrayTexto);
		MenuVacinas();
	}
	
	protected void CadVacinasPorco() {
    	System.out.print("##------CAD-VACINAS-PORCOS---##\n\n");
    	Cad();
		vacinas.setSuinos(valorArrayTexto);
		MenuVacinas();
	}
    
    protected void ConVacinasBoi() {
		System.out.print("##------CON-VACINAS-BOIS-----##\n\n");
		for(VacinaBovino obj: vacinas.getBois()) {
			System.out.print("\nVacina codigo("+obj.getCod()+"): "+obj.getNome()+" "+obj.getDescricao()+" "+obj.getObservacao()+"\n");
		}
		MenuVacinas();	
	}
	
	protected void ConVacinasPorco() {
		System.out.print("##------CON-VACINAS-PORCOS---##\n\n");
		for(VacinaSuino obj: vacinas.getSuinos()) {
			System.out.print("\nVacina codigo("+obj.getCod()+"): "+obj.getNome()+" "+obj.getDescricao()+" "+obj.getObservacao()+"\n");
		}
		MenuVacinas();
	}
}
