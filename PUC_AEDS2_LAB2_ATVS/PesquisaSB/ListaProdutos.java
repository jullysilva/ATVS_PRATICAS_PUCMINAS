
public class ListaProdutos {

	public static final int TAM_MAX = 10;
	private Produto[] listaProduto = new Produto[TAM_MAX];
	public static int i;
	public int cont = 0;
	public int quant = 0;

	public void inserir(Produto produto) {
		for(i = 0; i < TAM_MAX; i++) {
			if(listaProduto[i] == null) {
				listaProduto[i] = produto;
				break;
			}
		}
		quant++;
		ordenar();
	}
	 
	public Produto localizar(int id, int inicio, int fim) {

		//PESQUISA BINÁRIA
		/*int meio = (inicio + fim)/2;
		if(inicio > fim)
			return null;
		if(id == listaProduto[meio].getId()) {
			cont++;	
			return listaProduto[meio];
		}
		else
			cont++;
		if(id > listaProduto[meio].getId())
			return localizar(id, meio+1, fim);
		if(id < listaProduto[meio].getId())
			return localizar(id, inicio, meio-1);
		return null;*/
		
		//PESQUISA SEUQENCIAL
		if(inicio == fim)
			return null;
		if(listaProduto[inicio].getId() == id)
			return listaProduto[inicio];
		else
			return localizar(id, inicio+1, fim);
		
	}
	
	public void ordenar() {
		Produto aux;
		
		i = 0;
		while(i < this.quant) {
			for(int j=1+i;j<this.quant;j++) {
				
				if(listaProduto[i].getId() > listaProduto[j].getId()) {
					aux = listaProduto[j];
					listaProduto[j] = listaProduto[i];
					listaProduto[i] = aux;
				}
			}
			i++;
		}
	}
	
	public void imprimir() {
		
		for(i = 0; i < this.quant; i++) {
			System.out.print("Codigo: " + listaProduto[i].getId() + "; Produto: " + listaProduto[i].getNome() + "; Preço: " + listaProduto[i].getPreço_uni() + "\n");
			if(listaProduto[i+1] == null)
				break;
		}
	}
}





