package ecommerce.model;

public class Caneta extends Produto {
	//atributos
	private String corTinta;
	
	//construtor
	public Caneta(int numero, String descricao, float preco, String corTinta) {
		super(numero, descricao, preco);
		this.corTinta = corTinta;
	}
	
	//getters e setters
	public String getCorTinta() {
		return corTinta;
	}
	public void setCorTinta(String corTinta) {
		this.corTinta = corTinta;
	}
	
	//metodos
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Cor da Tinta: " + corTinta);
		System.out.println("____________________________________\n");
	}
}
