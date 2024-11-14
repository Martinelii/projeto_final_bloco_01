package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.CarrinhoController;
import ecommerce.model.Caderno;
import ecommerce.model.Caneta;

public class Menu {

	public static void main(String[] args) {
		CarrinhoController produto = new CarrinhoController();
		
		int numero, materias;
		String descricao, corTinta;
		float preco;
		
		int opcao, tipo = 0;
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
					do {
						System.out.println("Informe o produto:\n"
								+ "[1] - Caderno\n"
								+ "[2] - Caneta\n");
						tipo = leia.nextInt();
					}while(tipo < 1 && tipo > 2);
					
					System.out.println("Informe o preço R$: ");
					preco = leia.nextFloat();
					
					switch(tipo) {
						case 1 ->{
							System.out.println("Informe a Quantidade de Materias que tem o caderno");
							materias = leia.nextInt();
							descricao = "Caderno";
							produto.cadastrar(new Caderno(produto.gerarId(),descricao,preco,materias));
						}
						case 2 ->{
							System.out.println("Informe a cor da tinta");
							leia.skip("\\R?");
							corTinta = leia.nextLine();
							descricao = "Caneta";
							produto.cadastrar(new Caneta(produto.gerarId(),descricao,preco,corTinta));
							
						}
					}
					continuar();
					break;
					
				case 2:
					System.out.println("Listar");
					produto.listar();
					continuar();
					break;
					
				case 3:
					System.out.println("Buscar");
					System.out.println("Digite o numero do produto: ");
					numero = leia.nextInt();
					produto.buscar(numero);
					continuar();
					break;
					
				case 4:
					System.out.println("Atualizar");
					
					System.out.println("Digite o numero do produto: ");
					numero = leia.nextInt();
					
					var buscarProduto = produto.procurarCollecao(numero);
					
					if(buscarProduto != null) {
						System.out.println("Informe o preço R$: ");
						preco = leia.nextFloat();
						
						if(buscarProduto.getDescricao() == "Caderno") {
							System.out.println("Informe a Quantidade de Materias que tem o caderno");
							materias = leia.nextInt();
							descricao = "Caderno";
							produto.atualizar(new Caderno(numero,descricao,preco,materias));
						}else if(buscarProduto.getDescricao() == "Caneta") {
							System.out.println("Informe a cor da tinta");
							corTinta = leia.nextLine();
							descricao = "Caneta";
							produto.atualizar(new Caneta(numero,descricao,preco,corTinta));
						}
					}else {
						System.out.println("A Produto não foi encontrada!");
					}
					continuar();
					break;
					
				case 5:
					System.out.println("Excluir ");
					System.out.println("Digite o numero do produto: ");
					numero = leia.nextInt();
					produto.excluir(numero);
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
