public class Aluno {

	private int numMatricula; // número de matrícula do aluno.
    private String nome;      // nome do aluno.
    private double nota;      // nota do aluno.
    
    /// Construtor da classe.
    /// Esse construtor cria um novo objeto da classe Aluno atribuindo a esse objeto os seguintes valores:
    /// - numMatricula recebe o valor que foi passado através do parâmetro matricula.
    /// - nome recebe o valor que foi passado através do parâmetro nome.
    /// - nota recebe o valor que foi passado através do parâmetro nota.
    public Aluno(int matricula, String nome, double nota)
    {
        this.numMatricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }

    public void imprimir() {
    	System.out.println("Nome: " + nome);
    	System.out.println("N�mero de matr�cula: " + numMatricula);
    	System.out.println("Nota: " + nota);
    }
    
	/**
	 * @return the numMatricula
	 */
	public int getNumMatricula() {
		return numMatricula;
	}

	/**
	 * @param numMatricula the numMatricula to set
	 */
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
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
	 * @return the nota
	 */
	public double getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}
}