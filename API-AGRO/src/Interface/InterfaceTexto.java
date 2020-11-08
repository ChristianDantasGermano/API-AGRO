package Interface;

import java.util.Scanner;

public class InterfaceTexto {
	protected InterAnimais animais;
	protected InterVacinas vacinas; 
	protected InterVendas vendas; 
	protected InterRelatorios relatorios; 

	protected Scanner ler = new Scanner(System.in);
	protected int valorInt;
	protected String valorTexto;
	protected double valorDouble;

	public void MenuPrincipal() {
		System.out.print("##----------API-AGRO---------##\n\n");
		System.out.print("|-----------------------------|\n");
		System.out.print("| Op��o 1 - Animais           |\n");
		System.out.print("| Op��o 2 - Vacina��o         |\n");
		System.out.print("| Op��o 3 - Vendas            |\n");
		System.out.print("| Op��o 4 - Relat�rios        |\n");
		System.out.print("| Op��o 5 - Sair              |\n");
		System.out.print("|-----------------------------|\n");
		System.out.print("Digite uma op��o:");
		valorInt = ler.nextInt();

		switch (valorInt) {
			case 1:
				animais = new InterAnimais();
				break;
			case 2:
				vacinas = new InterVacinas();
				break;
			case 3:
				vendas = new InterVendas();
				break;
			case 4:
				relatorios = new InterRelatorios();
				break;
			case 5:
				System.out.print("\nSair");
				break;
			default:
				System.out.print("\nOp��o Incorreta!");
				break;					
		}
	}
}
