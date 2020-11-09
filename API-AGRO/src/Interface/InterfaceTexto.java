package Interface;

import java.util.Scanner;

import Repository.AnimalRepository;
import Repository.CartaoVacinaRepository;
import Repository.VacinaRepository;

public class InterfaceTexto {
	public static AnimalRepository animais = new AnimalRepository();
	public static CartaoVacinaRepository cartaoVacina = new CartaoVacinaRepository();
	public static VacinaRepository vacina = new VacinaRepository();
	
	protected InterAnimais Intanimais = new InterAnimais();
	protected InterVacinas Intvacinas = new InterVacinas(); 
	protected InterVendas Intvendas = new InterVendas();
	protected InterRelatorios Intrelatorios = new InterRelatorios();
	protected InterCartaoVacinas aIntgendaVacinas= new InterCartaoVacinas(); 

	protected Scanner ler = new Scanner(System.in);
	protected int valorInt;
	protected String valorTexto;
	protected double valorDouble;
	protected String[] valorArrayTexto;
	protected int[] valorArrayInt;
	protected double[] valorArrayDouble;

	public void MenuPrincipal() {
		ler.nextLine();
		System.out.print("##-------------API-AGRO------------##\n\n");
		System.out.print("|-----------------------------------|\n");
		System.out.print("| Op��o 1 - Animais                 |\n");
		System.out.print("| Op��o 2 - Relat�rios              |\n");
		System.out.print("| Op��o 3 - Vendas                  |\n");
		System.out.print("| Op��o 4 - Vacina��o               |\n");
		System.out.print("| Op��o 5 - Agendar Vacina��o       |\n");
		System.out.print("| Op��o 6 - Sair                    |\n");
		System.out.print("|-----------------------------------|\n");
		System.out.print("Digite uma op��o:");
		valorInt = ler.nextInt();

		switch (valorInt) {
			case 1:
				Intanimais.MenuAnimais();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				Intvacinas.MenuVacinas();
				break;
			case 5:
				//agendaVacinas.MenuAgendaVacina();
				break;
			case 6:
				System.out.print("\nSair");
				break;
			default:
				System.out.print("\nOp��o Incorreta!");
				break;					
		}
	}
}
