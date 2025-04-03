public class ListaProduto {

	private CelulaProduto primeiro; // referência à primeira célula da lista encadeada de produtos.
    								// a primeira célula da lista encadeada de produtos corresponderá ao nodo-cabeça, utilizado apenas para controle.
	private CelulaProduto ultimo;   // referência à última célula da lista encadeada de produtos.

	// construtor que inicializa o nodo-cabeça da lista encadeada.
	public ListaProduto()
	{
		// criação do nodo-cabeça da lista de produtos. O nodo-cabeça é utilizado apenas para controle.
		// o nodo-cabeça é o primeiro nodo da lista encadeada.
		primeiro = new CelulaProduto();

		// quando a lista encadeada é criada, o nodo-cabeça é também o último nodo da lista encadeada.
		ultimo = primeiro;
	}

	// insere o item passado como parâmetro para esse método no final da lista encadeada.
	public void inserirFinal(Produto novoProduto)
	{
		CelulaProduto aux = new CelulaProduto();
		
		// inserção de uma nova célula ao final da lista encadeada.
		ultimo.proximo = aux;
		
		// inserção do produto, passado como parâmetro para esse método, no final da lista encadeada.
		aux.item = novoProduto;
				
		// atualização do ponteiro de controle "ultimo" para a última célula da lista encadeada.
		ultimo = ultimo.proximo;
	}
	
	// retira da lista encadeada o produto cujo código de barras corresponde ao que foi passado como parâmetro para esse método. Se o produto tiver sido localizado na lista encadeada e retirado com sucesso, esse método deve retornar o produto retirado. Caso contrário, esse método deve retornar null.
    public Produto retirar(int codigoBarras)
    {
        CelulaProduto aux, anterior;

        // o ponteiro anterior apontará sempre para a célula, da lista encadeada, anterior à célula que estiver sendo inspecionada. 
        anterior = primeiro;

        // o ponteiro aux será utilizado para percorrermos a lista encadeada a procura da célula que deverá ser retirada. 
        aux = primeiro.proximo;

        // enquanto o ponteiro aux não tiver percorrido toda a lista encadeada...
        while (aux != null)
        {
            // se o ponteiro aux estiver apontando para o item que deverá ser retirado...
            if (aux.item.getCodigoBarras() == codigoBarras)
            {
                // utiliza-se o ponteiro anterior para "pular" a célula que deve ser retirada da lista encadeada.
                anterior.proximo = aux.proximo;

                if (aux == ultimo)
                {
                    // se a célula retirada da lista encadeada era a última, atualizamos o ponteiro de controle "ultimo" para apontar para a célula anterior à que foi retirada.
                    // a célula anterior à que foi retirada passa a ser a última célula da lista encadeada.
                    ultimo = anterior;
                }
                return aux.item;
            }
            else
            {
                // se ainda não encontramos o item que deverá ser retirado, avançamos na lista encadeada.
                // os ponteiros anterior e aux devem avançar na lista encadeada.
                anterior = aux;
                aux = aux.proximo;
            }
        }
        return null;
    }
    
    // localiza, na lista encadeada, o produto cujo código de barras corresponde ao que foi passado como parâmetro para esse método. Se o produto tiver sido localizado na lista encadeada, esse método deve retornar o produto localizado. Caso contrário, esse método deve retornar null.
    public Produto localizar(int codigoBarras)
    {
        CelulaProduto aux;

        // o ponteiro aux será utilizado para percorrermos a lista encadeada a procura do item desejado. 
        aux = primeiro.proximo;

        // enquanto o ponteiro aux não tiver percorrido toda a lista encadeada...
        while (aux != null)
        {
            // se o ponteiro aux estiver apontando para o item desejado...
            if (aux.item.getCodigoBarras() == codigoBarras)
            {
                // retorna o item desejado.
                return aux.item;
            }
            else
            {
                // se ainda não encontramos o item desejado, avançamos na lista encadeada.
                aux = aux.proximo;
            }
        }
        return null;
    }

    // verifica se a lista encadeada está vazia. Em caso afirmativo, retorna true e em caso negativo retorna false.
    public Boolean listaVazia()
    {
        // a lista está vazia se ela só apresenta o nodo-cabeça.
        if (primeiro == ultimo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // imprimi, para todos os produtos armazenados na lista encadeada, seu código de barras, seu nome, seu preço unitário. A ordem de impressão deve ser do primeiro nodo da lista para o último.
    public void imprimir()
    {
        CelulaProduto aux;

        // o ponteiro aux será utilizado para percorrermos a lista encadeada.
        aux = primeiro.proximo;

        if(aux != null)
        {
            // enquanto o ponteiro aux não tiver percorrido toda a lista encadeada...
            while (aux != null)
            {
                // imprimi os dados do produto apontado pelo ponteiro aux.
                System.out.println("Código de barras: " + aux.item.getCodigoBarras() + ", Nome: " + aux.item.getNome() + ", Preço unitário: " + aux.item.getPrecoUnitario());
                
                // avançamos na lista encadeada.
                aux = aux.proximo;
            }
        }
    }    
}