package classeprincipal;

import java.util.Scanner;



public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int opcao;
		
		while (true) {
			
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                E-COMMERCE BOLO DE POTE              ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Comprar                              ");
		System.out.println("            2 - Escolher sabores                     ");
		System.out.println("            3 - Cadastrar Nome ao site               ");
		System.out.println("            4 - Formas de pagamento                  ");
		System.out.println("            5 - Endereço                             ");
		System.out.println("            6 - Sair                                 ");
		System.out.println("*****************************************************");
		System.out.println("                Entre com a opção desejada:          ");
		System.out.println("                                                     ");
		
		opcao = leia.nextInt();
		
		if (opcao ==6) {
			System.out.println("Vai sair assim sem nenhum bolinho??? ");
			sobre();
			leia.close();
			System.exit(0);
			
			
			switch (opcao) {
			case 1 :
				System.out.println("Comprar: ");
				
				break;
				
			case 2 :
				System.out.println("Escolher sabores: ");
				
				break;
				
			case 3 : 
				System.out.println("Cadastrar Nome ao Site");
				
				break;
				
			case 4 :
				System.out.println("Formas de pagamentos:");
				
				break;
				
			case 5 :
				System.out.println("Endereço: ");
				
			break;
			default:
				System.out.println("Até Mais!!!");
				break;
				
			}
		}
			
		}
		
	}

	private static void sobre() {
		
		
	}

}
