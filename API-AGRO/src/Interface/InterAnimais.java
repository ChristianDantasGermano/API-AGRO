package Interface;

public class InterAnimais extends InterfaceTexto {

	public InterAnimais() {
		System.out.print("##----------Animais---------##\n\n");
		System.out.print("|-----------------------------|\n");
		System.out.print("| Op��o 1 - CadastrarBoi      |\n");
		System.out.print("| Op��o 2 - CadastrarPorco    |\n");
		System.out.print("| Op��o 3 - ConsultarBois     |\n");
		System.out.print("| Op��o 4 - ConsultarPorcos   |\n");
		System.out.print("| Op��o 5 - Voltar            |\n");
		System.out.print("|-----------------------------|\n");
		System.out.print("Digite uma op��o:");
		escolha = ler.nextInt();

		switch (escolha) {
		case 1:
			break;
		case 2:
			System.out.print("\nVacina��o");
			break;
		case 3:
			System.out.print("\nVendas");
			break;
		case 4:
			System.out.print("\nRelat�rios");
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
