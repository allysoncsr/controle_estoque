package entities;  // 1º criado o pacote entities

public class Produto {  // 2º criado a class produto, onde na classe produto abaixo foram criado os atributos nome, preco e quantidade
	                                                                               
	public String nome;
	public double preco;
	public int quantidade;
	
					// 3º foi criado um método para calcular o valor total do estoque
	
	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	
					// 4º foram criado duas operações que recebe quantidade (adiciona) e a outra que dar saída (remove)
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade; /* OBS. TEMOS QUANTIDADE COMO ATRIBUTO E TEMOS ABAIXO A QUANTIDADE COMO PARAMETRO. PARA DIFERENCIAR, USAMOS O THIS PARA REFERENCIAR O ATRIBUTO */
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade; /* OBS. TEMOS QUANTIDADE COMO ATRIBUTO E TEMOS ABAIXO A QUANTIDADE COMO PARAMETRO. PARA DIFERENCIAR, USAMOS O THIS PARA REFERENCIAR O ATRIBUTO */
	}
	
					// foi criado uma variável que vai usar a função toString no qual ela consegue ser formatada na forma que achar interessante, e somente ser chamada na class principal
	
	public String toString() {
		return nome
			 + " | R$" 
			 + String.format("%.2f", preco) // usamos o String.format formatar em duas casas decimais
			 + " | "
			 + quantidade
			 + " Unidade(s) | Total: R$"  // usamos o String.format formatar em duas casas decimais
			 + String.format("%.2f", valorTotalEmEstoque());
			 
	}
	
}


   