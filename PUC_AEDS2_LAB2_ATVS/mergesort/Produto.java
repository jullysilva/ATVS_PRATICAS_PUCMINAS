package mergesort;

public class Produto {
	
	private int id;
	private String nome;
	private double preço_uni;
	
	public Produto() {
		this.id = 0;
		this.nome = " ";
		this.preço_uni = 0.0;
	}
	
	public Produto(int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preço_uni = preco;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço_uni() {
		return preço_uni;
	}
	public void setPreço_uni(double preço_uni) {
		this.preço_uni = preço_uni;
	}
	
	
	
}

