package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
		int opcao;
		Scanner leia = new Scanner(System.in);
		
		while(true) {
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("                    PAPELARIA GEN                    ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastra Produto                     ");
			System.out.println("            2 - Listar Produtos                      ");
			System.out.println("            3 - Buscar Produto                       ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Excluir Produto                      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("_____________________________________________________");
			System.out.println("Selecione uma opção:                                 "); 
			System.out.println("                                                     ");
			
			try {
				opcao = leia.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("Digite um valor Inteiro");	
				leia.next();
				opcao = 0;
			}
				
			
			
			if(opcao == 9) {
				System.out.println("\nPapelaria Gen, Obrigado!! ");
				leia.close();
				System.exit(0);
			}
			
			
			switch(opcao) {
				case 1:
					System.out.println("Opção: " + opcao); //provisorio até fazer classes
					continuar();
					break;
					
				case 2:
					System.out.println("Opção: " + opcao); //provisorio até fazer classes
					continuar();
					break;
					
				case 3:
					System.out.println("Opção: " + opcao); //provisorio até fazer classes
					continuar();
					break;
					
				case 4:
					System.out.println("Opção: " + opcao); //provisorio até fazer classes
					continuar();
					break;
					
				case 5:
					System.out.println("Opção: " + opcao); //provisorio até fazer classes
					continuar();
					break;
					
				default:
					System.out.println("Opção Invalida!!!");
					continuar();
					break;
			}
		}

	}
	
	public static void continuar() {
		try {
			System.out.println("\n\nPressione Enter para continuar...");
			System.in.read();
			
		} catch(IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!!");
		}
	}

}
