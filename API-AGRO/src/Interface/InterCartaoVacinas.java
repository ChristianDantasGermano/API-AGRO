package Interface;

import Dados.Animal;
import Vacinacao.AgendaVacina;
import Vacinacao.Vacina;

public class InterCartaoVacinas extends InterAnimais{
	private	Animal ani;
	private int escAnimal;
		
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
		escAnimal=0;
		MenuCartaoVacinas();
	}
	
	private void EscolherAnimalPorco() {
		System.out.print("Escolha qual boi:");
		ConPorcos();
		System.out.print("\nDigite o codigo:");
		valorInt = ler.nextInt();
		ani = animais.GetSuino(valorInt);
		escAnimal=1;
		MenuCartaoVacinas();
	}
	
	public void MenuCartaoVacinas() {	
		System.out.print("##------------Cartão-Vacinas--------##\n\n");
		System.out.print("|------------------------------------|\n");
		System.out.print("| Opção 1 - Vacinas Tomadas          |\n");
		System.out.print("| Opção 2 - Agendar Vacina           |\n");
		System.out.print("| Opção 3 - Vacinas Agendadas        |\n");
		System.out.print("| Opção 4 - Voltar                   |\n");
		System.out.print("|------------------------------------|\n");
		System.out.print("Digite uma opção:");
		valorInt = ler.nextInt();
		switch (valorInt) {
		case 1:
			VacinasTomadas();
			break;
		case 2:
			AgendarVacina();
			break;
		case 3:
			VacinasAgendadas();
			break;
		case 4:
			MenuPrincipal();
			break;
		default:
			System.out.print("\nOpção Incorreta!");
			break;
		}
	}
	
	public void AgendarVacina() {
		System.out.print("##-------AGENDA-VACINAS-------##\n\n");
		System.out.print("\nDigite a data de agendamento:");
		valorTexto = ler.next();
		System.out.print("\nSelecione a Vacina");
		if(escAnimal == 0) {
			ConVacinasBoi();
		}
		else {
			ConVacinasPorco();
		}
		System.out.print("\nDigite o código da Vacina:");
		valorInt = ler.nextInt();
		if(escAnimal == 0) {
			cartaoVacina.AgendaVacina(ani,vacinas.GetVacinaBovino(valorInt),valorTexto);
		}
		else {
			cartaoVacina.AgendaVacina(ani,vacinas.GetVacinaSuino(valorInt),valorTexto);
		}
		MenuCartaoVacinas();
	}
	
	public void VacinasAgendadas() {
		System.out.print("##------VACINAS-AGENDADAS------##\n\n");
		for(AgendaVacina obj: cartaoVacina.VacinasAgendads(ani)) {
			System.out.print("\nVacina codigo("+obj.getVacina().getCod()+"): "+obj.getVacina().getNome()+" Agenda para data:"+obj.getDataVacinacao()+"\n");
		}
		MenuCartaoVacinas();
	}
	
	
	
	public void VacinasTomadas() {
		System.out.print("##----------VACINAS----------##\n\n");
		for(Vacina obj: cartaoVacina.VacinasTomadas(ani)) {
			System.out.print("\nVacina codigo("+obj.getCod()+"): "+obj.getNome()+" "+obj.getDescricao()+" "+obj.getObservacao()+"\n");
		}
		MenuCartaoVacinas();
	}
	
	public void AdcVacinasTomadas() {
		if(escAnimal == 0) {
			AdcVacinaBoi();
		}
		else {
			AdcVacinaPorco();
		}
		MenuCartaoVacinas();
	}
	

}
