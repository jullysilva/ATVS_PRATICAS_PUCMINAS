import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Supermercado {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int numMaxProdutos;
		TabelaHashProduto tabelaProdutos;
		int codigo;
		String nome;
		double preco;
		Produto produtoPesquisado;
		
		System.out.print("Informe o número máximo de produtos distintos que serão cadastrados no supermercado: ");
		numMaxProdutos = Integer.parseInt(entrada.readLine());
		tabelaProdutos = new TabelaHashProduto(numMaxProdutos);
		
		codigo = 0;
		while (codigo >= 0) {
			System.out.println("Informe os dados do produto que será cadastrado. Digite \'-1\' no campo \"código de barras\" quando desejar encerrar o cadastramento de produtos.");
			System.out.print("Informe o código de barras do produto: ");
			codigo = Integer.parseInt(entrada.readLine());
			if (codigo >= 0) {
				System.out.print("Informe seu nome: ");
				nome = entrada.readLine();
				System.out.print("Informe seu preço unitário: ");
				preco = Double.parseDouble(entrada.readLine());
				if ((tabelaProdutos.inserir(new Produto(codigo, nome, preco))) == -1){
					System.out.println("Não foi possível inserir o produto. Já existe produto armazenado na tabela com o mesmo código de barras do produto informado.");
					break;
				}
			}
		}
		
		System.out.print("\nInforme o código de barras do produto a ser pesquisado: ");
        codigo = Integer.parseInt(entrada.readLine());
        produtoPesquisado = tabelaProdutos.pesquisar(codigo);
        if (produtoPesquisado != null)
        {
            System.out.println("Nome do produto pesquisado: " + produtoPesquisado.getNome());
            System.out.println("Preço unitário do produto pesquisado: " + produtoPesquisado.getPrecoUnitario());
        }
        else
        {
        	System.out.println("O produto não foi encontrado.");
        }
        System.out.print("\n\n**************************************************************************\n\n");
		tabelaProdutos.imprimir();

	}
}