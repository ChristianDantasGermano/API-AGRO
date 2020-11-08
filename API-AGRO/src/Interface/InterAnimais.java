package Interface;

public class InterAnimais extends InterfaceTexto {

	public InterAnimais() {
		System.out.print("##----------Animais---------##\n\n");
		System.out.print("|-----------------------------|\n");
		System.out.print("| Opção 1 - CadastrarBoi      |\n");
		System.out.print("| Opção 2 - CadastrarPorco    |\n");
		System.out.print("| Opção 3 - ConsultarBois     |\n");
		System.out.print("| Opção 4 - ConsultarPorcos   |\n");
		System.out.print("| Opção 5 - Voltar            |\n");
		System.out.print("|-----------------------------|\n");
		System.out.print("Digite uma opção:");
		escolha = ler.nextInt();

		switch (escolha) {
		case 1:
			break;
		case 2:
			System.out.print("\nVacinação");
			break;
		case 3:
			System.out.print("\nVendas");
			break;
		case 4:
			System.out.print("\nRelatórios");
			break;
		case 5:
			MenuPrincipal();
			break;
		default:
			System.out.print("\nOpção Incorreta!");
			break;
		}
	}

}
