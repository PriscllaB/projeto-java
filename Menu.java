package menu;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Menu {
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		String  comprar, endereco, nome;
		
				
		
		int opcao, produto, quantidade, pagamento;
		
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
			
			
			
			switch (opcao) {
			case 1 :
				
				comprar = leia.nextLine();
				System.out.println("Comprar: " + "Digite 1 para progresseguir"+ comprar);
				
				break;
				
			case 2 :					
				System.out.println("Digite o codigo do produto: 1 - Chocolate");
				System.out.println("Digite o codigo do produto: 2 - Morango");
				System.out.println("Digite o codigo do produto: 3 - Ninho com Nutela");
				System.out.println("Digite o codigo do produto: 4 - Abacaxi");
				 produto = leia.nextInt();
				
				System.out.println("Digite a quantidade");
				 quantidade = leia.nextInt();
				
				
				switch (produto) {
				case 1 : 
					
					System.out.println("Chocolate"); 
					System.out.println("Valor total da compra" + (quantidade*15.00));					
					
					break;
			
				case 2: 
					
					System.out.println("Morango");
					System.out.println("Valor total da compra" + (quantidade*15.00));
					break;
					
				case 3 : 
					 
					System.out.println("Ninho com Nutella");
					System.out.println("Valor total da compra" + (quantidade*15.00));
					break;
					case 4 :
						
						System.out.println("Abacaxi");
						System.out.println("Valor total da compra" + (quantidade*15.00));
						break;
						
					default:
						System.out.println("Opção inválida");
						
				}
				
			case 3: 
				System.out.println("Cadastrar Nome ao Site");
				nome = leia.nextLine();
				System.out.println("Nome Cadastrado!" + nome);				
				break;
				
			case 4 : 
				System.out.println("Formas de pagamentos: 1 para Cartão de Crédito, 2 para Cartão de débito, 3 para pix"  );
				pagamento = leia.nextInt();
				switch (pagamento)  {
				
				case 1 :
					 System.out.println("Cartão de Crédito adicionado");
					 
					 break;
					 
				case 2 :
					System.out.println("Cartão de débito adicionado");
					break;
				case 3 :
					System.out.println("PIX adicionado!");
					break;
					default :
						System.out.println("Opção invalida");
				
				}
				
				
				break;
				
			case 5 :
				endereco = leia.nextLine();
				System.out.println("Endereço: Rua da Flores Nº33 Bairro Brasil"+ endereco);
				
				
				
			break;
			default :{
				System.out.println("Até Mais!!!");
				break;
				
			}}}}}

}
