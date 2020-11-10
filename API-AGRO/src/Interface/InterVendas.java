package Interface;

import java.util.ArrayList;
import java.util.List;

import Dados.Bovinos;
import Dados.Suinos;
import Financeiro.Venda;

public class InterVendas extends InterAnimais{

		public void MenuVendas() {
			System.out.print("##----------Vendas---------##\n\n");
			System.out.print("|-----------------------------|\n");
			System.out.print("| Opção 1 - VenderBoi         |\n");
			System.out.print("| Opção 2 - VenderPorco       |\n");
			System.out.print("| Opção 3 - Histórico Vendas  |\n");
			System.out.print("| Opção 4 - Setar Cotação KG  |\n");
			System.out.print("| Opção 5 - Setar Cotação @   |\n");
			System.out.print("| Opção 4 - Voltar            |\n");
			System.out.print("|-----------------------------|\n");
			System.out.print("Digite uma opção:");
			valorInt = ler.nextInt();		
			switch (valorInt) {
			case 1:
				VenderBoi();
				break;
			case 2:
				VenderPorco();
				break;
			case 3:
				HistoricoVendas();
				break;
			case 4:
				MenuPrincipal();
				break;
			default:
				System.out.print("\nOpção Incorreta!");
				break;
			}	
		}
		
		public void VenderBoi() {
			List<Bovinos> bois = new ArrayList<Bovinos>();
			ConBois();
			System.out.print("\nSelecione os Bois para venda!!! ");
			System.out.print("\nDigite o codigo do boi(separa por ';'):");
			valorTexto = ler.next();
			String valores[] = valorTexto.split(";");
			for(String var :valores) {
				int temp = Integer.parseInt(var);			
				bois.add(animais.GetBovino(temp));
			}
			vendas.VenderBois(bois);
			System.out.print("\nVendido com sucesso!");
			animais.EliminarBois(bois);
			MenuVendas();
		}
		
		public void VenderPorco() {
			List<Suinos> porcos = new ArrayList<Suinos>();
			ConPorcos();
			System.out.print("\nSelecione os Bois para venda!!! ");
			System.out.print("\nDigite o codigo do boi(separa por ';'):");
			valorTexto = ler.next();
			String valores[] = valorTexto.split(";");
			for(String var :valores) {
				int temp = Integer.parseInt(var);			
				porcos.add(animais.GetSuino(temp));
			}
			vendas.VenderPorcos(porcos);
			System.out.print("\nVendido com sucesso!");
			animais.EliminarPorcos(porcos);
			MenuVendas();
		}
		
		public void HistoricoVendas() {
			System.out.print("##---------Histórico-Vendas---------##\n\n");
			for(Venda obj: vendas.getVendas()) {
				System.out.print("\nVenda na data("+obj.getDataVenda()+") Valor Total:"+obj.getValorTotalArroba()+"@ Valor Total:"
			    +obj.getValorTotalKg()+"Kg\n");
			}
			MenuVendas();
		}
		

}
