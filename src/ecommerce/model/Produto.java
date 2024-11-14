package ecommerce.model;

public abstract class Produto {
	//atributos
	private int numero;
	private String descricao;
	private float preco;

	
	//construtor
	public Produto(int numero,String descricao, float preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.preco = preco;
		
	}
	
	//getters e setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	//metodos
	public void visualizar() {
		System.out.println("\n____________________________________");
		System.out.println("Nº: " + numero);
		System.out.println("Produto: " + descricao);
		System.out.println("Preço: R$" + preco);
	}
}
