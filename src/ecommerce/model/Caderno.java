package ecommerce.model;

public class Caderno extends Produto{
	//atributos
	private int materias;
	
	//construtor
	public Caderno(int numero, String descricao, float preco, int materias) {
		super(numero, descricao, preco);
		this.materias = materias;
	}
	
	//getter e setter
	public int getMaterias() {
		return materias;
	}
	public void setMaterias(int materias) {
		this.materias = materias;
	}
	
	//metodos
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade de materias: " + materias);
		System.out.println("____________________________________\n");
	}
}
