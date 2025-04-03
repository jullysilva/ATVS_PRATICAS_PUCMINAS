package mergesort;

import java.util.Scanner;

public class Supermercado {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int code;
		
		VetorProduto lista = new VetorProduto();
		Produto produto;
		
		produto = new Produto(5, "Batata", 1.50);
		lista.inserir(produto);
		produto = new Produto(1, "Mandioca", 4.50);
		lista.inserir(produto);
		produto = new Produto(7, "jiló", 3.50);
		lista.inserir(produto);
		produto = new Produto(4, "Jabuticaba", 8.50);
		lista.inserir(produto);
		produto = new Produto(3, "Cajá", 8.50);
		lista.inserir(produto);
		produto = new Produto(2, "Jabuti", 8.50);
		lista.inserir(produto);
		produto = new Produto(6, "Jaca", 8.50);
		lista.inserir(produto);
		
		lista.ordenar();
		lista.imprimir();
		
		System.out.print("\nDigite o código do produto: ");
		code = entrada.nextInt();
		produto = lista.localizar(code, 0, lista.quant);
		if(produto != null)
			System.out.print("Código: " + produto.getId() + "; Produto: " + produto.getNome() + "; Preço: " + produto.getPreço_uni() + " Total de comparações: " + lista.cont);
		else
			System.out.print("Não encontado ou não existe!");
		
		
	}
	
}

