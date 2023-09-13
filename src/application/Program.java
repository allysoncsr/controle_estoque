package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto; // class importada 

public class Program {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto(); 			// declaro uma variável chamada produto para receber a class chamada produto (como está importado lá em cima)
		System.out.println("INSIRA OS DADOS DO PRODUTO ");
		System.out.print("Nome: "); 					// solicito para digitar o nome
		produto.nome = sc.nextLine(); 					//onde será armazenado no objeto produto que está ligado a class Produto
		System.out.println("Preço: ");					// solicito para digitar preço
		produto.preco = sc.nextDouble();				//onde será armazenado no objeto produto que está ligado a class Produto
		System.out.println("Quantidade no Estoque: ");  // solicito para digitar quantidade
		produto.quantidade = sc.nextInt();				//onde será armazenado no objeto produto que está ligado a class Produto
		
	/*	System.out.println(produto.nome + " | " + produto.preco + " | " + produto.quantidade); */
		
		System.out.println(); // criado apenas para pular uma linha
		System.out.println("DADOS ATUALIZADOS: " + produto);
		
		System.out.println(); // criado apenas para pular uma linha
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(); // criado apenas para pular uma linha
		
				// abaixo será solicitado a quantidade a ser add
		
		System.out.println("INSIRA A QUANTIDADE DE PRODUTOS A SER ADICIONADO AO ESTOQUE: ");
		int quantidade = sc.nextInt(); 	// a variavel int quantidade vai o que foi digitado
		produto.addProdutos(quantidade); 	// o produto está chamando o metodo addProduto (que foi soma criada) com o parametro quantidade
		
		System.out.println();
		System.out.println("DADOS ATUALIZADOS: " + produto);
	
		System.out.println("INSIRA A QUANTIDADE DE PRODUTOS A SER REMOVIDO DO ESTOQUE: ");
		quantidade = sc.nextInt();	// a variavel int quantidade vai o que foi digitado
		produto.removerProdutos(quantidade);	// o produto está chamando o metodo addProduto (que foi soma criada) com o parametro quantidade
		
		System.out.println();
		System.out.println("DADOS ATUALIZADOS: " + produto);
		
		
		
		sc.close();
	}
}
