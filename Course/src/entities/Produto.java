package entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}

	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome
		+ ", $ "
		+ String.format("%.2f", preco)
		+ ", "
		+ quantidade
		+ " Total de unidades: $ "
		+ String.format("%.2f", valorTotalEmEstoque());

				
	}

}
