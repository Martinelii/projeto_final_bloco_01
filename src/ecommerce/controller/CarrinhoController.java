package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.CarrinhoRepository;

public class CarrinhoController implements CarrinhoRepository{
	
	//atributos
	int numero;
	private ArrayList<Produto> carrinho = new ArrayList<Produto>();

	
	//metodos do contrato (interface)
	@Override
	public void cadastrar(Produto produto) {
		carrinho.add(produto);
		System.out.println("Novo Produto Nº " + produto.getNumero() + " Cadastrado com Sucesso!!");
	}

	@Override
	public void listar() {
		for(var produto : carrinho) {
			produto.visualizar();
		}
		
	}

	@Override
	public void buscar(int numero) {
		var produto = procurarCollecao(numero);
		
		if(produto != null) {
			System.out.println("Produto Nº " + numero + " Encontrada com sucesso!!");
			produto.visualizar();
		}else {
			System.out.println("Produto Nº " + numero + " não foi encontrado!!");
		}
	}

	@Override
	public void atualizar(Produto produto) {
		var procurar = procurarCollecao(produto.getNumero());
		
		if(procurar != null) {
			carrinho.set(carrinho.indexOf(procurar), produto);
			System.out.println("Objeto Atualizado com sucesso!!");
		}else {
			System.out.println("Objeto não encontrado!!");
		}
		
	}

	@Override
	public void excluir(int numero) {
		var produto = procurarCollecao(numero);
		
		if(produto != null) {
			if(carrinho.remove(produto) == true) {
				System.out.println("Produto Nº " + numero + " foi removido com sucesso!!");
			}
		}else {
			System.out.println("Produto não encontrado!!");
		}
	}	
	
	public Produto procurarCollecao(int numero) {
		for(var produto : carrinho) {
			if(produto.getNumero() == numero) {
				return produto;
			}
		}
		return null;
	}
	
	public int gerarId() {
		return ++numero;
	}
	
}
