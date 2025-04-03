public class Produto {

	private int codigoBarras;
    private String nome;
    private double precoUnitario;

    public Produto(int codigo, String nomeProduto, double precoUnidade)
    {
        this.setCodigoBarras(codigo);
        this.setNome(nomeProduto);
        this.setPrecoUnitario(precoUnidade);
    }

	/**
	 * @return the codigoBarras
	 */
	public int getCodigoBarras() {
		return codigoBarras;
	}

	/**
	 * @param codigoBarras the codigoBarras to set
	 */
	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the precoUnitario
	 */
	public double getPrecoUnitario() {
		return precoUnitario;
	}

	/**
	 * @param precoUnitario the precoUnitario to set
	 */
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
}