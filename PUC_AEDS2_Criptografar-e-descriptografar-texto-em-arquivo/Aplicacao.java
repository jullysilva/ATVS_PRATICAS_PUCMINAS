import java.util.Scanner;

public class Aplicacao {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArquivoTextoEscrita type = new ArquivoTextoEscrita();
		ArquivoTextoLeitura read = new ArquivoTextoLeitura();
		Criptografe cript = new Criptografe();
		String text, name_arc, cod, decod;
		int qtde = 0;
		
		//É DADO O NOME PARA O ARQUIVO ONDE SERÁ GRAVADO O TEXTO DE ENTRADA
		System.out.print("Type the name of archive: ");
		name_arc = input.nextLine();
		type.abrirArquivo(name_arc);
		
		//ESTÁ SENDO FEITO A ENTRADA DO TEXTO, E SÓ IRÁ PARAR QUANDO O USUÁRIO DIGITAR A PALAVRA FIM
		//ASSIM QUE TERMINAR, O ARQUIVO SERÁ FECHADO
		System.out.print("Type the text, type 'fim.' to finish: ");
		do {
			text = input.nextLine();
			type.escrever(text);
			qtde += text.length();
		}while(!text.equals("fim."));
		type.fecharArquivo();
		read.abrirArquivo(name_arc);
		
		//AQUI ESTÁ SENDO FEITO A CHAMADA PARA SER IMPRESSSO O TEXTO SALVO NO AQRUIVO TXT
		System.out.print("\nText written at the archive: ");
		do {
			text = read.ler();
			
			if(text == null)
				System.out.print("\n\t\tText imprinted completely!");
			else
				System.out.print("\n\t" + text);
		}while(text != null);
		read.fecharArquivo();
		
		//PROCESSO PARA CRIPTOGRAFAR O TEXTO ENTRADO ANTERIORMENTE
		//É PEDIDO AO USUÁRIO UM NOVO NOME PARA ARMAZENA O TEXTO CRIPTOGRAFADO
		//É PASSADO POR PARÂMETRO O NOME DO ARQUIVO QUE VAI SER CRIPTOGRAFADO, A QUANTIDADE DE LETRAS ARAMZANADOS NO
		//ARQUIVO, E O NOME DO NOVO ARQUIVO
		//LOGO DEPOIS É IMPRESSO O TEXTO CRIPTOGRAFADO
		System.out.print("\nName of a new archive to encrypt: ");
		cod = input.nextLine();
		cript.criptografar(name_arc, qtde, cod);
		System.out.print("Text crypted: ");
		read.abrirArquivo(cod);
		do {
			text = read.ler();
			
			if(text == null)
				System.out.print("\n\n");
			else
				System.out.print("\n\t" + text);
		}while(text != null);
		read.fecharArquivo();
		
		//PROCESSO PARA DESCRIPTOGRAFAR O TEXTO CRIPTOGRAFADO
		//É PEDIDO AO USUÁRIO UM NOVO NOME PARA ARMAZENA O TEXTO DESCRIPTOGRAFADO
		//É PASSADO POR PARÂMETRO O NOME DO ARQUIVO QUE VAI SER DESCRIPTOGRAFADO, A QUANTIDADE DE LETRAS ARAMZANADOS NO
		//ARQUIVO, E O NOME DO NOVO ARQUIVO
		//LOGO DEPOIS É IMPRESSO O TEXTO DESCRIPTOGRAFADO, SENDO QUE ELE TEM SER IGUAL AO TEXTO ORIGINAL,
		//ENTRADO LOGO DO COMEÇO
		System.out.print("\nName of the new archive to decrypt: ");
		decod = input.nextLine();
		cript.descriptografar(cod, qtde, decod);
		System.out.print("Text decrypted: ");
		read.abrirArquivo(decod);
		do {
			text = read.ler();
			
			if(text == null)
				System.out.print("\n\n");
			else
				System.out.print("\n\t" + text);
		}while(text != null);
		read.fecharArquivo();
	}

}
