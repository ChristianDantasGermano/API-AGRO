package Interface;

public class InterCartaoVacinas extends InterAnimais{

	public InterCartaoVacinas() {
		System.out.print("##------------Cart�o-Vacinas-------##\n\n");
		System.out.print("|Escolha qual tipo de animal:       |\n");
		System.out.print("| Op��o 1 - Boi                     |\n");
		System.out.print("| Op��o 2 - Porco                   |\n");
		System.out.print("| Op��o 3 - Voltar                  |\n");
		System.out.print("|-----------------------------------|\n");
		System.out.print("Digite uma op��o:");
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
			System.out.print("\nOp��o Incorreta!");
			break;
		}
	}
	
	private void EscolherAnimalBoi() {
		System.out.print("Escolha qual boi:");
		ConBois();
		System.out.print("Digite o codigo:");
		valorInt = ler.nextInt();
		boi = animais.GetBovino(valorInt);
		MenuCartaoVacinas();
	}
	
	private void EscolherAnimalPorco() {
		System.out.print("Escolha qual boi:");
		ConPorcos();
		System.out.print("Digite o codigo:");
		valorInt = ler.nextInt();
		porco = animais.GetSuino(valorInt);
		MenuCartaoVacinas();
	}
	
	public void MenuCartaoVacinas() {	
		System.out.print("##------------Cart�o-Vacinas--------##\n\n");
		System.out.print("|------------------------------------|\n");
		System.out.print("| Op��o 1 - Vacinas Tomadas          |\n");
		System.out.print("| Op��o 2 - Adicionar Vacinas Tomadas|\n");
		System.out.print("| Op��o 3 - Agendar Vacina           |\n");
		System.out.print("| Op��o 4 - Vacinas Agendadas        |\n");
		System.out.print("| Op��o 5 - Voltar                   |\n");
		System.out.print("|------------------------------------|\n");
		System.out.print("Digite uma op��o:");
		valorInt = ler.nextInt();
		switch (valorInt) {
		case 1:
			//CadVacinasBoi();
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
			System.out.print("\nOp��o Incorreta!");
			break;
		}
	}

}
