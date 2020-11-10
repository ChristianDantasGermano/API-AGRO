package Interface;

import Dados.Animal;
import Vacinacao.Vacina;

public class InterCartaoVacinas extends InterAnimais{
	private	Animal ani;
		
	public void EscolhaAnimal() {
		System.out.print("##------------Cartão-Vacinas-------##\n\n");
		System.out.print("|Escolha qual tipo de animal:       |\n");
		System.out.print("| Opção 1 - Boi                     |\n");
		System.out.print("| Opção 2 - Porco                   |\n");
		System.out.print("| Opção 3 - Voltar                  |\n");
		System.out.print("|-----------------------------------|\n");
		System.out.print("Digite uma opção:");
		valorInt = ler.nextInt();
		switch (valorInt) {
		case 1:
			EscolherAnimalBoi();
			break;
		case 2:
			EscolherAnimalPorco();
			break;
		case 3:
			MenuPrincipal();
			break;
		default:
			System.out.print("\nOpção Incorreta!");
			break;
		}
	}
	
	private void EscolherAnimalBoi() {
		System.out.print("Escolha qual boi:");
		ConBois();
		System.out.print("\nDigite o codigo:");
		valorInt = ler.nextInt();
		ani = animais.GetBovino(valorInt);
		MenuCartaoVacinas();
	}
	
	private void EscolherAnimalPorco() {
		System.out.print("Escolha qual boi:");
		ConPorcos();
		System.out.print("\nDigite o codigo:");
		valorInt = ler.nextInt();
		ani = animais.GetSuino(valorInt);
		MenuCartaoVacinas();
	}
	
	public void MenuCartaoVacinas() {	
		System.out.print("##------------Cartão-Vacinas--------##\n\n");
		System.out.print("|------------------------------------|\n");
		System.out.print("| Opção 1 - Vacinas Tomadas          |\n");
		System.out.print("| Opção 2 - Adicionar Vacinas Tomadas|\n");
		System.out.print("| Opção 3 - Agendar Vacina           |\n");
		System.out.print("| Opção 4 - Vacinas Agendadas        |\n");
		System.out.print("| Opção 5 - Voltar                   |\n");
		System.out.print("|------------------------------------|\n");
		System.out.print("Digite uma opção:");
		valorInt = ler.nextInt();
		switch (valorInt) {
		case 1:
			VacinasTomadas();
			break;
		case 2:
			//CadVacinasPorco();
			break;
		case 3:
			//ConVacinasBoi();
			break;
		case 4:
			//ConVacinasPorco();
			break;
		case 5:
			MenuPrincipal();
			break;
		default:
			System.out.print("\nOpção Incorreta!");
			break;
		}
	}
	
	public void VacinasTomadas() {
		System.out.print("##----------VACINAS----------##\n\n");
		for(Vacina obj: cartaoVacina.VacinasTomadas(ani)) {
			System.out.print("\nVacina codigo("+obj.getCod()+"): "+obj.getNome()+" "+obj.getDescricao()+" "+obj.getObservacao()+"\n");
		}
		MenuCartaoVacinas();
	}

}
