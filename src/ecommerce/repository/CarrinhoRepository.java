package ecommerce.repository;

import ecommerce.model.Produto;

public interface CarrinhoRepository {
	
	//CRUD
	public abstract void cadastrar(Produto produto); //Create
	public abstract void listar(); //Read
	public abstract void buscar(int numero); //Read
	public abstract void atualizar(Produto produto); //Update
	public abstract void excluir(int numero); //Delete
}
