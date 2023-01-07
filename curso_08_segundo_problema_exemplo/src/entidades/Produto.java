package entidades;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	public Produto() {
		super();
	}
	
	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public double valorTotalNoEstoque() {
		return quantidade * preco;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	@Override
	public String toString() {
		return "Produto:" + nome + "\n" + 
			   "Quantidade: " + quantidade + "\n" + 
			   "Valor Total em Estoque: R$ " + String.format("%.2f",this.valorTotalNoEstoque()) + "\n";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
