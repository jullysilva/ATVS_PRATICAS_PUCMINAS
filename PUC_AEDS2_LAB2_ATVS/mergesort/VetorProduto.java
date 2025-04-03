package mergesort;

public class VetorProduto {

	public static final int TAM_MAX = 7;
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
	}
	 
	public Produto localizar(int id, int inicio, int fim) {

		int meio = (inicio + fim)/2;
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
		return null;
		
	}
	
	public void ordenar() {
		MergeSort(listaProduto, 0, TAM_MAX-1);
	}
	
	public void MergeSort(Produto listaProduto[], int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim)/2;
			MergeSort(listaProduto, inicio, meio);
			MergeSort(listaProduto, meio+1, fim);
			intercalar(inicio, meio+1, fim);
		}
	}
	
	public void intercalar(int esq, int meio, int dir) {
		Produto[] temp = new Produto[listaProduto.length+1];
		int i, esq_end, num_elements, tmp_pos;
		esq_end = (meio - 1);
		tmp_pos = esq;
		num_elements = (dir - esq + 1);
		while ((esq <= esq_end) && (meio <= dir)){
			if (listaProduto[esq].getId() <= listaProduto[meio].getId())
				temp[tmp_pos++] = listaProduto[esq++];
			else
				temp[tmp_pos++] = listaProduto[meio++];
		}
		while (esq <= esq_end)
			temp[tmp_pos++] = listaProduto[esq++];
		while (meio <= dir)
			temp[tmp_pos++] = listaProduto[meio++];
		for (i = 0; i < num_elements; i++){
			listaProduto[dir] = temp[dir];
			dir--;
		}
	}
	
	public void imprimir() {
		
		for(i = 0; i < this.quant; i++) {
			if(listaProduto[i] != null)
				System.out.print("Codigo: " + listaProduto[i].getId() + "; Produto: " + listaProduto[i].getNome() + "; Preço: " + listaProduto[i].getPreço_uni() + "\n");
		}
	}
}
