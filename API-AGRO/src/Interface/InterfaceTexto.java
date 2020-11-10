package Interface;

import java.util.Scanner;

import Repository.*;

public class InterfaceTexto{
	
	public static AnimalRepository animais = new AnimalRepository();
	public static CartaoVacinaRepository cartaoVacina = new CartaoVacinaRepository();
	public static VacinaRepository vacinas = new VacinaRepository();
	public static VendaRepository vendas = new VendaRepository();
	
	protected InterAnimais intanimais;
	protected InterVacinas intvacinas; 
	protected InterVendas intvendas;
	protected InterRelatorios intrelatorios;
	protected InterCartaoVacinas intCartaoVacinas; 
	
	protected Scanner ler = new Scanner(System.in);
	protected int valorInt;
	protected String valorTexto;
	protected double valorDouble;
	protected String[] valorArrayTexto;
	protected int[] valorArrayInt;
	protected double[] valorArrayDouble;
	
	public void MenuPrincipal() {
		intanimais = new InterAnimais();
		intvacinas = new InterVacinas(); 
		intvendas = new InterVendas();
		intrelatorios = new InterRelatorios();
		intCartaoVacinas = new InterCartaoVacinas();
				
		System.out.print("##-------------API-AGRO------------##\n\n");
		System.out.print("|-----------------------------------|\n");
		System.out.print("| Opção 1 - Animais                 |\n");
		System.out.print("| Opção 2 - Relatórios              |\n");
		System.out.print("| Opção 3 - Vendas                  |\n");
		System.out.print("| Opção 4 - Vacinação               |\n");
		System.out.print("| Opção 5 - Cartão Vacina           |\n");
		System.out.print("| Opção 6 - Sair                    |\n");
		System.out.print("|-----------------------------------|\n");
		System.out.print("Digite uma opção:");
		valorInt = ler.nextInt();

		switch (valorInt) {
			case 1:
			    intanimais.MenuAnimais();
				break;
			case 2:
				break;
			case 3:
				intvendas.MenuVendas();
				break;
			case 4:
				intvacinas.MenuVacinas();
				break;
			case 5:
				intCartaoVacinas.EscolhaAnimal();
				break;
			case 6:
				System.out.print("\nSair");
				break;
			default:
				System.out.print("\nOpção Incorreta!");
				break;					
		}
	}
}
