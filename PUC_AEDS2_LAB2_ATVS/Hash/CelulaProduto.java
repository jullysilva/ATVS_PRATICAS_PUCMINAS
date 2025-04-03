public class CelulaProduto {

		Produto item;
		CelulaProduto proximo;
		
		CelulaProduto(){
			item = new Produto(0, "", 0.0);
			proximo = null;
		}
}