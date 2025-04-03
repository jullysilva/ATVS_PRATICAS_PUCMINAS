public class TabelaHashProduto {

	private int M;	

	//private ListaProduto[] tabelaProdutos; 
      private CelulaProduto[] tabelaProduto; 

	public TabelaHashProduto(int tamanho){
		int i = 0;
		this.M = tamanho;
		//this.tabelaProdutos = new ListaProduto[M];
		this.tabelaProduto = new CelulaProduto[M];
		while(i < M){
			//tabelaProdutos[i] = new ListaProduto();
			tabelaProduto[i] = null;
			i++;
		}
	}

	private int funcaoHash(int chave){ 
		return chave % M;
	}

	public int inserir(Produto produtoNovo){
		int i = funcaoHash(produtoNovo.getCodigoBarras());
		//ENDECERAMENTO COM LISTA ENCADEADA
		/*if(tabelaProdutos[i].localizar(produtoNovo.getCodigoBarras()) != null)
			return -1;
		else {
			tabelaProdutos[i].inserirFinal(produtoNovo);
			return i;
		}*/
		
		//HASH COM ENDERECAMENTO ABERTO
		CelulaProduto aux = new CelulaProduto();
		aux.item = produtoNovo;
		if(tabelaProduto[i] == null) {
			tabelaProduto[i] = aux;
			return i;
		}
		else {
			tabelaProduto[i+1] = aux;
			return 1+i;
		}
	}

	public Produto pesquisar(int codigoBarras){
		int i = funcaoHash(codigoBarras);
		//return tabelaProdutos[i].localizar(codigoBarras);
		
		if(tabelaProduto[i].item.getCodigoBarras() == codigoBarras)
			return tabelaProduto[i].item;
		else
			return tabelaProduto[i+1].item;
	}

	public void imprimir(){
		int i = 0;
		
		while(i < M){
			//tabelaProdutos[i].imprimir();

			System.out.print(tabelaProduto[i].item.getCodigoBarras() + " " + tabelaProduto[i].item.getNome() + " " + tabelaProduto[i].item.getPrecoUnitario() + "\n");
			i++;
		}
		
	}
}