package menu;

import java.util.Scanner;

import poo.EscolhaUmSabor;
import poo.sabores1;



public class Menu {
	

	public static void main(String[] args) {
		
		


		
		
		String sabor, comprar;
		String nome, cartaoc, cartaod, pix;
				
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
				System.out.println("Comprar: " + "Digite 1 para progresseguir");
				leia.skip("\\R?");
				comprar = leia.nextLine();
				
				
				break;
				
			case 2 :
				System.out.println("Escolher sabores: ");					
				leia.skip("\\R?");
				sabor = leia.nextLine();
				System.out.println("Obrigado!");
				
				switch (sabor) {
				case 1 -> {
					System.out.println("Chocolate"); 
					String chocolate = leia.nextLine();
			}
				case 2 -> {
					System.out.println("Morango");
					String morango = leia.nextLine();
					}
				case 3 -> {
					System.out.println("Ninho com Nutella");
					String Ninho = leia.nextLine();
					
					case 4 -> {
						System.out.println("Abacaxi");
						String abacaxi = leia.nextLine();
						
			//não sei onde eu erreiiiiii			
					}
				}
				
				
				
				}
				
				
				break;
				
			case 3 : 
				System.out.println("Cadastrar Nome ao Site");
				leia.skip("\\R?");
				nome = leia.nextLine();
				System.out.println("Nome Cadastrado!");				
				break;
				
			case 4 :
				System.out.println("Formas de pagamentos: 1 para Cartão de Crédito, 2 para Cartão de débito, 3 para pix"  );
				leia.skip("\\R?");
				cartaoc = leia.nextLine();
				leia.skip("\\R?");
				cartaod = leia.nextLine();
				leia.skip("\\R?");
				pix = leia.nextLine();
				System.out.println("Forma de pagamento concluida !");
				
				
				break;
				
			case 5 :
				System.out.println("Endereço: Rua da Flores Nº33 Bairro Brasil");
				
				
				
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
