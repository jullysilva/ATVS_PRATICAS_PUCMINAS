public class NodoAluno {

	Aluno item;           // contém os dados do aluno armazenado no nodo da árvore.
	NodoAluno direita;    // referência ao nodo armazenado, na árvore, à direita do aluno em questão.
    NodoAluno esquerda;   // referência ao nodo armazenado, na árvore, à esquerda do aluno em questão.

    public NodoAluno(Aluno registro) {
    	item = registro;
    	direita = null;
    	esquerda = null;
    }
}
